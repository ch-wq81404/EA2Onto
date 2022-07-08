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
 *         &lt;element ref="{omg.org/UML1.3}Parameter.type"/>
 *         &lt;element ref="{omg.org/UML1.3}ModelElement.taggedValue"/>
 *         &lt;element ref="{omg.org/UML1.3}Parameter.defaultValue"/>
 *       &lt;/sequence>
 *       &lt;attribute name="kind" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="visibility" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "parameterType",
    "modelElementTaggedValue",
    "parameterDefaultValue"
})
@XmlRootElement(name = "Parameter", namespace = "omg.org/UML1.3")
public class UMLParameter {

    @XmlElement(name = "Parameter.type", required = true, namespace = "omg.org/UML1.3")
    protected UMLClassifier parameterType;
    @XmlElement(name = "ModelElement.taggedValue", required = true, namespace = "omg.org/UML1.3")
    protected UMLModelElementTaggedValue modelElementTaggedValue;
    @XmlElement(name = "Parameter.defaultValue", required = true, namespace = "omg.org/UML1.3")
    protected UMLExpression parameterDefaultValue;
    @XmlAttribute(name = "kind", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String kind;
    @XmlAttribute(name = "visibility", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String visibility;

    /**
     * 获取parameterType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UMLClassifier }
     *     
     */
    public UMLClassifier getParameterType() {
        return parameterType;
    }

    /**
     * 设置parameterType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UMLClassifier }
     *     
     */
    public void setParameterType(UMLClassifier value) {
        this.parameterType = value;
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
     * 获取parameterDefaultValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UMLExpression }
     *     
     */
    public UMLExpression getParameterDefaultValue() {
        return parameterDefaultValue;
    }

    /**
     * 设置parameterDefaultValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UMLExpression }
     *     
     */
    public void setParameterDefaultValue(UMLExpression value) {
        this.parameterDefaultValue = value;
    }

    /**
     * 获取kind属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * 设置kind属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
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

}
