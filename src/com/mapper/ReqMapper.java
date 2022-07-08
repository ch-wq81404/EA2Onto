package com.mapper;

import java.util.HashMap;
import java.util.List;

import com.bean.UML.UMLClassifierRole;
import com.bean.UML.UMLDependency;
import com.bean.UML.UMLDiagram;
import com.bean.UML.XMI;
import com.bean.onto.OntoGenerator;
import com.util.ReqUtil;

public class ReqMapper {
	
	public static void map(XMI xmi, OntoGenerator ont){
//		System.out.println("开始转换需求图。当前公理个数 ："+ont.getAximCount());
		System.out.println("Start transforming the requirements diagram. Number of current axioms:" +ont.getAximCount());
		UMLDiagram diagram=ReqUtil.getDiagram(xmi);
		if(diagram!=null){
			ont.createIndividualOfClass(diagram.getName(), "RequirementDiagram");
			requirementMap(xmi,ont,diagram.getName(),diagram);
			edgeMap(xmi,ont,diagram.getName());
		}
//		System.out.println("转换完成。当前公理个数 ："+ont.getAximCount());
		System.out.println("Transform over. Number of current axioms:" +ont.getAximCount());
	}
	
	public static void requirementMap(XMI xmi, OntoGenerator ont, String diagramName, UMLDiagram owner){
		List<UMLClassifierRole> roles=ReqUtil.getRequirementsByOwnerID(xmi, owner);
		for(UMLClassifierRole classifierRole:roles){
			String id=classifierRole.getXmiId();
			HashMap<String,String> m=ReqUtil.getReqContentByID(xmi, id);
			String reqtID=m.get("id");
			if(m.get("id").contains("S")){
				ont.createIndividualOfClass(reqtID, "StakeholderMission");
				ont.createDataPropertyAxiom("hasReqtID", reqtID, m.get("id"));
				ont.createDataPropertyAxiom("hasReqtValue", reqtID, m.get("text"));
				ont.createDataPropertyAxiom("hasReqtName", reqtID, classifierRole.getName());
			}
			else if(m.get("id").contains("D")){
				ont.createIndividualOfClass(reqtID, "DeriveRequirement");
				ont.createDataPropertyAxiom("hasReqtID", reqtID, m.get("id"));
				ont.createDataPropertyAxiom("hasReqtValue", reqtID, m.get("text"));
				ont.createDataPropertyAxiom("hasReqtName", reqtID, classifierRole.getName());
			}
			else if(m.get("id").contains("B")){
				ont.createIndividualOfClass(reqtID, "BlockSubReqt");
				ont.createDataPropertyAxiom("hasReqtID", reqtID, m.get("id"));
				ont.createDataPropertyAxiom("hasReqtValue", reqtID, m.get("text"));
				ont.createDataPropertyAxiom("hasReqtName", reqtID, classifierRole.getName());
			}
			ont.createObjectPropertyAxiom("hasRequirement", diagramName, reqtID);
		}
	}
	
	public static void edgeMap(XMI xmi, OntoGenerator ont, String diagramName){
		List<UMLDependency> demposes=ReqUtil.getAllDempose(xmi);
		List<UMLDependency> deriveReqs=ReqUtil.getAllDerive(xmi);
		for(UMLDependency dempose:demposes){
			HashMap<String,String> m=ReqUtil.getPointsOfDependency(xmi, dempose);
			ont.createObjectPropertyAxiom("dempose", m.get("source"), m.get("end"));
		}
		for(UMLDependency deriveReq:deriveReqs){
			HashMap<String,String> m=ReqUtil.getPointsOfDependency(xmi, deriveReq);
			ont.createObjectPropertyAxiom("deriveReqt", m.get("source"), m.get("end"));
			ont.createObjectPropertyAxiom("isDerivedFrom", m.get("end"), m.get("source"));
		}
	}
}
