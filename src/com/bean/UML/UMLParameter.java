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
     * ��ȡparameterType���Ե�ֵ��
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
     * ����parameterType���Ե�ֵ��
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
     * ��ȡparameterDefaultValue���Ե�ֵ��
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
     * ����parameterDefaultValue���Ե�ֵ��
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
     * ��ȡkind���Ե�ֵ��
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
     * ����kind���Ե�ֵ��
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
