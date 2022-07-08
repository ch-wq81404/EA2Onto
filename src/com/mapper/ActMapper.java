package com.mapper;

import com.bean.UML.UMLDiagram;
import com.bean.UML.XMI;
import com.bean.onto.OntoGenerator;
import com.util.ActUtil;

public class ActMapper {
	public static void map(XMI xmi, OntoGenerator ont) {
		// System.out.println("开始转换活动图。当前公理个数 ："+ont.getAximCount());
		System.out.println(
				"Start transforming the block definition diagram. Number of current axioms:" + ont.getAximCount());
		UMLDiagram diagram = ActUtil.getDiagram(xmi);
		if (diagram != null) {
			ont.createIndividualOfClass(diagram.getName(), "ActivityDiagram");
			
			/**
			 * 0.获得图中所有的活动分区，根据classifier属性与块建立allocate关系；
			 * 1.对于图中每个ContrlFlow，source和target设置为非重复活动节点，以及hasSource、hasTarget属性；
			 * 2.对于每个活动结点，寻找是否有对应的块方法，若有，设置mapTo关系；
			 * 3.根据结点找活动分区，设置边与活动分区的hasTransition属性；
			 * 4.对于图中每个ObjectFlow，source和target设置为活动节点，对象设置为带有hasValueType属性的Object，以及hasSource、hasTarget、hasObject；
			 * 5.对于每个活动结点，寻找是否有对应的块方法，
			 *     若有，检查Object的hasValueType属性值与块方法的对应值是否一致，
			 *           若不，提示错误
			 *           else 设置mapTo关系；
			 *     else  warning；
			 * 6.根据结点找活动分区，设置边与活动分区的hasTransition属性；
			 */
			
			
//			valueTypeMap(xmi, ont);
//			blockMap(xmi, ont, diagram);
//			edgeMap(xmi, ont, diagram);
		}
		// System.out.println("转换完成。当前公理个数 ："+ont.getAximCount());
		System.out.println("Transform over. Number of current axioms:" + ont.getAximCount());
	}
}
