package parsers.dom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomReaderParserExample {
	public static void main(String args[]){
		DocumentBuilderFactory builderFactory =
		        DocumentBuilderFactory.newInstance();
		
		DocumentBuilder builder = null;
		try {
		    builder = builderFactory.newDocumentBuilder();
		    
		    Document document = builder.parse(
		            new FileInputStream("D:\\domcreated.xml"));
		    
		    System.out.println("document: " + document);
		    
		    Element rootElement = document.getDocumentElement();
		    
		    NodeList nodes = rootElement.getChildNodes();
		    
		    printNodes(nodes);
		}
		catch (ParserConfigurationException e) {
		    e.printStackTrace();  
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (SAXException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void printNodes(NodeList nodes) {
		if(nodes != null) {
			for(int i = 0; i< nodes.getLength(); i++){
				Node node = nodes.item(i);
	
				if(node instanceof Element) {
					//a child element to process
					Element child = (Element) node;
					String tagName = child.getTagName();
					String tagContent = child.getTextContent();
			        
			        System.out.println("tagName: " + tagName);
			        System.out.println("tagContent: " + tagContent);
			        
			        printNodes(child.getChildNodes());
			    }
			}
		}
	}
}
