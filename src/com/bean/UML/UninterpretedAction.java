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
 * <p>
 * anonymous complex type�� Java �ࡣ
 * 
 * <p>
 * ����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{omg.org/UML1.3}ModelElement.taggedValue"/>
 *         &lt;element name="XMI.extension" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{omg.org/UML1.3}BehavioralFeature.parameter"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="xmi.extender" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="isAsynchronous" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="visibility" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "modelElementTaggedValue", "xmiExtension" })
@XmlRootElement(name = "UninterpretedAction", namespace = "omg.org/UML1.3")
public class UninterpretedAction implements EAModel {

	@XmlElement(name = "ModelElement.taggedValue", namespace = "omg.org/UML1.3")
	protected UMLModelElementTaggedValue modelElementTaggedValue;
	@XmlElement(name = "XMI.extension", namespace = "")
	protected UninterpretedAction.XMIExtension xmiExtension;
	@XmlAttribute(name = "isAsynchronous")
	protected Boolean isAsynchronous;
	@XmlAttribute(name = "name", required = true)
	@XmlSchemaType(name = "anySimpleType")
	protected String name;
	@XmlAttribute(name = "visibility")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "NCName")
	protected String visibility;

	/**
	 * ��ȡmodelElementTaggedValue���Ե�ֵ��
	 * 
	 * @return possible object is {@link UMLModelElementTaggedValue }
	 * 
	 */
	public UMLModelElementTaggedValue getModelElementTaggedValue() {
		return modelElementTaggedValue;
	}

	/**
	 * ����modelElementTaggedValue���Ե�ֵ��
	 * 
	 * @param value
	 *            allowed object is {@link UMLModelElementTaggedValue }
	 * 
	 */
	public void setModelElementTaggedValue(UMLModelElementTaggedValue value) {
		this.modelElementTaggedValue = value;
	}

	/**
	 * ��ȡxmiExtension���Ե�ֵ��
	 * 
	 * @return possible object is {@link UninterpretedAction.XMIExtension }
	 * 
	 */
	public UninterpretedAction.XMIExtension getXMIExtension() {
		return xmiExtension;
	}

	/**
	 * ����xmiExtension���Ե�ֵ��
	 * 
	 * @param value
	 *            allowed object is {@link UninterpretedAction.XMIExtension }
	 * 
	 */
	public void setXMIExtension(UninterpretedAction.XMIExtension value) {
		this.xmiExtension = value;
	}

	/**
	 * ��ȡisAsynchronous���Ե�ֵ��
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isIsAsynchronous() {
		return isAsynchronous;
	}

	/**
	 * ����isAsynchronous���Ե�ֵ��
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setIsAsynchronous(Boolean value) {
		this.isAsynchronous = value;
	}

	/**
	 * ��ȡname���Ե�ֵ��
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * ����name���Ե�ֵ��
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * ��ȡvisibility���Ե�ֵ��
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVisibility() {
		return visibility;
	}

	/**
	 * ����visibility���Ե�ֵ��
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVisibility(String value) {
		this.visibility = value;
	}

	/**
	 * <p>
	 * anonymous complex type�� Java �ࡣ
	 * 
	 * <p>
	 * ����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element ref="{omg.org/UML1.3}BehavioralFeature.parameter"/>
	 *       &lt;/sequence>
	 *       &lt;attribute name="xmi.extender" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "behavioralFeatureParameter" })
	public static class XMIExtension {

		@XmlElement(name = "BehavioralFeature.parameter", required = true)
		protected UMLBehavioralFeatureParameter behavioralFeatureParameter;
		@XmlAttribute(name = "xmi.extender", required = true)
		@XmlSchemaType(name = "anySimpleType")
		protected String xmiExtender;

		/**
		 * ��ȡbehavioralFeatureParameter���Ե�ֵ��
		 * 
		 * @return possible object is {@link UMLBehavioralFeatureParameter }
		 * 
		 */
		public UMLBehavioralFeatureParameter getBehavioralFeatureParameter() {
			return behavioralFeatureParameter;
		}

		/**
		 * ����behavioralFeatureParameter���Ե�ֵ��
		 * 
		 * @param value
		 *            allowed object is {@link UMLBehavioralFeatureParameter }
		 * 
		 */
		public void setBehavioralFeatureParameter(UMLBehavioralFeatureParameter value) {
			this.behavioralFeatureParameter = value;
		}

		/**
		 * ��ȡxmiExtender���Ե�ֵ��
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getXmiExtender() {
			return xmiExtender;
		}

		/**
		 * ����xmiExtender���Ե�ֵ��
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setXmiExtender(String value) {
			this.xmiExtender = value;
		}

	}

}
