package jax_rs.core.util;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

@Provider
@Produces(MediaType.APPLICATION_XML)
public class MapMessageBodyWriter implements MessageBodyWriter<Map<String, String>> {

	@Override
	public long getSize(Map<String, String> arg0, Class<?> arg1, Type arg2,
			Annotation[] arg3, MediaType arg4) {
		return -1;
	}

	@Override
	public boolean isWriteable(Class<?> clazz, Type type, Annotation[] arg2,
			MediaType mediaType) {
		System.out.println("MapMessageBodyWriter");
		System.out.println("clazz: " + clazz);
		System.out.println("mediaType: " + mediaType);
		
		boolean isWriteable = HashMap.class.equals(clazz);
		System.out.println("isWriteable: " + isWriteable);
		return isWriteable;
	}

	@Override
	public void writeTo(Map<String, String> map, Class<?> arg1, Type arg2,
			Annotation[] arg3, MediaType arg4,
			MultivaluedMap<String, Object> arg5, OutputStream outputStream)
			throws IOException, WebApplicationException {
		StringBuffer sb = new StringBuffer();
		
		sb.append("<map>");
		for(Map.Entry<String, String> entry : map.entrySet()) {
			sb.append("<entry>");
			sb.append("<key>" + entry.getKey() + "</key>");
			sb.append("<value>" + entry.getValue() + "</value>");
			sb.append("</entry>");
		}
		sb.append("</map>");
		
		outputStream.write(sb.toString().getBytes());
	}
}
