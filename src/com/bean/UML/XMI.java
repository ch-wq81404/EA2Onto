//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2022.05.09 ʱ�� 03:54:03 PM CST 
//


package com.bean.UML;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xmiHeader",
    "xmiContent",
    "xmiDifference",
    "xmiExtensions"
})
@XmlRootElement(name = "XMI")
public class XMI implements EAModel{

    @XmlElement(name = "XMI.header", required = true)
    protected XMI.XMIHeader xmiHeader;
    @XmlElement(name = "XMI.content", required = true)
    protected XMI.XMIContent xmiContent;
    @XmlElement(name = "XMI.difference",  required = true)
    protected XMI.XMIDifference xmiDifference;
    @XmlElement(name = "XMI.extensions",  required = true)
    protected XMI.XMIExtensions xmiExtensions;
    @XmlAttribute(name = "timestamp", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String timestamp;
    @XmlAttribute(name = "xmi.version", required = true)
    protected BigDecimal xmiVersion;

    /**
     * ��ȡxmiHeader���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMI.XMIHeader }
     *     
     */
    public XMI.XMIHeader getXMIHeader() {
        return xmiHeader;
    }

    /**
     * ����xmiHeader���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMI.XMIHeader }
     *     
     */
    public void setXMIHeader(XMI.XMIHeader value) {
        this.xmiHeader = value;
    }

    /**
     * ��ȡxmiContent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMI.XMIContent }
     *     
     */
    public XMI.XMIContent getXMIContent() {
        return xmiContent;
    }

    /**
     * ����xmiContent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMI.XMIContent }
     *     
     */
    public void setXMIContent(XMI.XMIContent value) {
        this.xmiContent = value;
    }

    /**
     * ��ȡxmiDifference���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMI.XMIDifference }
     *     
     */
    public XMI.XMIDifference getXMIDifference() {
        return xmiDifference;
    }

    /**
     * ����xmiDifference���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMI.XMIDifference }
     *     
     */
    public void setXMIDifference(XMI.XMIDifference value) {
        this.xmiDifference = value;
    }

    /**
     * ��ȡxmiExtensions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMI.XMIExtensions }
     *     
     */
    public XMI.XMIExtensions getXMIExtensions() {
        return xmiExtensions;
    }

    /**
     * ����xmiExtensions���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMI.XMIExtensions }
     *     
     */
    public void setXMIExtensions(XMI.XMIExtensions value) {
        this.xmiExtensions = value;
    }

    /**
     * ��ȡtimestamp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * ����timestamp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    /**
     * ��ȡxmiVersion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXmiVersion() {
        return xmiVersion;
    }

    /**
     * ����xmiVersion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXmiVersion(BigDecimal value) {
        this.xmiVersion = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "model",
        "umlTaggedValues",
        "umlDiagram",
        "diagramElementSub"
    })
    public static class XMIContent  implements EAModel{

        @XmlElement(name = "Model", required = true, namespace = "omg.org/UML1.3")
        protected UMLModel model;
        @XmlElement(name = "TaggedValue", required = true , namespace = "omg.org/UML1.3")
        protected List<UMLTaggedValue> umlTaggedValues;
        @XmlElement(name = "Diagram", required = true , namespace = "omg.org/UML1.3")
        protected List<UMLDiagram> umlDiagram;
        @XmlElement(name = "DiagramElement",required = true, namespace = "omg.org/UML1.3")
        protected List<UMLDiagramElementSub> diagramElementSub;

        /**
         * ��ȡmodel���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link UMLModel }
         *     
         */
        public UMLModel getModel() {
            return model;
        }

        /**
         * ����model���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link UMLModel }
         *     
         */
        public void setModel(UMLModel value) {
            this.model = value;
        }

        /**
         * Gets the value of the taggedValueOrDiagram property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taggedValueOrDiagram property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaggedValueOrDiagram().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UMLTaggedValue }
         * {@link UMLDiagram }
         * 
         * 
         */
        
        public List<UMLTaggedValue>	getTaggedValue(){
        	if (umlTaggedValues == null) {
        		umlTaggedValues = new ArrayList<UMLTaggedValue>();
            }
            return this.umlTaggedValues;
        }
        
        public List<UMLDiagram> getDiagram(){
        	if (umlDiagram == null) {
        		umlDiagram = new ArrayList<UMLDiagram>();
            }
            return this.umlDiagram;
        }
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

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class XMIDifference  implements EAModel{


    }


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
     *         &lt;element name="EAModel.paramSub">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="EAStub" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="UMLType" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                 &lt;attribute name="xmi.id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
    @XmlType(name = "", propOrder = {
        "eaModelParamSub",
        "eaStub"
    })
    public static class XMIExtensions  implements EAModel{

        @XmlElement(name = "EAModel.paramSub", namespace = "", required = true)
        protected XMI.XMIExtensions.EAModelParamSub eaModelParamSub;
        @XmlElement(name = "EAStub", namespace = "", required = true)
        protected List<XMI.XMIExtensions.EAStub> eaStub;
        @XmlAttribute(name = "xmi.extender", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String xmiExtender;

        /**
         * ��ȡeaModelParamSub���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link XMI.XMIExtensions.EAModelParamSub }
         *     
         */
        public XMI.XMIExtensions.EAModelParamSub getEAModelParamSub() {
            return eaModelParamSub;
        }

        /**
         * ����eaModelParamSub���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link XMI.XMIExtensions.EAModelParamSub }
         *     
         */
        public void setEAModelParamSub(XMI.XMIExtensions.EAModelParamSub value) {
            this.eaModelParamSub = value;
        }

        /**
         * Gets the value of the eaStub property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eaStub property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEAStub().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XMI.XMIExtensions.EAStub }
         * 
         * 
         */
        public List<XMI.XMIExtensions.EAStub> getEAStub() {
            if (eaStub == null) {
                eaStub = new ArrayList<XMI.XMIExtensions.EAStub>();
            }
            return this.eaStub;
        }

        /**
         * ��ȡxmiExtender���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXmiExtender() {
            return xmiExtender;
        }

        /**
         * ����xmiExtender���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXmiExtender(String value) {
            this.xmiExtender = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class EAModelParamSub {


        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="UMLType" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
        @XmlType(name = "")
        public static class EAStub {

            @XmlAttribute(name = "UMLType", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected String umlType;
            @XmlAttribute(name = "name", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected String name;
            @XmlAttribute(name = "xmi.id", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String xmiId;

            /**
             * ��ȡumlType���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUMLType() {
                return umlType;
            }

            /**
             * ����umlType���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUMLType(String value) {
                this.umlType = value;
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

    }


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
     *         &lt;element name="XMI.documentation">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="XMI.exporter" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="XMI.exporterVersion" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "xmiDocumentation"
    })
    public static class XMIHeader  implements EAModel{

        @XmlElement(name = "XMI.documentation", namespace = "", required = true)
        protected XMI.XMIHeader.XMIDocumentation xmiDocumentation;

        /**
         * ��ȡxmiDocumentation���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link XMI.XMIHeader.XMIDocumentation }
         *     
         */
        public XMI.XMIHeader.XMIDocumentation getXMIDocumentation() {
            return xmiDocumentation;
        }

        /**
         * ����xmiDocumentation���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link XMI.XMIHeader.XMIDocumentation }
         *     
         */
        public void setXMIDocumentation(XMI.XMIHeader.XMIDocumentation value) {
            this.xmiDocumentation = value;
        }


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
         *         &lt;element name="XMI.exporter" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="XMI.exporterVersion" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
            "xmiExporter",
            "xmiExporterVersion"
        })
        public static class XMIDocumentation  implements EAModel{

            @XmlElement(name = "XMI.exporter", namespace = "", required = true)
            protected String xmiExporter;
            @XmlElement(name = "XMI.exporterVersion", namespace = "", required = true)
            protected BigDecimal xmiExporterVersion;

            /**
             * ��ȡxmiExporter���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXMIExporter() {
                return xmiExporter;
            }

            /**
             * ����xmiExporter���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXMIExporter(String value) {
                this.xmiExporter = value;
            }

            /**
             * ��ȡxmiExporterVersion���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getXMIExporterVersion() {
                return xmiExporterVersion;
            }

            /**
             * ����xmiExporterVersion���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setXMIExporterVersion(BigDecimal value) {
                this.xmiExporterVersion = value;
            }

        }

    }

}
