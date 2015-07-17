package xml.parser;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

public class ValidateXML {
	public static void main(String[] args) {
		if(args.length != 2) {
			String msg = "\nUsage: java ValidateXML XMLfile XSDfile";
			System.out.println(msg);
			return;
		}
		try {
			//Read and validate the XML Schema (XSD document).
			final String schema_uri = XMLConstants.W3C_XML_SCHEMA_NS_URI;
			SchemaFactory factory = SchemaFactory.newInstance(schema_uri);
			Schema schema = factory.newSchema(new StreamSource(args[1]));
			
			Validator validator = schema.newValidator();
			validator.validate(new StreamSource(args[0]));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
