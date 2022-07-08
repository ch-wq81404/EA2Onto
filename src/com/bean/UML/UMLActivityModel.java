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
 *         &lt;element ref="{omg.org/UML1.3}StateMachine.transitions"/>
 *         &lt;element ref="{omg.org/UML1.3}StateMachine.top"/>
 *       &lt;/sequence>
 *       &lt;attribute name="context" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
    "stateMachineTransitions",
    "stateMachineTop"
})
@XmlRootElement(name = "ActivityModel", namespace = "omg.org/UML1.3")
public class UMLActivityModel  implements EAModel {

    @XmlElement(name = "StateMachine.transitions", required = true, namespace = "omg.org/UML1.3")
    protected UMLStateMachineTransitions stateMachineTransitions;
    @XmlElement(name = "StateMachine.top", required = true, namespace = "omg.org/UML1.3")
    protected UMLStateMachineTop stateMachineTop;
    @XmlAttribute(name = "context", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String context;
    @XmlAttribute(name = "name", required = true)
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
     * ��ȡstateMachineTransitions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link UMLStateMachineTransitions }
     *     
     */
    public UMLStateMachineTransitions getStateMachineTransitions() {
        return stateMachineTransitions;
    }

    /**
     * ����stateMachineTransitions���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link UMLStateMachineTransitions }
     *     
     */
    public void setStateMachineTransitions(UMLStateMachineTransitions value) {
        this.stateMachineTransitions = value;
    }

    /**
     * ��ȡstateMachineTop���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link UMLStateMachineTop }
     *     
     */
    public UMLStateMachineTop getStateMachineTop() {
        return stateMachineTop;
    }

    /**
     * ����stateMachineTop���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link UMLStateMachineTop }
     *     
     */
    public void setStateMachineTop(UMLStateMachineTop value) {
        this.stateMachineTop = value;
    }

    /**
     * ��ȡcontext���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * ����context���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
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
