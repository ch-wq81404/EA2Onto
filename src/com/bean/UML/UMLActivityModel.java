//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.05.09 时间 03:54:03 PM CST 
//


package com.bean.UML;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{omg.org/UML1.3}StateMachine.transitions"/>
 *         &lt;element ref="{omg.org/UML1.3}StateMachine.top"/>
 *       &lt;/sequence>
 *       &lt;attribute name="context" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="visibility" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="xmi.id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stateMachineTransitions",
    "stateMachineTop"
})
@XmlRootElement(name = "ActivityModel", namespace = "omg.org/UML1.3")
public class UMLActivityModel  implements EAModel {

    @XmlElement(name = "StateMachine.transitions", required = true, namespace = "omg.org/UML1.3")
    protected UMLStateMachineTransitions stateMachineTransitions;
    @XmlElement(name = "StateMachine.top", required = true, namespace = "omg.org/UML1.3")
    protected UMLStateMachineTop stateMachineTop;
    @XmlAttribute(name = "context", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String context;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "visibility", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String visibility;
    @XmlAttribute(name = "xmi.id", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String xmiId;

    /**
     * 获取stateMachineTransitions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UMLStateMachineTransitions }
     *     
     */
    public UMLStateMachineTransitions getStateMachineTransitions() {
        return stateMachineTransitions;
    }

    /**
     * 设置stateMachineTransitions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UMLStateMachineTransitions }
     *     
     */
    public void setStateMachineTransitions(UMLStateMachineTransitions value) {
        this.stateMachineTransitions = value;
    }

    /**
     * 获取stateMachineTop属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UMLStateMachineTop }
     *     
     */
    public UMLStateMachineTop getStateMachineTop() {
        return stateMachineTop;
    }

    /**
     * 设置stateMachineTop属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UMLStateMachineTop }
     *     
     */
    public void setStateMachineTop(UMLStateMachineTop value) {
        this.stateMachineTop = value;
    }

    /**
     * 获取context属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * 设置context属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取visibility属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * 设置visibility属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibility(String value) {
        this.visibility = value;
    }

    /**
     * 获取xmiId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmiId() {
        return xmiId;
    }

    /**
     * 设置xmiId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmiId(String value) {
        this.xmiId = value;
    }

}
