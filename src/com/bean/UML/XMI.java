//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.05.09 时间 03:54:03 PM CST 
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
     * 获取xmiHeader属性的值。
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
     * 设置xmiHeader属性的值。
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
     * 获取xmiContent属性的值。
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
     * 设置xmiContent属性的值。
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
     * 获取xmiDifference属性的值。
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
     * 设置xmiDifference属性的值。
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
     * 获取xmiExtensions属性的值。
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
     * 设置xmiExtensions属性的值。
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
     * 获取timestamp属性的值。
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
     * 设置timestamp属性的值。
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
     * 获取xmiVersion属性的值。
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
     * 设置xmiVersion属性的值。
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
         * 获取model属性的值。
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
         * 设置model属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取eaModelParamSub属性的值。
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
         * 设置eaModelParamSub属性的值。
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
         * 获取xmiExtender属性的值。
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
         * 设置xmiExtender属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取umlType属性的值。
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
             * 设置umlType属性的值。
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
             * 获取name属性的值。
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
             * 设置name属性的值。
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
             * 获取xmiId属性的值。
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
             * 设置xmiId属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取xmiDocumentation属性的值。
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
         * 设置xmiDocumentation属性的值。
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
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
             * 获取xmiExporter属性的值。
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
             * 设置xmiExporter属性的值。
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
             * 获取xmiExporterVersion属性的值。
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
             * 设置xmiExporterVersion属性的值。
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
