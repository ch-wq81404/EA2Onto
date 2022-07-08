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
     * ��ȡnamespaceOwnedElement���Ե�ֵ��
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
     * ����namespaceOwnedElement���Ե�ֵ��
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
     * ��ȡcollaborationInteraction���Ե�ֵ��
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
     * ����collaborationInteraction���Ե�ֵ��
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

}
