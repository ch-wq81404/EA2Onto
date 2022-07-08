package com.util;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import com.bean.UML.*;
import com.bean.UML.XMI.XMIContent;

public class ReqUtil {

	public static UMLDiagram getDiagram(XMI xmi) {
		return Optional.ofNullable(xmi).map(XMI::getXMIContent).map(XMIContent::getDiagram)
				.map(diagrams -> diagrams.stream()
						.filter(diagram -> diagram.getName().contains(NameEnum.Req.name())).findFirst().get())
				.orElse(null);
	}

	public static List<UMLClassifierRole> getAllRequirements(XMI xmi) {
		UMLPackage p = XMIUtil.getTopPackage(xmi);
		return p.getUmlNamespaceOwnedElement().getUmlCollaboration().getNamespaceOwnedElement().getClassifierRole()
				.stream().map(umlClassifierRole -> {
					String name = Optional.ofNullable(umlClassifierRole)
							.map(UMLClassifierRole::getModelElementStereotype)
							.map(UMLModelElementStereotype::getStereotype).map(UMLStereotype::getName).orElse(null);
					if (name != null && name.equals("requirement")) {
						return umlClassifierRole;
					}
					return null;
				}).filter(role -> role != null).collect(Collectors.toList());
	}

	public static List<UMLTaggedValue> getAllTaggedValue(XMI xmi) {
		return xmi.getXMIContent().getTaggedValue();
	}

	/**
	 * 
	 * @param xmi
	 * @param id
	 * @return {"id":需求的id,"text":需求的text}
	 */
	public static HashMap<String, String> getReqContentByID(XMI xmi, String id) {
		HashMap<String, String> m = new HashMap<String, String>();
		List<UMLTaggedValue> taggedValues = getAllTaggedValue(xmi).stream()
				.filter(umlTaggedValue -> umlTaggedValue.getModelElement().equals(id)).collect(Collectors.toList());
		m.put("id", taggedValues.stream().filter(umlTaggedValue -> umlTaggedValue.getTag().equals("id")).findFirst()
				.get().getValue());
		m.put("text", taggedValues.stream().filter(umlTaggedValue -> umlTaggedValue.getTag().equals("text")).findFirst()
				.get().getValue());
		return m;
	}

	/**
	 * dempose：在dependency的基础上修改stereotype为dempose
	 * 
	 * @param xmi
	 * @return
	 */
	public static List<UMLDependency> getAllDempose(XMI xmi) {
		UMLPackage p = XMIUtil.getTopPackage(xmi);
		return p.getUmlNamespaceOwnedElement().getUmlDependency().stream().map(umlDependency -> {
			String name = Optional.ofNullable(umlDependency).map(UMLDependency::getModelElementStereotype)
					.map(UMLModelElementStereotype::getStereotype).map(UMLStereotype::getName).orElse(null);
			if (name != null && name.equals("dempose")) {
				return umlDependency;
			}
			return null;
		}).filter(umlDependency -> umlDependency != null).collect(Collectors.toList());
	}

	/**
	 * dempose：在dependency的基础上修改stereotype为deriveReqt
	 * 
	 * @param xmi
	 * @return
	 */
	public static List<UMLDependency> getAllDerive(XMI xmi) {
		UMLPackage p = XMIUtil.getTopPackage(xmi);
		return p.getUmlNamespaceOwnedElement().getUmlDependency().stream().map(umlDependency -> {
			String name = Optional.ofNullable(umlDependency).map(UMLDependency::getModelElementStereotype)
					.map(UMLModelElementStereotype::getStereotype).map(UMLStereotype::getName).orElse(null);
			if (name != null && name.equals("deriveReqt")) {
				return umlDependency;
			}
			return null;
		}).filter(umlDependency -> umlDependency != null).collect(Collectors.toList());
	}

	/**
	 * 
	 * @param xmi
	 * @param dependency
	 * @return {"source":边的起点需求id,"end":边的终点需求id}
	 */
	public static HashMap<String, String> getPointsOfDependency(XMI xmi, UMLDependency dependency) {
		HashMap<String, String> m = new HashMap<String, String>();
		List<UMLClassifierRole> requirements = getAllRequirements(xmi);
		String value = requirements.stream()
				.filter(requirement -> requirement.getXmiId().equals(dependency.getClient())).findFirst().get()
				.getXmiId();
		m.put("source", getReqContentByID(xmi, value).get("id"));
		value = requirements.stream().filter(requirement -> requirement.getXmiId().equals(dependency.getSupplier()))
				.findFirst().get().getXmiId();
		m.put("end", getReqContentByID(xmi, value).get("id"));
		return m;
	}

	public static List<UMLClassifierRole> getRequirementsByOwnerID(XMI xmi, UMLDiagram owner) {
		// TODO Auto-generated method stub
		List<UMLClassifierRole> roles = getAllRequirements(xmi);
		return roles.stream().filter(role -> isOwnedByDiagram(role.getXmiId(), owner)).collect(Collectors.toList());
	}

	private static boolean isOwnedByDiagram(String roleID, UMLDiagram owner) {
		// TODO Auto-generated method stub

		return Optional.ofNullable(owner).map(UMLDiagram::getDiagramElement)
				.map(UMLDiagramElement::getDiagramElementSub).get().stream()
				.anyMatch(sub -> sub.getSubject().equals(roleID));
	}

}
