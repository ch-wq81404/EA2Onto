//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2022.05.09 ʱ�� 03:54:03 PM CST 
//


package com.bean.UML;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{omg.org/UML1.3}DiagramElementSub" maxOccurs="unbounded"/>
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
    "diagramElementSub"
})
@XmlRootElement(name = "Diagram.element", namespace = "omg.org/UML1.3")

public class UMLDiagramElement  implements EAModel{
	
    @XmlElement(name = "DiagramElement", required = true, namespace = "omg.org/UML1.3")
    protected List<UMLDiagramElementSub> diagramElementSub;

    /**
     * Gets the value of the diagramElementSub property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diagramElementSub property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagramElementSub().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UMLDiagramElementSub }
     * 
     * 
     */
    public List<UMLDiagramElementSub> getDiagramElementSub() {
        if (diagramElementSub == null) {
            diagramElementSub = new ArrayList<UMLDiagramElementSub>();
        }
        return this.diagramElementSub;
    }

	public String getSubject() {
		// TODO Auto-generated method stub
		return null;
	}

}
