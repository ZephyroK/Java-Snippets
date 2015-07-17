package jax_rs.core.util;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

@Produces(MediaType.APPLICATION_JSON)
public class OrderMessageBodyWriter implements MessageBodyWriter<Order> {

	@Override
	public boolean isWriteable(Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {
		System.out.println("type: " + type);
		System.out.println("mediaType: " + mediaType);
		boolean isWriteable = Order.class.equals(type) && MediaType.APPLICATION_JSON_TYPE.equals(mediaType);
		System.out.println("isWriteable: " + isWriteable);
		return isWriteable;
	}

	@Override
	public long getSize(Order t, Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {
		return 0;
	}

	@Override
	public void writeTo(Order t, Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> httpHeaders,
			OutputStream entityStream) throws IOException,
			WebApplicationException {
		System.out.println("Writting...");
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("{\"orderId\"");
		stringBuilder.append(",");
		stringBuilder.append(t.getOrderId());
		stringBuilder.append("}");
		
		entityStream.write(stringBuilder.toString().getBytes());
	}
}
