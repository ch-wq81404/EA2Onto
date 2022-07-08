//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.05.09 时间 03:54:03 PM CST 
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
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
