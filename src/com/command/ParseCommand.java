package com.command;

import java.io.File;
import java.io.IOException;

import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.swrlapi.exceptions.SWRLBuiltInException;
import org.swrlapi.parser.SWRLParseException;

import com.bean.UML.XMI;
import com.bean.onto.OntoGenerator;
import com.mapper.*;
import com.util.ParseUtil;


public class ParseCommand {
	public static void main(String[] args) throws Exception {
//        if (args.length != 1) {
//            System.out.println("请输入正确的命令格式");
//            return;
//        }
        XMI xmi = ParseUtil.parseXMI(new File("src\\resource\\autocar.xml"));
        if(!preCheck(xmi)){
        	return;
        }
        String rootPath = System.getProperty("user.dir");
		OntoGenerator g=new OntoGenerator();
		try {
			g.init(rootPath + "\\src\\resource\\TIM.xml","http://www.semanticweb.org/21926/ontologies/2022/5/TIM#");
			ReqMapper.map(xmi, g);
			BDDMapper.map(xmi,g);
			ActMapper.map(xmi, g);
			g.saveAsFile(System.getProperty("user.dir") + "\\generate\\robot.owl");
		} catch (OWLOntologyCreationException | OWLOntologyStorageException | SWRLParseException
				| SWRLBuiltInException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        System.out.println("transform over!!");
    }
	public static boolean preCheck(XMI xmi){
		return true;
	}
}
