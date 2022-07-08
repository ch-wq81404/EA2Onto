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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ActionSequence complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ActionSequence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{omg.org/UML1.3}ActionSequenceSub"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "actionSequenceAction"
})
@XmlRootElement(name = "ActionSequence", namespace = "omg.org/UML1.3")
public class UMLActionSequence {

    @XmlElement(name = "ActionSequence.action", required = true, namespace = "omg.org/UML1.3")
    protected UMLActionSequenceAction actionSequenceAction;

    /**
     * 获取actionSequenceSub属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UMLActionSequenceSub }
     *     
     */
    public UMLActionSequenceAction getActionSequenceAction() {
        return actionSequenceAction;
    }

    /**
     * 设置actionSequenceSub属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UMLActionSequenceSub }
     *     
     */
    public void setActionSequenceSub(UMLActionSequenceAction value) {
        this.actionSequenceAction = value;
    }

}
