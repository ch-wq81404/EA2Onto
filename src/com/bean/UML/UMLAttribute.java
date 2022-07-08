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
 *         &lt;element ref="{omg.org/UML1.3}Attribute.initialValue"/>
 *         &lt;element ref="{omg.org/UML1.3}StructuralFeature.type"/>
 *         &lt;element ref="{omg.org/UML1.3}ModelElement.taggedValue"/>
 *       &lt;/sequence>
 *       &lt;attribute name="changeable" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="ownerScope" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="targetScope" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
    "attributeInitialValue",
    "structuralFeatureType",
    "modelElementTaggedValue"
})
@XmlRootElement(name = "Attribute", namespace = "omg.org/UML1.3")
public class UMLAttribute {

    @XmlElement(name = "Attribute.initialValue", required = true, namespace = "omg.org/UML1.3")
    protected UMLExpression attributeInitialValue;
    @XmlElement(name = "StructuralFeature.type", required = true, namespace = "omg.org/UML1.3")
    protected UMLClassifier structuralFeatureType;
    @XmlElement(name = "ModelElement.taggedValue", required = true, namespace = "omg.org/UML1.3")
    protected UMLModelElementTaggedValue modelElementTaggedValue;
    @XmlAttribute(name = "changeable", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String changeable;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "ownerScope", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String ownerScope;
    @XmlAttribute(name = "targetScope", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String targetScope;
    @XmlAttribute(name = "visibility", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String visibility;

    /**
     * ��ȡattributeInitialValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link UMLExpression }
     *     
     */
    public UMLExpression getAttributeInitialValue() {
        return attributeInitialValue;
    }

    /**
     * ����attributeInitialValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link UMLExpression }
     *     
     */
    public void setAttributeInitialValue(UMLExpression value) {
        this.attributeInitialValue = value;
    }

    /**
     * ��ȡstructuralFeatureType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link UMLClassifier }
     *     
     */
    public UMLClassifier getStructuralFeatureType() {
        return structuralFeatureType;
    }

    /**
     * ����structuralFeatureType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link UMLClassifier }
     *     
     */
    public void setStructuralFeatureType(UMLClassifier value) {
        this.structuralFeatureType = value;
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
     * ��ȡchangeable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeable() {
        return changeable;
    }

    /**
     * ����changeable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeable(String value) {
        this.changeable = value;
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
     * ��ȡtargetScope���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetScope() {
        return targetScope;
    }

    /**
     * ����targetScope���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetScope(String value) {
        this.targetScope = value;
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
