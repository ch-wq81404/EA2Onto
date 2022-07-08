//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.05.09 时间 03:54:03 PM CST 
//


package com.bean.UML;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bean package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class UMLObjectFactory {

    private final static QName _StateExit_QNAME = new QName("omg.org/UML1.3", "State.exit");
    private final static QName _TransitionEffect_QNAME = new QName("omg.org/UML1.3", "Transition.effect");
    private final static QName _StructuralFeatureType_QNAME = new QName("omg.org/UML1.3", "StructuralFeature.type");
    private final static QName _ParameterDefaultValue_QNAME = new QName("omg.org/UML1.3", "Parameter.defaultValue");
    private final static QName _StereotypeBaseClass_QNAME = new QName("omg.org/UML1.3", "Stereotype.baseClass");
    private final static QName _AttributeInitialValue_QNAME = new QName("omg.org/UML1.3", "Attribute.initialValue");
    private final static QName _ParameterType_QNAME = new QName("omg.org/UML1.3", "Parameter.type");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bean
     * 
     */
    public UMLObjectFactory() {
    }

    /**
     * Create an instance of {@link UninterpretedAction }
     * 
     */
    public UninterpretedAction createUninterpretedAction() {
        return new UninterpretedAction();
    }

    /**
     * Create an instance of {@link XMI }
     * 
     */
    public XMI createXMI() {
        return new XMI();
    }

    /**
     * Create an instance of {@link XMI.XMIExtensions }
     * 
     */
    public XMI.XMIExtensions createXMIXMIExtensions() {
        return new XMI.XMIExtensions();
    }

    /**
     * Create an instance of {@link XMI.XMIHeader }
     * 
     */
    public XMI.XMIHeader createXMIXMIHeader() {
        return new XMI.XMIHeader();
    }


    /**
     * Create an instance of {@link UMLStateMachineTransitions }
     * 
     */
    public UMLStateMachineTransitions createStateMachineTransitions() {
        return new UMLStateMachineTransitions();
    }

    /**
     * Create an instance of {@link UMLTransition }
     * 
     */
    public UMLTransition createTransition() {
        return new UMLTransition();
    }

    /**
     * Create an instance of {@link UMLTransitionTrigger }
     * 
     */
    public UMLTransitionTrigger createTransitionTrigger() {
        return new UMLTransitionTrigger();
    }

    /**
     * Create an instance of {@link UMLEvent }
     * 
     */
    public UMLEvent createEvent() {
        return new UMLEvent();
    }

    /**
     * Create an instance of {@link UMLTransitionGuard }
     * 
     */
    public UMLTransitionGuard createTransitionGuard() {
        return new UMLTransitionGuard();
    }

    /**
     * Create an instance of {@link UMLGuard }
     * 
     */
    public UMLGuard createGuard() {
        return new UMLGuard();
    }

    /**
     * Create an instance of {@link UMLGuardExpression }
     * 
     */
    public UMLGuardExpression createGuardExpression() {
        return new UMLGuardExpression();
    }

    /**
     * Create an instance of {@link UMLBooleanExpression }
     * 
     */
    public UMLBooleanExpression createBooleanExpression() {
        return new UMLBooleanExpression();
    }

    /**
     * Create an instance of {@link UMLActionSequence }
     * 
     */
    public UMLActionSequence createActionSequence() {
        return new UMLActionSequence();
    }

    /**
     * Create an instance of {@link UMLModelElementTaggedValue }
     * 
     */
    public UMLModelElementTaggedValue createModelElementTaggedValue() {
        return new UMLModelElementTaggedValue();
    }

    /**
     * Create an instance of {@link UMLTaggedValue }
     * 
     */
    public UMLTaggedValue createTaggedValue() {
        return new UMLTaggedValue();
    }

    /**
     * Create an instance of {@link UMLAssociationEnd }
     * 
     */
    public UMLAssociationEnd createAssociationEnd() {
        return new UMLAssociationEnd();
    }

    /**
     * Create an instance of {@link UMLStereotype }
     * 
     */
    public UMLStereotype createStereotype() {
        return new UMLStereotype();
    }

    /**
     * Create an instance of {@link UMLGeneralization }
     * 
     */
    public UMLGeneralization createGeneralization() {
        return new UMLGeneralization();
    }

    /**
     * Create an instance of {@link UMLClassifierRole }
     * 
     */
    public UMLClassifierRole createClassifierRole() {
        return new UMLClassifierRole();
    }

    /**
     * Create an instance of {@link UMLModelElementStereotype }
     * 
     */
    public UMLModelElementStereotype createModelElementStereotype() {
        return new UMLModelElementStereotype();
    }

    /**
     * Create an instance of {@link UMLBehavioralFeatureParameter }
     * 
     */
    public UMLBehavioralFeatureParameter createBehavioralFeatureParameter() {
        return new UMLBehavioralFeatureParameter();
    }

    /**
     * Create an instance of {@link UMLParameter }
     * 
     */
    public UMLParameter createParameter() {
        return new UMLParameter();
    }

    /**
     * Create an instance of {@link UMLClassifier }
     * 
     */
    public UMLClassifier createClassifier() {
        return new UMLClassifier();
    }

    /**
     * Create an instance of {@link UMLExpression }
     * 
     */
    public UMLExpression createExpression() {
        return new UMLExpression();
    }

    /**
     * Create an instance of {@link UMLCompositeStateSubstate }
     * 
     */
    public UMLCompositeStateSubstate createCompositeStateSubstate() {
        return new UMLCompositeStateSubstate();
    }

    /**
     * Create an instance of {@link UMLActionState }
     * 
     */
    public UMLActionState createActionState() {
        return new UMLActionState();
    }

    /**
     * Create an instance of {@link UMLPseudoState }
     * 
     */
    public UMLPseudoState createPseudoState() {
        return new UMLPseudoState();
    }

    /**
     * Create an instance of {@link UMLSimpleState }
     * 
     */
    public UMLSimpleState createSimpleState() {
        return new UMLSimpleState();
    }

    /**
     * Create an instance of {@link UMLStateInternalTransition }
     * 
     */
    public UMLStateInternalTransition createStateInternalTransition() {
        return new UMLStateInternalTransition();
    }

    /**
     * Create an instance of {@link UMLClassifierSub }
     * 
     */
    public UMLClassifierSub createClassifierSub() {
        return new UMLClassifierSub();
    }

    /**
     * Create an instance of {@link UMLCompositeState }
     * 
     */
    public UMLCompositeState createCompositeState() {
        return new UMLCompositeState();
    }

    /**
     * Create an instance of {@link UMLNamespaceOwnedElement }
     * 
     */
    public UMLNamespaceOwnedElement createNamespaceOwnedElement() {
        return new UMLNamespaceOwnedElement();
    }

    /**
     * Create an instance of {@link UMLAssociation }
     * 
     */
    public UMLAssociation createAssociation() {
        return new UMLAssociation();
    }

    /**
     * Create an instance of {@link UMLAssociationConnection }
     * 
     */
    public UMLAssociationConnection createAssociationConnection() {
        return new UMLAssociationConnection();
    }

    /**
     * Create an instance of {@link UMLClass }
     * 
     */
    public UMLClass createClass() {
        return new UMLClass();
    }

    /**
     * Create an instance of {@link UMLClassifierFeature }
     * 
     */
    public UMLClassifierFeature createClassifierFeature() {
        return new UMLClassifierFeature();
    }

    /**
     * Create an instance of {@link UMLAttribute }
     * 
     */
    public UMLAttribute createAttribute() {
        return new UMLAttribute();
    }

    /**
     * Create an instance of {@link UMLOperation }
     * 
     */
    public UMLOperation createOperation() {
        return new UMLOperation();
    }

    /**
     * Create an instance of {@link UMLDependency }
     * 
     */
    public UMLDependency createDependency() {
        return new UMLDependency();
    }

    /**
     * Create an instance of {@link UMLPackage }
     * 
     */
    public UMLPackage createPackage() {
        return new UMLPackage();
    }

    /**
     * Create an instance of {@link UMLStateMachine }
     * 
     */
    public UMLStateMachine createStateMachine() {
        return new UMLStateMachine();
    }

    /**
     * Create an instance of {@link UMLDataType }
     * 
     */
    public UMLDataType createDataType() {
        return new UMLDataType();
    }

    /**
     * Create an instance of {@link UMLActivityModel }
     * 
     */
    public UMLActivityModel createActivityModel() {
        return new UMLActivityModel();
    }

    /**
     * Create an instance of {@link UMLStateMachineTop }
     * 
     */
    public UMLStateMachineTop createStateMachineTop() {
        return new UMLStateMachineTop();
    }

    /**
     * Create an instance of {@link UMLCollaboration }
     * 
     */
    public UMLCollaboration createCollaboration() {
        return new UMLCollaboration();
    }

    /**
     * Create an instance of {@link UMLCollaborationInteraction }
     * 
     */
    public UMLCollaborationInteraction createCollaborationInteraction() {
        return new UMLCollaborationInteraction();
    }

    /**
     * Create an instance of {@link UMLDiagramElementSub }
     * 
     */
    public UMLDiagramElementSub createDiagramElementSub() {
        return new UMLDiagramElementSub();
    }

    /**
     * Create an instance of {@link UMLDiagramElement }
     * 
     */
    public UMLDiagramElement createDiagramElement() {
        return new UMLDiagramElement();
    }

    /**
     * Create an instance of {@link UMLActionSequenceAction }
     * 
     */
    public UMLActionSequenceAction createActionSequenceAction() {
        return new UMLActionSequenceAction();
    }

    /**
     * Create an instance of {@link UninterpretedAction.XMIExtension }
     * 
     */
    public UninterpretedAction.XMIExtension createUninterpretedActionXMIExtension() {
        return new UninterpretedAction.XMIExtension();
    }

    /**
     * Create an instance of {@link UMLDiagram }
     * 
     */
    public UMLDiagram createDiagram() {
        return new UMLDiagram();
    }


    /**
     * Create an instance of {@link UMLModel }
     * 
     */
    public UMLModel createModel() {
        return new UMLModel();
    }

    /**
     * Create an instance of {@link XMI.XMIContent }
     * 
     */
    public XMI.XMIContent createXMIXMIContent() {
        return new XMI.XMIContent();
    }

    /**
     * Create an instance of {@link XMI.XMIDifference }
     * 
     */
    public XMI.XMIDifference createXMIXMIDifference() {
        return new XMI.XMIDifference();
    }

    /**
     * Create an instance of {@link XMI.XMIExtensions.EAModelParamSub }
     * 
     */
    public XMI.XMIExtensions.EAModelParamSub createXMIXMIExtensionsEAModelParamSub() {
        return new XMI.XMIExtensions.EAModelParamSub();
    }

    /**
     * Create an instance of {@link XMI.XMIExtensions.EAStub }
     * 
     */
    public XMI.XMIExtensions.EAStub createXMIXMIExtensionsEAStub() {
        return new XMI.XMIExtensions.EAStub();
    }

    /**
     * Create an instance of {@link XMI.XMIHeader.XMIDocumentation }
     * 
     */
    public XMI.XMIHeader.XMIDocumentation createXMIXMIHeaderXMIDocumentation() {
        return new XMI.XMIHeader.XMIDocumentation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UMLActionSequence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "omg.org/UML1.3", name = "State.exit")
    public JAXBElement<UMLActionSequence> createStateExit(UMLActionSequence value) {
        return new JAXBElement<UMLActionSequence>(_StateExit_QNAME, UMLActionSequence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UMLActionSequence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "omg.org/UML1.3", name = "Transition.effect")
    public JAXBElement<UMLActionSequence> createTransitionEffect(UMLActionSequence value) {
        return new JAXBElement<UMLActionSequence>(_TransitionEffect_QNAME, UMLActionSequence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UMLClassifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "omg.org/UML1.3", name = "StructuralFeature.type")
    public JAXBElement<UMLClassifier> createStructuralFeatureType(UMLClassifier value) {
        return new JAXBElement<UMLClassifier>(_StructuralFeatureType_QNAME, UMLClassifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UMLExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "omg.org/UML1.3", name = "Parameter.defaultValue")
    public JAXBElement<UMLExpression> createParameterDefaultValue(UMLExpression value) {
        return new JAXBElement<UMLExpression>(_ParameterDefaultValue_QNAME, UMLExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "omg.org/UML1.3", name = "Stereotype.baseClass")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStereotypeBaseClass(String value) {
        return new JAXBElement<String>(_StereotypeBaseClass_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UMLExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "omg.org/UML1.3", name = "Attribute.initialValue")
    public JAXBElement<UMLExpression> createAttributeInitialValue(UMLExpression value) {
        return new JAXBElement<UMLExpression>(_AttributeInitialValue_QNAME, UMLExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UMLClassifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "omg.org/UML1.3", name = "Parameter.type")
    public JAXBElement<UMLClassifier> createParameterType(UMLClassifier value) {
        return new JAXBElement<UMLClassifier>(_ParameterType_QNAME, UMLClassifier.class, null, value);
    }

}
