package parsers.sax;

import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyContentHandler extends DefaultHandler {

	@Override
	public void characters(char[] chars, int start, int length) throws SAXException {
		StringBuilder sb = new StringBuilder();
		int i = start;
		int count = 0;
		while(count < length) {
			sb.append(chars[i]);
			count++;
			i++;
		}
		System.out.println("characters: " + sb.toString());
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("End Document");
	}

	@Override
	public void endElement(String arg0, String arg1, String arg2)
			throws SAXException {
		System.out.println("End Element: arg0: " + arg0 + ", arg1: " + arg1 + ", arg2: " + arg2);
		
	}

	@Override
	public void startDocument() throws SAXException {
		System.out.println("Start Document");
	}

	@Override
	public void startElement(String arg0, String arg1, String arg2,
			Attributes arg3) throws SAXException {
		System.out.println("Start Element: arg0: " + arg0 + ", arg1: " + arg1 + ", arg2: " + arg2 + ", arg3: " + arg3);
	}
}
