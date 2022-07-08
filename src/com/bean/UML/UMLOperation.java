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
 *         &lt;element ref="{omg.org/UML1.3}ModelElement.taggedValue"/>
 *         &lt;element ref="{omg.org/UML1.3}BehavioralFeature.parameter"/>
 *       &lt;/sequence>
 *       &lt;attribute name="concurrency" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="isQuery" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="ownerScope" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
    "modelElementTaggedValue",
    "behavioralFeatureParameter"
})
@XmlRootElement(name = "Operation", namespace = "omg.org/UML1.3")
public class UMLOperation {

    @XmlElement(name = "ModelElement.taggedValue", required = true, namespace = "omg.org/UML1.3")
    protected UMLModelElementTaggedValue modelElementTaggedValue;
    @XmlElement(name = "BehavioralFeature.parameter", required = true, namespace = "omg.org/UML1.3")
    protected UMLBehavioralFeatureParameter behavioralFeatureParameter;
    @XmlAttribute(name = "concurrency", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String concurrency;
    @XmlAttribute(name = "isQuery", required = true)
    protected boolean isQuery;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "ownerScope", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String ownerScope;
    @XmlAttribute(name = "visibility", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String visibility;

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
     * ��ȡbehavioralFeatureParameter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link UMLBehavioralFeatureParameter }
     *     
     */
    public UMLBehavioralFeatureParameter getBehavioralFeatureParameter() {
        return behavioralFeatureParameter;
    }

    /**
     * ����behavioralFeatureParameter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link UMLBehavioralFeatureParameter }
     *     
     */
    public void setBehavioralFeatureParameter(UMLBehavioralFeatureParameter value) {
        this.behavioralFeatureParameter = value;
    }

    /**
     * ��ȡconcurrency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcurrency() {
        return concurrency;
    }

    /**
     * ����concurrency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcurrency(String value) {
        this.concurrency = value;
    }

    /**
     * ��ȡisQuery���Ե�ֵ��
     * 
     */
    public boolean isIsQuery() {
        return isQuery;
    }

    /**
     * ����isQuery���Ե�ֵ��
     * 
     */
    public void setIsQuery(boolean value) {
        this.isQuery = value;
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
     * ��ȡownerScope���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerScope() {
        return ownerScope;
    }

    /**
     * ����ownerScope���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerScope(String value) {
        this.ownerScope = value;
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

}
