//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2022.05.09 ʱ�� 03:54:03 PM CST 
//


package com.bean.UML;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
     * ��ȡisAbstract���Ե�ֵ��
     * 
     */
    public boolean isIsAbstract() {
        return isAbstract;
    }

    /**
     * ����isAbstract���Ե�ֵ��
     * 
     */
    public void setIsAbstract(boolean value) {
        this.isAbstract = value;
    }

    /**
     * ��ȡisLeaf���Ե�ֵ��
     * 
     */
    public boolean isIsLeaf() {
        return isLeaf;
    }

    /**
     * ����isLeaf���Ե�ֵ��
     * 
     */
    public void setIsLeaf(boolean value) {
        this.isLeaf = value;
    }

    /**
     * ��ȡisRoot���Ե�ֵ��
     * 
     */
    public boolean isIsRoot() {
        return isRoot;
    }

    /**
     * ����isRoot���Ե�ֵ��
     * 
     */
    public void setIsRoot(boolean value) {
        this.isRoot = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
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
     * ����name���Ե�ֵ��
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
     * ��ȡvisibility���Ե�ֵ��
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
     * ����visibility���Ե�ֵ��
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
     * ��ȡxmiId���Ե�ֵ��
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
     * ����xmiId���Ե�ֵ��
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
