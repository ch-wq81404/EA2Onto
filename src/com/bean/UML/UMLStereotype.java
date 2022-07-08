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
 *         &lt;element ref="{omg.org/UML1.3}Stereotype.baseClass" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isAbstract" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isLeaf" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isRoot" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="xmi.id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="xmi.idref" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stereotypeBaseClass"
})
@XmlRootElement(name = "Stereotype", namespace = "omg.org/UML1.3")
public class UMLStereotype  implements EAModel{

    @XmlElement(name = "Stereotype.baseClass", namespace = "omg.org/UML1.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String stereotypeBaseClass;
    @XmlAttribute(name = "isAbstract")
    protected Boolean isAbstract;
    @XmlAttribute(name = "isLeaf")
    protected Boolean isLeaf;
    @XmlAttribute(name = "isRoot")
    protected Boolean isRoot;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "xmi.id")
    @XmlSchemaType(name = "anySimpleType")
    protected String xmiId;
    @XmlAttribute(name = "xmi.idref")
    @XmlSchemaType(name = "anySimpleType")
    protected String xmiIdref;

    /**
     * ��ȡstereotypeBaseClass���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStereotypeBaseClass() {
        return stereotypeBaseClass;
    }

    /**
     * ����stereotypeBaseClass���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStereotypeBaseClass(String value) {
        this.stereotypeBaseClass = value;
    }

    /**
     * ��ȡisAbstract���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAbstract() {
        return isAbstract;
    }

    /**
     * ����isAbstract���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAbstract(Boolean value) {
        this.isAbstract = value;
    }

    /**
     * ��ȡisLeaf���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLeaf() {
        return isLeaf;
    }

    /**
     * ����isLeaf���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLeaf(Boolean value) {
        this.isLeaf = value;
    }

    /**
     * ��ȡisRoot���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRoot() {
        return isRoot;
    }

    /**
     * ����isRoot���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRoot(Boolean value) {
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

    /**
     * ��ȡxmiIdref���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmiIdref() {
        return xmiIdref;
    }

    /**
     * ����xmiIdref���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmiIdref(String value) {
        this.xmiIdref = value;
    }

}
