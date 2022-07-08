package com.util;

//import  com.ecnu.sei.bean.xmi.XMI;
//import org.apache.commons.lang.StringUtils;

import com.bean.UML.*;
import com.bean.UML.XMI.XMIContent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BDDUtil {

	public static UMLDiagram getDiagram(XMI xmi) {
		return Optional.ofNullable(xmi).map(XMI::getXMIContent)
				.map(XMIContent::getDiagram).map(diagrams -> diagrams.stream()
						.filter(diagram -> diagram.getName().contains(NameEnum.BDD.name())).findFirst().get())
				.orElse(null);
	}

	public static List<UMLClass> getAllBlocks(XMI xmi) {
		UMLPackage p = XMIUtil.getTopPackage(xmi);
		return Optional.ofNullable(p).map(UMLPackage::getUmlNamespaceOwnedElement)
				.map(UMLNamespaceOwnedElement::getUmlClasses).get().stream().map(umlClass -> {
					String s = Optional.ofNullable(umlClass).map(UMLClass::getUmlModelElementStereotype)
							.map(UMLModelElementStereotype::getStereotype).map(UMLStereotype::getName).orElse(null);
					if (s != null && s.equals("block")) {
						return umlClass;
					}
					return null;
				}).filter(c -> c != null).collect(Collectors.toList());
	}

	public static List<UMLClass> getBlocksOfDiagram(XMI xmi, UMLDiagram diagram) {
		return getAllBlocks(xmi).stream().filter(b -> isOwnedByDiagram(b.getXmiId(), diagram))
				.collect(Collectors.toList());
	}

	private static boolean isOwnedByDiagram(String roleID, UMLDiagram owner) {
		// TODO Auto-generated method stub

		return Optional.ofNullable(owner).map(UMLDiagram::getDiagramElement)
				.map(UMLDiagramElement::getDiagramElementSub).get().stream()
				.anyMatch(sub -> sub.getSubject().equals(roleID));
	}

	/**
	 * library: 用户引入的类型库 cs：用户自定义的类型
	 * 
	 * @param xmi
	 * @return
	 */
	public static List<String> getValueTypes(XMI xmi) {
		List<String> rlt = new ArrayList<String>();
		rlt.add("void");
		UMLPackage p = XMIUtil.getPackage(xmi, NameEnum.valueType);
		UMLPackage library = Optional.ofNullable(p).map(UMLPackage::getUmlNamespaceOwnedElement)
				.map(UMLNamespaceOwnedElement::getUmlPackage).get().stream().findFirst().orElse(null);
		if (library != null) {
			rlt.addAll(library.getUmlNamespaceOwnedElement().getUmlClasses().stream().map(c -> c.getName())
					.collect(Collectors.toList()));
		}
		List<UMLClass> cs = Optional.ofNullable(p).map(UMLPackage::getUmlNamespaceOwnedElement)
				.map(UMLNamespaceOwnedElement::getUmlClasses).orElse(null);
		if (cs != null)
			rlt.addAll(cs.stream().map(c -> c.getName()).collect(Collectors.toList()));
		return rlt;
	}

	public static List<UMLOperation> getOperationsOfBlock(XMI xmi, String c) {
		UMLClass umlClass = getAllBlocks(xmi).stream().filter(b -> b.getName().equals(c)).findFirst().get();
		return Optional.ofNullable(umlClass).map(UMLClass::getUmlClassifierFeature)
				.map(UMLClassifierFeature::getOperation).orElse(null);
	}

	public static List<UMLAttribute> getAttributesOfBlock(XMI xmi, String c) {
		UMLClass umlClass = getAllBlocks(xmi).stream().filter(b -> b.getName().equals(c)).findFirst().get();
		return Optional.ofNullable(umlClass).map(UMLClass::getUmlClassifierFeature)
				.map(UMLClassifierFeature::getAttribute).orElse(null);
	}

	public static List<UMLGeneralization> getAllGeneralizations(XMI xmi) {
		UMLPackage p = XMIUtil.getTopPackage(xmi);
		return Optional.ofNullable(p).map(UMLPackage::getUmlNamespaceOwnedElement)
				.map(UMLNamespaceOwnedElement::getUmlGeneralizations).orElse(null);
	}

	/**
	 * 
	 * @param xmi
	 * @return 组成链接 havePart 或者 isPartOf
	 */
	public static List<UMLAssociation> getAllAggregations(XMI xmi) {
		UMLPackage p = XMIUtil.getTopPackage(xmi);
		return p.getUmlNamespaceOwnedElement().getUmlAssociations().stream().map(a -> {
			String name = Optional.ofNullable(a).map(UMLAssociation::getModelElementTaggedValue)
					.map(taggedValue -> XMIUtil.getTaggedValueByTag("ea_type", taggedValue)).orElse(null);
			if (name != null && name.equals("Aggregation")) {
				return a;
			}
			return null;
		}).filter(a -> a != null).collect(Collectors.toList());
	}

	/**
	 * 
	 * @param xmi
	 * @return 一般链接 commonRelation
	 */
	public static List<UMLAssociation> getAllConnector(XMI xmi) {
		UMLPackage p = XMIUtil.getTopPackage(xmi);
		return p.getUmlNamespaceOwnedElement().getUmlAssociations().stream().map(a -> {
			String name = Optional.ofNullable(a).map(UMLAssociation::getModelElementTaggedValue)
					.map(taggedValue -> XMIUtil.getTaggedValueByTag("ea_type", taggedValue)).orElse(null);
			if (name != null && name.equals("Connector")) {
				return a;
			}
			return null;
		}).filter(a -> a != null).collect(Collectors.toList());
	}

	/**
	 * 
	 * @param xmi
	 * @param aggregation
	 * @return keySet{sourceI, SourceT, targetI, TargetT]
	 */
	public static HashMap<String, String> getInstanceFromAssociation(XMI xmi,
			UMLModelElementTaggedValue umlModelElementTaggedValue) {
		HashMap<String, String> rlt = new HashMap<String, String>();
		String tag=XMIUtil.getTaggedValueByTag("lt", umlModelElementTaggedValue);
		if(tag!=null)
		rlt.put("sourceI",tag.substring(1));
		else rlt.put("sourceI",null);
		rlt.put("SourceT", XMIUtil.getTaggedValueByTag("ea_sourceName", umlModelElementTaggedValue));
		tag=XMIUtil.getTaggedValueByTag("rt", umlModelElementTaggedValue);
		if(tag!=null)
		rlt.put("targetI", tag.substring(1));
		else rlt.put("targetI", null);
		rlt.put("TargetT", XMIUtil.getTaggedValueByTag("ea_targetName", umlModelElementTaggedValue));
		return rlt;
	}

	public static List<UMLAssociation> getAssociationsOfDiagram(UMLDiagram diagram, List<UMLAssociation> list) {
		// TODO Auto-generated method stub
		return list.stream().filter(a -> isOwnedByDiagram(a.getXmiId(), diagram)).collect(Collectors.toList());
	}

	public static List<UMLGeneralization> getGeneralizationsOfDiagram(UMLDiagram diagram,
			List<UMLGeneralization> list) {
		// TODO Auto-generated method stub
		return list.stream().filter(a -> isOwnedByDiagram(a.getXmiId(), diagram)).collect(Collectors.toList());
	}

}
