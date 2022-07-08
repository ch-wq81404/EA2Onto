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
 *         &lt;element ref="{omg.org/UML1.3}Namespace.ownedElement"/>
 *         &lt;element ref="{omg.org/UML1.3}Collaboration.interaction"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
    "namespaceOwnedElement",
    "collaborationInteraction"
})
@XmlRootElement(name = "Collaboration", namespace = "omg.org/UML1.3")
public class UMLCollaboration  implements EAModel{

    @XmlElement(name = "Namespace.ownedElement", required = true, namespace = "omg.org/UML1.3")
    protected UMLNamespaceOwnedElement namespaceOwnedElement;
    @XmlElement(name = "Collaboration.interaction", required = true, namespace = "omg.org/UML1.3")
    protected UMLCollaborationInteraction collaborationInteraction;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "xmi.id", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String xmiId;

    /**
     * 获取namespaceOwnedElement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UMLNamespaceOwnedElement }
     *     
     */
    public UMLNamespaceOwnedElement getNamespaceOwnedElement() {
        return namespaceOwnedElement;
    }

    /**
     * 设置namespaceOwnedElement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UMLNamespaceOwnedElement }
     *     
     */
    public void setNamespaceOwnedElement(UMLNamespaceOwnedElement value) {
        this.namespaceOwnedElement = value;
    }

    /**
     * 获取collaborationInteraction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UMLCollaborationInteraction }
     *     
     */
    public UMLCollaborationInteraction getCollaborationInteraction() {
        return collaborationInteraction;
    }

    /**
     * 设置collaborationInteraction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UMLCollaborationInteraction }
     *     
     */
    public void setCollaborationInteraction(UMLCollaborationInteraction value) {
        this.collaborationInteraction = value;
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
