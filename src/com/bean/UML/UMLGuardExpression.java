//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2022.05.09 ʱ�� 03:54:03 PM CST 
//


package com.bean.UML;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{omg.org/UML1.3}BooleanExpression"/>
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
    "booleanExpression"
})
@XmlRootElement(name = "Guard.expression", namespace = "omg.org/UML1.3")
public class UMLGuardExpression {

    @XmlElement(name = "BooleanExpression", required = true, namespace = "omg.org/UML1.3")
    protected UMLBooleanExpression booleanExpression;

    /**
     * ��ȡbooleanExpression���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link UMLBooleanExpression }
     *     
     */
    public UMLBooleanExpression getBooleanExpression() {
        return booleanExpression;
    }

    /**
     * ����booleanExpression���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link UMLBooleanExpression }
     *     
     */
    public void setBooleanExpression(UMLBooleanExpression value) {
        this.booleanExpression = value;
    }

}
