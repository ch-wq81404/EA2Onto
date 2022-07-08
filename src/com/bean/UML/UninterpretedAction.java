//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.05.09 时间 03:54:03 PM CST 
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
 * anonymous complex type的 Java 类。
 * 
 * <p>
 * 以下模式片段指定包含在此类中的预期内容。
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
	 * 获取modelElementTaggedValue属性的值。
	 * 
	 * @return possible object is {@link UMLModelElementTaggedValue }
	 * 
	 */
	public UMLModelElementTaggedValue getModelElementTaggedValue() {
		return modelElementTaggedValue;
	}

	/**
	 * 设置modelElementTaggedValue属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link UMLModelElementTaggedValue }
	 * 
	 */
	public void setModelElementTaggedValue(UMLModelElementTaggedValue value) {
		this.modelElementTaggedValue = value;
	}

	/**
	 * 获取xmiExtension属性的值。
	 * 
	 * @return possible object is {@link UninterpretedAction.XMIExtension }
	 * 
	 */
	public UninterpretedAction.XMIExtension getXMIExtension() {
		return xmiExtension;
	}

	/**
	 * 设置xmiExtension属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link UninterpretedAction.XMIExtension }
	 * 
	 */
	public void setXMIExtension(UninterpretedAction.XMIExtension value) {
		this.xmiExtension = value;
	}

	/**
	 * 获取isAsynchronous属性的值。
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isIsAsynchronous() {
		return isAsynchronous;
	}

	/**
	 * 设置isAsynchronous属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setIsAsynchronous(Boolean value) {
		this.isAsynchronous = value;
	}

	/**
	 * 获取name属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置name属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * 获取visibility属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVisibility() {
		return visibility;
	}

	/**
	 * 设置visibility属性的值。
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
	 * anonymous complex type的 Java 类。
	 * 
	 * <p>
	 * 以下模式片段指定包含在此类中的预期内容。
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
		 * 获取behavioralFeatureParameter属性的值。
		 * 
		 * @return possible object is {@link UMLBehavioralFeatureParameter }
		 * 
		 */
		public UMLBehavioralFeatureParameter getBehavioralFeatureParameter() {
			return behavioralFeatureParameter;
		}

		/**
		 * 设置behavioralFeatureParameter属性的值。
		 * 
		 * @param value
		 *            allowed object is {@link UMLBehavioralFeatureParameter }
		 * 
		 */
		public void setBehavioralFeatureParameter(UMLBehavioralFeatureParameter value) {
			this.behavioralFeatureParameter = value;
		}

		/**
		 * 获取xmiExtender属性的值。
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getXmiExtender() {
			return xmiExtender;
		}

		/**
		 * 设置xmiExtender属性的值。
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
