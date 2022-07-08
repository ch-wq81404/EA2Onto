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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{omg.org/UML1.3}ModelElement.stereotype"/>
 *         &lt;element ref="{omg.org/UML1.3}ModelElement.taggedValue"/>
 *         &lt;element ref="{omg.org/UML1.3}Namespace.ownedElement"/>
 *       &lt;/choice>
 *       &lt;attribute name="isAbstract" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isLeaf" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isRoot" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlRootElement(name = "Package", namespace = "omg.org/UML1.3")
public class UMLPackage  implements EAModel{

    @XmlAttribute(name = "isLeaf", required = true)
    protected boolean isLeaf;
    @XmlAttribute(name = "isRoot", required = true)
    protected boolean isRoot;
    @XmlElement(name="ModelElement.taggedValue", namespace = "omg.org/UML1.3")
    protected UMLModelElementTaggedValue umlModelElementTaggedValue;
    @XmlElement(name = "Namespace.ownedElement", namespace = "omg.org/UML1.3")
    protected UMLNamespaceOwnedElement umlNamespaceOwnedElement;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "xmi.id")
    protected String xmiId;
    @XmlAttribute(name = "isRoot")
    protected boolean root;
    @XmlAttribute(name = "isLeaf")
    protected boolean leaf;
    @XmlAttribute(name = "isAbstract")
    protected boolean isAbstract;
    @XmlAttribute(name = "visibility")
    protected String visibility;
    
    
    
    /**
     * Gets the value of the modelElementStereotypeOrModelElementTaggedValueOrNamespaceOwnedElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modelElementStereotypeOrModelElementTaggedValueOrNamespaceOwnedElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModelElementStereotypeOrModelElementTaggedValueOrNamespaceOwnedElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UMLModelElementStereotype }
     * {@link UMLModelElementTaggedValue }
     * {@link UMLNamespaceOwnedElement }
     * 
     * 
     */

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

	public UMLNamespaceOwnedElement getUmlNamespaceOwnedElement() {
		// TODO Auto-generated method stub
		if (this.umlNamespaceOwnedElement == null) {
          this.umlNamespaceOwnedElement = new UMLNamespaceOwnedElement();
      }
      return this.umlNamespaceOwnedElement;
	}

}
