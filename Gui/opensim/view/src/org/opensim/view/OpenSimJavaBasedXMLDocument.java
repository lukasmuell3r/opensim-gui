/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opensim.view;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.*;
import org.openide.util.Exceptions;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

/**
 *
 * @author Ibraheem Aldhamari,  Yasser Grimes
 * 
 * this class goal is to make it easier to add functionalities to the gui
 * by providing methods to change and reload the xml file of the model based
 * on the java
 * 
 */
public class OpenSimJavaBasedXMLDocument {

    private Document modelDocument;
    private File documentFile;
    private Element rootOpenSimElement;
    public int documentVersion = 4000 ;
    
    public OpenSimJavaBasedXMLDocument(String filePath) {
        
        documentFile = new File(filePath);
        DocumentBuilderFactory documentFactory  =DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            modelDocument = documentBuilder.parse(documentFile);
            rootOpenSimElement = modelDocument.getDocumentElement();
            System.out.println("the rooot element is : "+rootOpenSimElement.getTagName());
        } catch (ParserConfigurationException ex) {
            Exceptions.printStackTrace(ex);
        } catch (SAXException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
        
    }
    
    
    
}
