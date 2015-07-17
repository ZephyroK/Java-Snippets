package jax_rs.core.util;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

public class MapMessageBodyReader implements MessageBodyReader<Map<String, String>> {

	@Override
	public boolean isReadable(Class<?> clazz, Type type, Annotation[] annotations,
			MediaType mediaType) {
		System.out.println("clazz: " + clazz);
		if(Map.class.equals(clazz)) {
			return true;
		}
		return false;
	}

	@Override
	public Map<String, String> readFrom(Class<Map<String, String>> arg0,
			Type arg1, Annotation[] arg2, MediaType arg3,
			MultivaluedMap<String, String> arg4, InputStream entityStream)
			throws IOException, WebApplicationException {
		
		XMLStreamReaderFactory factory = XMLStreamReaderFactory.get();
		XMLStreamReader reader = factory.doCreate(null, entityStream, false);
		
		try {
			while(reader.hasNext()) {
				reader.next();
				if(reader.isStartElement()) {
					reader.getLocalName();
					
					System.out.println("reader.getLocalName(): " + reader.getLocalName());
				}
			}
		}
		catch (XMLStreamException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}

}
