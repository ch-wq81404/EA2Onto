package com.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.bean.UML.XMI;

import java.io.*;

public class ParseUtil {

    public static XMI parseXMI(File file) {
        JAXBContext context;
        try {
            context = JAXBContext.newInstance(XMI.class);
            Unmarshaller um = context.createUnmarshaller();
            XMI xmi = (XMI) um.unmarshal(new FileInputStream(file));
            return xmi;
        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

//    public static File createFile(String filename, AADLModel aadlModel) throws IOException {
//        String dirName = "generateFileDir";
//        File directory = new File(dirName);
//        if (!directory.exists())
//            directory.mkdirs();
//        File file = new File(dirName + "//" + filename);
//        if (!file.exists())
//            file.createNewFile();
//        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
//        writer.write(aadlModel.toString());
//        writer.flush();
//        writer.close();
//        return file;
//    }
}
