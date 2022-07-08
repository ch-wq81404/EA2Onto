package com.mapper;

import com.bean.UML.UMLDiagram;
import com.bean.UML.XMI;
import com.bean.onto.OntoGenerator;
import com.util.ActUtil;

public class ActMapper {
	public static void map(XMI xmi, OntoGenerator ont) {
		// System.out.println("��ʼת���ͼ����ǰ������� ��"+ont.getAximCount());
		System.out.println(
				"Start transforming the block definition diagram. Number of current axioms:" + ont.getAximCount());
		UMLDiagram diagram = ActUtil.getDiagram(xmi);
		if (diagram != null) {
			ont.createIndividualOfClass(diagram.getName(), "ActivityDiagram");
			
			/**
			 * 0.���ͼ�����еĻ����������classifier������齨��allocate��ϵ��
			 * 1.����ͼ��ÿ��ContrlFlow��source��target����Ϊ���ظ���ڵ㣬�Լ�hasSource��hasTarget���ԣ�
			 * 2.����ÿ�����㣬Ѱ���Ƿ��ж�Ӧ�Ŀ鷽�������У�����mapTo��ϵ��
			 * 3.���ݽ���һ���������ñ���������hasTransition���ԣ�
			 * 4.����ͼ��ÿ��ObjectFlow��source��target����Ϊ��ڵ㣬��������Ϊ����hasValueType���Ե�Object���Լ�hasSource��hasTarget��hasObject��
			 * 5.����ÿ�����㣬Ѱ���Ƿ��ж�Ӧ�Ŀ鷽����
			 *     ���У����Object��hasValueType����ֵ��鷽���Ķ�Ӧֵ�Ƿ�һ�£�
			 *           ��������ʾ����
			 *           else ����mapTo��ϵ��
			 *     else  warning��
			 * 6.���ݽ���һ���������ñ���������hasTransition���ԣ�
			 */
			
			
//			valueTypeMap(xmi, ont);
//			blockMap(xmi, ont, diagram);
//			edgeMap(xmi, ont, diagram);
		}
		// System.out.println("ת����ɡ���ǰ������� ��"+ont.getAximCount());
		System.out.println("Transform over. Number of current axioms:" + ont.getAximCount());
	}
}
