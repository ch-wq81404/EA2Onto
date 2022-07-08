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
 *         &lt;element ref="{omg.org/UML1.3}ModelElement.stereotype" minOccurs="0"/>
 *         &lt;element ref="{omg.org/UML1.3}ModelElement.taggedValue" minOccurs="0"/>
 *         &lt;element ref="{omg.org/UML1.3}Classifier.feature" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isAbstract" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isLeaf" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isRoot" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="namespace" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="visibility" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
    "modelElementStereotype",
    "modelElementTaggedValue",
    "classifierFeature"
})
@XmlRootElement(name = "Class", namespace = "omg.org/UML1.3")
public class UMLClass  implements EAModel {

    @XmlElement(name = "ModelElement.stereotype", namespace = "omg.org/UML1.3")
    protected UMLModelElementStereotype modelElementStereotype;
    @XmlElement(name = "ModelElement.taggedValue", namespace = "omg.org/UML1.3")
    protected UMLModelElementTaggedValue modelElementTaggedValue;
    @XmlElement(name = "Classifier.feature", namespace = "omg.org/UML1.3")
    protected UMLClassifierFeature classifierFeature;
    @XmlAttribute(name = "isAbstract", required = true)
    protected boolean isAbstract;
    @XmlAttribute(name = "isActive")
    protected Boolean isActive;
    @XmlAttribute(name = "isLeaf", required = true)
    protected boolean isLeaf;
    @XmlAttribute(name = "isRoot", required = true)
    protected boolean isRoot;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "namespace")
    @XmlSchemaType(name = "anySimpleType")
    protected String namespace;
    @XmlAttribute(name = "visibility")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String visibility;
    @XmlAttribute(name = "xmi.id", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String xmiId;

    /**
     * 获取modelElementStereotype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UMLModelElementStereotype }
     *     
     */
    public UMLModelElementStereotype getUmlModelElementStereotype() {
        return modelElementStereotype;
    }

    /**
     * 设置modelElementStereotype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UMLModelElementStereotype }
     *     
     */
    public void setUmlModelElementStereotype(UMLModelElementStereotype value) {
        this.modelElementStereotype = value;
    }

    /**
     * 获取modelElementTaggedValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UMLModelElementTaggedValue }
     *     
     */
    public UMLModelElementTaggedValue getUmlModelElementTaggedValue() {
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
    public void setUmlModelElementTaggedValue(UMLModelElementTaggedValue value) {
        this.modelElementTaggedValue = value;
    }

    /**
     * 获取classifierFeature属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UMLClassifierFeature }
     *     
     */
    public UMLClassifierFeature getUmlClassifierFeature() {
        return classifierFeature;
    }

    /**
     * 设置classifierFeature属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UMLClassifierFeature }
     *     
     */
    public void setUmlClassifierFeature(UMLClassifierFeature value) {
        this.classifierFeature = value;
    }

    /**
     * 获取isAbstract属性的值。
     * 
     */
    public boolean isIsAbstract() {
        return isAbstract;
    }

    /**
     * 设置isAbstract属性的值。
     * 
     */
    public void setIsAbstract(boolean value) {
        this.isAbstract = value;
    }

    /**
     * 获取isActive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * 设置isActive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * 获取isLeaf属性的值。
     * 
     */
    public boolean isIsLeaf() {
        return isLeaf;
    }

    /**
     * 设置isLeaf属性的值。
     * 
     */
    public void setIsLeaf(boolean value) {
        this.isLeaf = value;
    }

    /**
     * 获取isRoot属性的值。
     * 
     */
    public boolean isIsRoot() {
        return isRoot;
    }

    /**
     * 设置isRoot属性的值。
     * 
     */
    public void setIsRoot(boolean value) {
        this.isRoot = value;
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
     * 获取namespace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * 设置namespace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
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
