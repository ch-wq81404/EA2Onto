//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.05.09 时间 03:54:03 PM CST 
//


package com.bean.UML;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classifier complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Classifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{omg.org/UML1.3}ClassifierSub"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuralFeature.type", propOrder = {
    "classifierSub"
})
public class UMLClassifier  implements EAModel {

    @XmlElement(name = "Classifier", required = true, namespace = "omg.org/UML1.3")
    protected UMLClassifierSub classifierSub;

    /**
     * 获取classifierSub属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UMLClassifierSub }
     *     
     */
    public UMLClassifierSub getClassifierSub() {
        return classifierSub;
    }

    /**
     * 设置classifierSub属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UMLClassifierSub }
     *     
     */
    public void setClassifierSub(UMLClassifierSub value) {
        this.classifierSub = value;
    }

}
