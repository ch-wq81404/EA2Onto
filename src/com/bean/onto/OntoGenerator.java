package com.bean.onto;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//import org.semanticweb.elk.owlapi.ElkReasonerFactory;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.io.RDFXMLOntologyFormat;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataOneOf;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.reasoner.structural.StructuralReasonerFactory;
import org.semanticweb.owlapi.vocab.OWL2Datatype;
import org.swrlapi.exceptions.SWRLBuiltInException;
import org.swrlapi.parser.SWRLParseException;

public class OntoGenerator {
	OWLOntology ont;
	OWLOntologyManager manager;
	OWLDataFactory factory;
	IRI ontIRI;
	OWLReasoner reasoner;
	
	public OntoGenerator() {
		manager = OWLManager.createOWLOntologyManager();

	}

	public void init(String path, String base)
			throws OWLOntologyCreationException, SWRLParseException, SWRLBuiltInException, OWLOntologyStorageException {

		// String rootPath = System.getProperty("user.dir");
		// OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		// File file = new File(rootPath + "\\src\\resource\\TIM.xml");
		File file = new File(path);
		// String base =
		// "http://www.semanticweb.org/21926/ontologies/2022/5/TIM#";
		ontIRI = IRI.create(base);
		// ont=manager.loadOntologyFromOntologyDocument(file);
		try {
			ont = manager.loadOntologyFromOntologyDocument(file);
			factory = manager.getOWLDataFactory();
			OWLReasonerFactory reasonerFactory = new StructuralReasonerFactory();
			
			reasoner=reasonerFactory.createReasoner(ont);
		} catch (OWLOntologyCreationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// OWLDataFactory factory = manager.getOWLDataFactory();
		// 添加子类
		// OWLClass block = factory.getOWLClass(IRI.create(ontologyIRI +
		// "Block"));
		// OWLClass robot = factory.getOWLClass(IRI.create(ontologyIRI +
		// "Robot"));
		// OWLSubClassOfAxiom ca = factory.getOWLSubClassOfAxiom(block, robot);
		// manager.addAxiom(ont, ca);

		// OWLClass adult = factory.getOWLClass(IRI.create(ontologyIRI +
		// "#Adult"));
		// OWLClass person = factory.getOWLClass(IRI.create(ontologyIRI +
		// "#Person"));
		// OWLDataProperty hasAge =
		// factory.getOWLDataProperty(IRI.create(ontologyIRI + "#hasAge"));
		//
		//// 新建个体
		// OWLNamedIndividual john =
		// factory.getOWLNamedIndividual(IRI.create(ontologyIRI + "#John"));
		// OWLNamedIndividual andrea =
		// factory.getOWLNamedIndividual(IRI.create(ontologyIRI + "#Andrea"));
		//
		//// 为类增加个体
		// OWLClassAssertionAxiom classAssertion =
		// factory.getOWLClassAssertionAxiom(person, john);
		// manager.addAxiom(ontology, classAssertion);
		// classAssertion = factory.getOWLClassAssertionAxiom(person, andrea);
		// manager.addAxiom(ontology, classAssertion);
		//
		//// 设置数据属性关系
		// OWLDatatype integerDatatype =
		// factory.getOWLDatatype(OWL2Datatype.XSD_INTEGER.getIRI());
		// OWLLiteral literal = factory.getOWLLiteral("41", integerDatatype);
		// OWLAxiom ax = factory.getOWLDataPropertyAssertionAxiom(hasAge,
		// andrea, literal);
		// manager.addAxiom(ontology, ax);
		//
		// literal = factory.getOWLLiteral("15", integerDatatype);
		// ax = factory.getOWLDataPropertyAssertionAxiom(hasAge, john, literal);
		// manager.addAxiom(ontology, ax);
		//
		// SWRLRuleEngine ruleEngine =
		// SWRLAPIFactory.createSWRLRuleEngine(ontology);
		// ruleEngine.createSWRLRule("r1",
		// "Person(?p)^hasAge(?p,?age)^swrlb:greaterThan(?age,17) ->
		// Adult(?p)");
		//
		// manager.saveOntology(ontology, IRI.create(((new
		// File("FILE_PATH")).toURI())));
	}

	public int getAximCount() {
		return ont.getAxiomCount();
	}

	public void saveAsFile(String fileName) throws OWLOntologyStorageException, IOException {
		File directory = new File("generate");
		if (!directory.exists())
			directory.mkdirs();
		final OWLOntologyManager m = OWLManager.createOWLOntologyManager();
		// System.out.println(ont.getAxiomCount());
		File file = new File(fileName);
		if (!file.exists())
			file.createNewFile();

		// extract module which you are interested
		// SyntacticLocalityModuleExtractor sme = new
		// SyntacticLocalityModuleExtractor(m, ont, ModuleType.BOT);
		// Set<OWLAxiom> moduleAxioms = sme.extract(signature);
		//
		// OWLOntology module = m.createOntology(IRI.generateDocumentIRI());
		// m.addAxioms(module, moduleAxioms);

		OutputStream moduleOutputStream = null;
		moduleOutputStream = new FileOutputStream(file);
		m.saveOntology(ont, new RDFXMLOntologyFormat(), moduleOutputStream);
	}

	public void createClassesOfParent(List<String> names, String parent) {
		OWLClass _parent = factory.getOWLClass(IRI.create(ontIRI + parent));
		OWLSubClassOfAxiom axiom;
		for (String name : names) {
			OWLClass child = factory.getOWLClass(IRI.create(ontIRI + name));
			axiom = factory.getOWLSubClassOfAxiom(child, _parent);
			manager.addAxiom(ont, axiom);
		}
	}

	public void createClassOfParent(String name, String parent) {
		OWLClass _parent = factory.getOWLClass(IRI.create(ontIRI + parent));
		OWLSubClassOfAxiom axiom;
		OWLClass child = factory.getOWLClass(IRI.create(ontIRI + name));
		axiom = factory.getOWLSubClassOfAxiom(child, _parent);
		manager.addAxiom(ont, axiom);
	}

	public void createClasses(List<String> names) {
		for (String name : names)
			factory.getOWLClass(IRI.create(ontIRI + name));
	}

	public void createClass(String name) {
		factory.getOWLClass(IRI.create(ontIRI + name));
	}

	public void createIndividualsOfClass(List<String> names, String type) {
		OWLClass _type = factory.getOWLClass(IRI.create(ontIRI + type));
		OWLClassAssertionAxiom axiom;
		for (String name : names) {
			OWLNamedIndividual individual = factory.getOWLNamedIndividual(IRI.create(ontIRI + name));
			axiom = factory.getOWLClassAssertionAxiom(_type, individual);
			manager.addAxiom(ont, axiom);
		}
	}

	public boolean createIndividualOfClass(String name, String type) {
		if (name==null || type == null || ont.containsIndividualInSignature(IRI.create(ontIRI + name)))
			return false;
		OWLClass _type = factory.getOWLClass(IRI.create(ontIRI + type));
		OWLClassAssertionAxiom axiom;
		OWLNamedIndividual individual = factory.getOWLNamedIndividual(IRI.create(ontIRI + name));
		axiom = factory.getOWLClassAssertionAxiom(_type, individual);
		manager.addAxiom(ont, axiom);
		return true;
	}

	public void createObjectPropertyAxiom(String objp, String subject, String object) {
		OWLObjectProperty p = factory.getOWLObjectProperty(IRI.create(ontIRI + objp));
		OWLNamedIndividual sub = factory.getOWLNamedIndividual(IRI.create(ontIRI + subject));
		OWLNamedIndividual obj = factory.getOWLNamedIndividual(IRI.create(ontIRI + object));
		OWLAxiom ax = factory.getOWLObjectPropertyAssertionAxiom(p, sub, obj);
		manager.addAxiom(ont, ax);
	}

	public void createObjectPropertyAxiom(String objp, String cmname, OWLNamedIndividual i) {
		// TODO Auto-generated method stub
		OWLObjectProperty p = factory.getOWLObjectProperty(IRI.create(ontIRI + objp));
		OWLNamedIndividual sub = factory.getOWLNamedIndividual(IRI.create(ontIRI + cmname));
		OWLAxiom ax = factory.getOWLObjectPropertyAssertionAxiom(p, sub, i);
		manager.addAxiom(ont, ax);
	}

	public void createObjectPropertyAxioms(String objp, String subject, List<String> classes) {
		// TODO Auto-generated method stub
		OWLObjectProperty p = factory.getOWLObjectProperty(IRI.create(ontIRI + objp));
		OWLNamedIndividual sub = factory.getOWLNamedIndividual(IRI.create(ontIRI + subject));
		for (String object : classes) {
			OWLNamedIndividual obj = factory.getOWLNamedIndividual(IRI.create(ontIRI + object));
			OWLAxiom ax = factory.getOWLObjectPropertyAssertionAxiom(p, sub, obj);
			manager.addAxiom(ont, ax);
		}

	}

	public void createDataPropertyAxiom(String dtp, String subject, String object) {
		OWLDataProperty p = factory.getOWLDataProperty(IRI.create(ontIRI + dtp));
		OWLNamedIndividual sub = factory.getOWLNamedIndividual(IRI.create(ontIRI + subject));
		OWLDatatype stringDt = factory.getOWLDatatype(OWL2Datatype.XSD_STRING.getIRI());
		OWLLiteral literal = factory.getOWLLiteral(object, stringDt);
		OWLAxiom ax = factory.getOWLDataPropertyAssertionAxiom(p, sub, literal);
		manager.addAxiom(ont, ax);
	}

	public void addRangeOfDataProperty(String string, List<String> string2) {
		// TODO Auto-generated method stub
		OWLDataProperty p = factory.getOWLDataProperty(IRI.create(ontIRI + string));
		List<OWLLiteral> literals = string2.stream().map(s -> factory.getOWLLiteral(s)).collect(Collectors.toList());
		OWLDataOneOf range = factory.getOWLDataOneOf(literals.toArray(new OWLLiteral[literals.size()]));
		factory.getOWLFunctionalDataPropertyAxiom(p);
		OWLDataPropertyRangeAxiom axiom = factory.getOWLDataPropertyRangeAxiom(p, range);
		manager.addAxiom(ont, axiom);

	}

	public static void main(String[] arg) {
		try {
			String rootPath = System.getProperty("user.dir");

			OntoGenerator g = new OntoGenerator();
			g.init(rootPath + "\\src\\resource\\TIM.xml", "http://www.semanticweb.org/21926/ontologies/2022/5/TIM#");
			g.saveAsFile(System.getProperty("user.dir") + "\\generate\\robot.owl");
		} catch (OWLOntologyCreationException | OWLOntologyStorageException | SWRLParseException | SWRLBuiltInException
				| IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Set<OWLNamedIndividual> getIndividualsOfClass(String string) {
		// TODO Auto-generated method stub
		OWLClass c = factory.getOWLClass(IRI.create(ontIRI + string));
		return reasoner.getInstances(c, true).getFlattened();
	}

}
