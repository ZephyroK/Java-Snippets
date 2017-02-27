package parsers.sax;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParserExample {
	public static void main(String[] args) {
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser;
		try {
			saxParser = saxParserFactory.newSAXParser();
		
			DefaultHandler defaultHandler = new MyContentHandler();

			File file = new File("D:\\file.xml");
        
			saxParser.parse(file, defaultHandler);
		} 
		catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
