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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{omg.org/UML1.3}ModelElement.stereotype" minOccurs="0"/>
 *         &lt;element ref="{omg.org/UML1.3}ModelElement.taggedValue"/>
 *         &lt;element ref="{omg.org/UML1.3}Association.connection"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isAbstract" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isLeaf" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isRoot" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
    "modelElementStereotype",
    "modelElementTaggedValue",
    "associationConnection"
})
@XmlRootElement(name = "Association", namespace = "omg.org/UML1.3")
public class UMLAssociation implements EAModel {

    @XmlElement(name = "ModelElement.stereotype", namespace = "omg.org/UML1.3")
    protected UMLModelElementStereotype modelElementStereotype;
    @XmlElement(name = "ModelElement.taggedValue", required = true, namespace = "omg.org/UML1.3")
    protected UMLModelElementTaggedValue modelElementTaggedValue;
    @XmlElement(name = "Association.connection", required = true, namespace = "omg.org/UML1.3")
    protected UMLAssociationConnection associationConnection;
    @XmlAttribute(name = "isAbstract", required = true)
    protected boolean isAbstract;
    @XmlAttribute(name = "isLeaf", required = true)
    protected boolean isLeaf;
    @XmlAttribute(name = "isRoot", required = true)
    protected boolean isRoot;
    @XmlAttribute(name = "name")
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
     * ��ȡmodelElementStereotype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link UMLModelElementStereotype }
     *     
     */
    public UMLModelElementStereotype getModelElementStereotype() {
        return modelElementStereotype;
    }

    /**
     * ����modelElementStereotype���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link UMLModelElementStereotype }
     *     
     */
    public void setModelElementStereotype(UMLModelElementStereotype value) {
        this.modelElementStereotype = value;
    }

    /**
     * ��ȡmodelElementTaggedValue���Ե�ֵ��
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
     * ����modelElementTaggedValue���Ե�ֵ��
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
     * ��ȡassociationConnection���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link UMLAssociationConnection }
     *     
     */
    public UMLAssociationConnection getAssociationConnection() {
        return associationConnection;
    }

    /**
     * ����associationConnection���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link UMLAssociationConnection }
     *     
     */
    public void setAssociationConnection(UMLAssociationConnection value) {
        this.associationConnection = value;
    }

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

}
