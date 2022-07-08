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
 *         &lt;element ref="{omg.org/UML1.3}Transition.trigger" minOccurs="0"/>
 *         &lt;element ref="{omg.org/UML1.3}Transition.guard" minOccurs="0"/>
 *         &lt;element ref="{omg.org/UML1.3}Transition.effect" minOccurs="0"/>
 *         &lt;element ref="{omg.org/UML1.3}ModelElement.taggedValue" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="visibility" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="xmi.id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transitionTrigger",
    "transitionGuard",
    "transitionEffect",
    "modelElementTaggedValue"
})
@XmlRootElement(name = "Transition", namespace = "omg.org/UML1.3")
public class UMLTransition  implements EAModel{

    @XmlElement(name = "Transition.trigger", namespace = "omg.org/UML1.3")
    protected UMLTransitionTrigger transitionTrigger;
    @XmlElement(name = "Transition.guard", namespace = "omg.org/UML1.3")
    protected UMLTransitionGuard transitionGuard;
    @XmlElement(name = "Transition.effect", namespace = "omg.org/UML1.3")
    protected UMLActionSequence transitionEffect;
    @XmlElement(name = "ModelElement.taggedValue", namespace = "omg.org/UML1.3")
    protected UMLModelElementTaggedValue modelElementTaggedValue;
    @XmlAttribute(name = "source")
    @XmlSchemaType(name = "anySimpleType")
    protected String source;
    @XmlAttribute(name = "target")
    @XmlSchemaType(name = "anySimpleType")
    protected String target;
    @XmlAttribute(name = "visibility")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String visibility;
    @XmlAttribute(name = "xmi.id")
    @XmlSchemaType(name = "anySimpleType")
    protected String xmiId;

    /**
     * ��ȡtransitionTrigger���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link UMLTransitionTrigger }
     *     
     */
    public UMLTransitionTrigger getTransitionTrigger() {
        return transitionTrigger;
    }

    /**
     * ����transitionTrigger���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link UMLTransitionTrigger }
     *     
     */
    public void setTransitionTrigger(UMLTransitionTrigger value) {
        this.transitionTrigger = value;
    }

    /**
     * ��ȡtransitionGuard���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link UMLTransitionGuard }
     *     
     */
    public UMLTransitionGuard getTransitionGuard() {
        return transitionGuard;
    }

    /**
     * ����transitionGuard���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link UMLTransitionGuard }
     *     
     */
    public void setTransitionGuard(UMLTransitionGuard value) {
        this.transitionGuard = value;
    }

    /**
     * ��ȡtransitionEffect���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link UMLActionSequence }
     *     
     */
    public UMLActionSequence getTransitionEffect() {
        return transitionEffect;
    }

    /**
     * ����transitionEffect���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link UMLActionSequence }
     *     
     */
    public void setTransitionEffect(UMLActionSequence value) {
        this.transitionEffect = value;
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
     * ��ȡsource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * ����source���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * ��ȡtarget���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * ����target���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
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
