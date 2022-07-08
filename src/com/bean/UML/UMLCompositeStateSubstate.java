//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2022.05.09 ʱ�� 03:54:03 PM CST 
//


package com.bean.UML;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{omg.org/UML1.3}ActionState"/>
 *         &lt;element ref="{omg.org/UML1.3}PseudoState"/>
 *         &lt;element ref="{omg.org/UML1.3}SimpleState"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "", propOrder = {
//    "umlActionState",
//    "umlPseudoState",
//    " umlSimpleState"
//})
@XmlRootElement(name = "CompositeState.substate", namespace = "omg.org/UML1.3")
public class UMLCompositeStateSubstate implements EAModel  {


        @XmlElement(name = "ActionState", namespace = "omg.org/UML1.3")
    protected List<UMLActionState> umlActionState;
    @XmlElement(name = "PseudoState", namespace = "omg.org/UML1.3")
    protected List<UMLPseudoState> umlPseudoState;

    @XmlElement(name = "SimpleState", namespace = "omg.org/UML1.3")
    protected List<UMLSimpleState> umlSimpleState;

	public List<UMLActionState> getUmlActionState() {
		if (umlActionState == null) {
			umlActionState = new ArrayList<UMLActionState>();
        }
        return this.umlActionState;
	}
	
	public List<UMLPseudoState> getUmlPseudoState() {
		if (umlPseudoState == null) {
			umlPseudoState = new ArrayList<UMLPseudoState>();
        }
        return this.umlPseudoState;
	}
	
	public List<UMLSimpleState> getUmlSimpleState() {
		if (umlSimpleState == null) {
			umlSimpleState = new ArrayList<UMLSimpleState>();
        }
        return this.umlSimpleState;
	}

}
