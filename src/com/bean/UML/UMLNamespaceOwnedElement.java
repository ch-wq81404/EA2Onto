//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.05.09 时间 03:54:03 PM CST 
//

package com.bean.UML;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "associations", "dependency", "stereotype", "dataType", "activityModel",
		"collaboration", "classifierRole","generalization","stateMachine", "classes", "packages"})
@XmlRootElement(name = "Namespace.ownedElement", namespace = "omg.org/UML1.3")
public class UMLNamespaceOwnedElement  implements EAModel{

	@XmlElement(name = "Dependency", namespace = "omg.org/UML1.3")
	protected List<UMLDependency> dependency;

	@XmlElement(name = "Generalization", namespace = "omg.org/UML1.3")
	protected List<UMLGeneralization> generalization;

	@XmlElement(name = "StateMachine", namespace = "omg.org/UML1.3")
	protected UMLStateMachine stateMachine;

	@XmlElement(name = "Stereotype", namespace = "omg.org/UML1.3")
	protected UMLStereotype stereotype;
	
	@XmlElement(name = "DataType", namespace = "omg.org/UML1.3")
	protected List<UMLDataType> dataType;

	@XmlElement(name = "Class", namespace = "omg.org/UML1.3")
	protected List<UMLClass> classes;

	@XmlElement(name = "Association", namespace = "omg.org/UML1.3")
	protected List<UMLAssociation> associations;

	@XmlElement(name = "Collaboration", namespace = "omg.org/UML1.3")
	protected UMLCollaboration collaboration;

	@XmlElement(name = "Package", namespace = "omg.org/UML1.3")
	protected List<UMLPackage> packages;

	@XmlElement(name = "ClassifierRole", namespace = "omg.org/UML1.3")
	protected List<UMLClassifierRole> classifierRole;

	@XmlElement(name = "ActivityModel", namespace = "omg.org/UML1.3")
	protected UMLActivityModel activityModel;

	/**
	 * Gets the value of the associationOrClazzOrDependency property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the associationOrClazzOrDependency property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAssociationOrClazzOrDependency().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link UMLAssociation } {@link UMLClass } {@link UMLDependency }
	 * {@link UMLGeneralization } {@link UMLPackage } {@link UMLStateMachine }
	 * 
	 * 
	 */

	public List<UMLClass> getUmlClasses() {
		if (classes == null){
			classes = new ArrayList<UMLClass>();
		}
		return this.classes;
	}

	/**
	 * 获取stereotype属性的值。
	 * 
	 * @return possible object is {@link UMLStereotype }
	 * 
	 */
	public UMLStereotype getStereotype() {
		return stereotype;
	}

	/**
	 * 设置stereotype属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link UMLStereotype }
	 * 
	 */
	public void setStereotype(UMLStereotype value) {
		this.stereotype = value;
	}

	/**
	 * Gets the value of the dataType property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the dataType property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDataType().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link UMLDataType }
	 * 
	 * 
	 */
	public List<UMLDataType> getDataType() {
		if (dataType == null) {
			dataType = new ArrayList<UMLDataType>();
		}
		return this.dataType;
	}

	/**
	 * 获取activityModel属性的值。
	 * 
	 * @return possible object is {@link UMLActivityModel }
	 * 
	 */
	public UMLActivityModel getActivityModel() {
		return activityModel;
	}

	/**
	 * 设置activityModel属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link UMLActivityModel }
	 * 
	 */
	public void setActivityModel(UMLActivityModel value) {
		this.activityModel = value;
	}

	/**
	 * 获取collaboration属性的值。
	 * 
	 * @return possible object is {@link UMLCollaboration }
	 * 
	 */
	public UMLCollaboration getUmlCollaboration() {
		return collaboration;
	}

	/**
	 * 设置collaboration属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link UMLCollaboration }
	 * 
	 */
	public void setCollaboration(UMLCollaboration value) {
		this.collaboration = value;
	}

	/**
	 * Gets the value of the classifierRole property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the classifierRole property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getClassifierRole().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link UMLClassifierRole }
	 * 
	 * 
	 */
	public List<UMLClassifierRole> getClassifierRole() {
		if (classifierRole == null) {
			classifierRole = new ArrayList<UMLClassifierRole>();
		}
		return this.classifierRole;
	}

	public List<UMLAssociation> getUmlAssociations() {
		// TODO Auto-generated method stub
		if (associations == null) {
			associations = new ArrayList<UMLAssociation>();
		}
		return this.associations;
	}

	public List<UMLPackage> getUmlPackage() {
		// TODO Auto-generated method stub
		if (packages == null) {
			packages = new ArrayList<UMLPackage>();
		}
		return  this.packages;
	}

	public List<UMLDependency>  getUmlDependency() {
		// TODO Auto-generated method stub
		if (dependency == null) {
			dependency = new ArrayList<UMLDependency>();
		}
		return  this.dependency;
	}
	
	public List<UMLGeneralization> getUmlGeneralizations() {
		// TODO Auto-generated method stub
		if (generalization == null) {
			generalization = new ArrayList<UMLGeneralization>();
		}
		return this.generalization;
	}

}
