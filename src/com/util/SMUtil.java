package com.util;

//import org.apache.commons.lang.StringUtils;

import com.bean.UML.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SMUtil {

	
	
	
	
    public static List<UMLState> getAllStateByRegionId(String regionId, XMI xmi) {
        return getAllStates(xmi).stream().filter(state -> XMIUtil.getTaggedValueByTag("$ea_xref_property", state.getUmlModelElementTaggedValue()) != null &&
                XMIUtil.getTaggedValueByTag("$ea_xref_property", state.getUmlModelElementTaggedValue()).contains(regionId) &&
                !XMIUtil.getTaggedValueByTag("$ea_xref_property", state.getUmlModelElementTaggedValue()).contains("GUID")
        ).collect(Collectors.toList());
    }

    public static List<String> getRegionIdBySystemName(String systemName, XMI xmi) {
        List<String> regions = new ArrayList<>();
        List<UMLTaggedValue> taggedValues = getAllStatesObj(xmi).getUmlSimpleState().stream()
                .map(UMLSimpleState::getModelElementTaggedValue)
                .map(UMLModelElementTaggedValue::getTaggedValue)
                .map(umlTaggedValues -> umlTaggedValues.stream()
                        .filter(umlTaggedValue -> umlTaggedValue.getTag().equals("$ea_xref_property") && umlTaggedValue.getValue().contains(systemName)).findFirst().orElse(null)).collect(Collectors.toList());
        for (UMLTaggedValue umlTaggedValue : taggedValues) {
            if (umlTaggedValue == null)
                continue;
            String[] split = umlTaggedValue.getValue().split(";");
            boolean findSystem = false;
            for (int i = 0; i < split.length; i++) {
                if (split[i].contains(systemName)) {
                    findSystem = true;
                }
                if (split[i].contains("GUID") && findSystem) {
                    String regionId = split[i].substring(6, split[i].length() - 1);
                    regions.add(regionId);
                    break;
                }
            }

        }
        return regions;
    }

    public static List<UMLState> getAllStates(XMI xmi) {
        UMLCompositeStateSubstate allStatesObj = getAllStatesObj(xmi);
        List<UMLSimpleState> umlSimpleState = allStatesObj.getUmlSimpleState();
        List<UMLPseudoState> umlPseudoState = allStatesObj.getUmlPseudoState();
        List<UMLState> list = new ArrayList<UMLState>();
        list.addAll(umlSimpleState);
        list.addAll(umlPseudoState);
        return list;
    }

    public static UMLState getStateById(String stateId, XMI xmi) {
        List<UMLState> allStates = getAllStates(xmi);
        return allStates.stream().filter(umlState -> umlState.getXmiId().equals(stateId)).findFirst().orElse(null);
    }

    public static List<UMLTransition> getAllTransitions(XMI xmi) {
    	UMLPackage ovelrall=XMIUtil.getTopPackage(xmi);
    	return Optional.ofNullable(ovelrall)
                .map(UMLPackage::getUmlNamespaceOwnedElement)
                .map(UMLNamespaceOwnedElement::getActivityModel)
                .map(UMLActivityModel::getStateMachineTransitions)
                .map(UMLStateMachineTransitions::getTransition)
                .orElse(null);
    	
    	
    	
//        UMLPackage smPackage = XMIUtil.getPackage(xmi, PackageNameEnum.SM);
//        return Optional.ofNullable(smPackage)
//                .map(UMLPackage::getUmlNamespaceOwnedElement)
//                .map(UMLNamespaceOwnedElement::getActivityModel)
//                .map(UMLActivityModel::getStateMachineTransitions)
//                .map(UMLStateMachineTransitions::getTransition)
//                .orElse(null);
    }

    public static UMLCompositeStateSubstate getAllStatesObj(XMI xmi) {
        UMLPackage smPackage = XMIUtil.getPackage(xmi, NameEnum.Stm);
        return Optional.ofNullable(smPackage)
                .map(UMLPackage::getUmlNamespaceOwnedElement)
                .map(UMLNamespaceOwnedElement::getActivityModel)
                .map(UMLActivityModel::getStateMachineTop)
                .map(UMLStateMachineTop::getCompositeState)
                .map(UMLCompositeState::getCompositeStateSubstate).get();
    }

    public static List<UMLState> getAllNoRegionState(XMI xmi) {
        return getAllStates(xmi).stream()
                .filter(umlState -> XMIUtil.getTaggedValueByTag("owner", umlState.getUmlModelElementTaggedValue()) == null)
                .collect(Collectors.toList());
    }
}
