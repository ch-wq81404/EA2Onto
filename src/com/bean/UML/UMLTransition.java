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
 *         &lt;element ref="{omg.org/UML1.3}Transition.trigger" minOccurs="0"/>
 *         &lt;element ref="{omg.org/UML1.3}Transition.guard" minOccurs="0"/>
 *         &lt;element ref="{omg.org/UML1.3}Transition.effect" minOccurs="0"/>
 *         &lt;element ref="{omg.org/UML1.3}ModelElement.taggedValue" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="visibility" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="xmi.id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transitionTrigger",
    "transitionGuard",
    "transitionEffect",
    "modelElementTaggedValue"
})
@XmlRootElement(name = "Transition", namespace = "omg.org/UML1.3")
public class UMLTransition  implements EAModel{

    @XmlElement(name = "Transition.trigger", namespace = "omg.org/UML1.3")
    protected UMLTransitionTrigger transitionTrigger;
    @XmlElement(name = "Transition.guard", namespace = "omg.org/UML1.3")
    protected UMLTransitionGuard transitionGuard;
    @XmlElement(name = "Transition.effect", namespace = "omg.org/UML1.3")
    protected UMLActionSequence transitionEffect;
    @XmlElement(name = "ModelElement.taggedValue", namespace = "omg.org/UML1.3")
    protected UMLModelElementTaggedValue modelElementTaggedValue;
    @XmlAttribute(name = "source")
    @XmlSchemaType(name = "anySimpleType")
    protected String source;
    @XmlAttribute(name = "target")
    @XmlSchemaType(name = "anySimpleType")
    protected String target;
    @XmlAttribute(name = "visibility")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String visibility;
    @XmlAttribute(name = "xmi.id")
    @XmlSchemaType(name = "anySimpleType")
    protected String xmiId;

    /**
     * 获取transitionTrigger属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UMLTransitionTrigger }
     *     
     */
    public UMLTransitionTrigger getTransitionTrigger() {
        return transitionTrigger;
    }

    /**
     * 设置transitionTrigger属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UMLTransitionTrigger }
     *     
     */
    public void setTransitionTrigger(UMLTransitionTrigger value) {
        this.transitionTrigger = value;
    }

    /**
     * 获取transitionGuard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UMLTransitionGuard }
     *     
     */
    public UMLTransitionGuard getTransitionGuard() {
        return transitionGuard;
    }

    /**
     * 设置transitionGuard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UMLTransitionGuard }
     *     
     */
    public void setTransitionGuard(UMLTransitionGuard value) {
        this.transitionGuard = value;
    }

    /**
     * 获取transitionEffect属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UMLActionSequence }
     *     
     */
    public UMLActionSequence getTransitionEffect() {
        return transitionEffect;
    }

    /**
     * 设置transitionEffect属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UMLActionSequence }
     *     
     */
    public void setTransitionEffect(UMLActionSequence value) {
        this.transitionEffect = value;
    }

    /**
     * 获取modelElementTaggedValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UMLModelElementTaggedValue }
     *     
     */
    public UMLModelElementTaggedValue getModelElementTaggedValue() {
        return modelElementTaggedValue;
    }

    /**
     * 设置modelElementTaggedValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UMLModelElementTaggedValue }
     *     
     */
    public void setModelElementTaggedValue(UMLModelElementTaggedValue value) {
        this.modelElementTaggedValue = value;
    }

    /**
     * 获取source属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置source属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * 获取target属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * 设置target属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
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
