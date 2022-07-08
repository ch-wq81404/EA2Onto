package com.util;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.bean.UML.*;
import com.bean.UML.XMI.XMIContent;
public class ActUtil {

	public static UMLDiagram getDiagram(XMI xmi) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(xmi).map(XMI::getXMIContent)
				.map(XMIContent::getDiagram).map(diagrams -> diagrams.stream()
						.filter(diagram -> diagram.getName().contains(NameEnum.Act.name())).findFirst().get())
				.orElse(null);
	}
	
	public static List<UMLActionState> getAllActionState(XMI xmi){
		UMLPackage p = XMIUtil.getTopPackage(xmi);
		return Optional.ofNullable(p).map(UMLPackage::getUmlNamespaceOwnedElement).map(UMLNamespaceOwnedElement::getActivityModel)
				.map(UMLActivityModel::getStateMachineTop).map(UMLStateMachineTop::getCompositeState).map(UMLCompositeState::getCompositeStateSubstate)
				.map(UMLCompositeStateSubstate::getUmlActionState).orElse(null);
		
	}
	
	public static List<UMLActionState> getAllActPartition(XMI xmi){
		return getAllActionState(xmi).stream().map(action -> {
			String s = XMIUtil.getTaggedValueByTag("ea_stype", action.getModelElementTaggedValue());
			if (s != null && s.equals("ActivityPartition")) {
				return action;
			}
			return null;
		}).filter(c -> c != null).collect(Collectors.toList());
	}
	
	public static List<UMLActionState> getActPartitionByDiagram(XMI xmi, UMLDiagram diagram){
		return getAllActPartition(xmi).stream().filter(part->isOwnedByDiagram(part.getXmiId(),diagram)).collect(Collectors.toList());
	}
	
	private static boolean isOwnedByDiagram(String roleID, UMLDiagram owner) {
		// TODO Auto-generated method stub

		return Optional.ofNullable(owner).map(UMLDiagram::getDiagramElement)
				.map(UMLDiagramElement::getDiagramElementSub).get().stream()
				.anyMatch(sub -> sub.getSubject().equals(roleID));
	}
	
	public static List<UMLTransition> getAllFlow(XMI xmi){
		
	}
	
	public static List<UMLTransition> getAllObjectFlow(XMI xmi){
		
	}
	
	public static List<UMLTransition> getAllControlFlow(XMI xmi){
		
	}
	
	public static List<UMLTransition> getFlowOfActPartition(XMI xmi, String owner){
		
	}
}
