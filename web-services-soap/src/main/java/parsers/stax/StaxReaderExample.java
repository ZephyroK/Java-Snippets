package parsers.stax;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StaxReaderExample {
	public static void main(String args[]) {
		XMLInputFactory factory = XMLInputFactory.newInstance();

		try {
			System.out.println("Iterator API");
			XMLEventReader eventReader =
			    factory.createXMLEventReader(
			        new FileReader("D:\\domcreated.xml"));
			
			while(eventReader.hasNext()) {
			    XMLEvent event = eventReader.nextEvent();

			    if(event.getEventType() == XMLEvent.START_ELEMENT){
			        StartElement startElement = event.asStartElement();
			        System.out.println("startElement: " + startElement.getName().getLocalPart());
			    }
			    else if(event.getEventType() == XMLEvent.CHARACTERS) {
			    	Characters characters = event.asCharacters();
			    	System.out.println("Data: " + characters.getData());
			    }
			    //... more event types handled here...
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (XMLStreamException e) {
			e.printStackTrace();
		}

		System.out.println();
		
		try {
			System.out.println("Cursor API");
			XMLStreamReader streamReader =
			    factory.createXMLStreamReader(
			        new FileReader("D:\\domcreated.xml"));
			
			while(streamReader.hasNext()){
			    int eventType = streamReader.next();

			    if(eventType == XMLStreamReader.START_ELEMENT){
			        System.out.println("LocalName: " + streamReader.getLocalName());
			    }
			    else if(eventType == XMLStreamReader.CHARACTERS) {
			    	System.out.println("Text: " + streamReader.getText());
			    }

			    //... more event types handled here...
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (XMLStreamException e) {
			e.printStackTrace();
		}
	}
}
