/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package provider.payload.source.client;

import java.util.Date;
import java.util.concurrent.ExecutionException;

import javax.xml.bind.JAXBContext;
import javax.xml.namespace.QName;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Response;
import javax.xml.ws.Service;
import javax.xml.ws.Service.Mode;
import javax.xml.ws.http.HTTPBinding;
import javax.xml.ws.soap.SOAPBinding;

import provider.payload.source.service.MyJaxbMessage;

public class MessagingClient {

    public static void main(String[] as) throws Exception {

        // Setting up
        QName serviceName = new QName("urn:examples", "Examples");        
        Service service = Service.create(serviceName);
        
        QName portName = new QName("urn:examples", "Hello");
        service.addPort(
                portName,
                HTTPBinding.HTTP_BINDING,
                "http://127.0.0.1:8089/Messaging");
        
        JAXBContext jaxbCtx = JAXBContext.newInstance(MyJaxbMessage.class);
        Dispatch<Object> port = service.createDispatch(
                portName,
                jaxbCtx,
                Mode.PAYLOAD);

        MyJaxbMessage requestNormal = new MyJaxbMessage("Foo 1");
        MyJaxbMessage requestOneWay = new MyJaxbMessage("Foo 2");
        MyJaxbMessage requestFuture = new MyJaxbMessage("Foo 3");
        MyJaxbMessage requestResponse = new MyJaxbMessage("Foo 4");
        // ...

// synchronous
        System.out.println("1 - Normal - Start: " + new Date());
        MyJaxbMessage response = (MyJaxbMessage) port.invoke(requestNormal);
        System.out.println("1 - Normal - End: " + new Date()
                + " response: " + response.getResult());
// ...
        // ...

        // ...

// one Way - is not asynchronous waits for HTTP response
        System.out.println("2 - OneWay - Start: " + new Date());
        port.invokeOneWay(requestOneWay);
        System.out.println("2 - OneWay - no response End: " + new Date());

// ...
//
//        // ...
//
//// asynchronous request (pulling)
        System.out.println("3 - Asynchronous - Start: " + new Date());
        Response<Object> responseASR = port.invokeAsync(requestResponse);
        System.out.println("3 - Asynchronous - End: " + new Date());

        while (!responseASR.isDone()) {
            Thread.sleep(900);
            System.out.println(" - 3.1 simulating async work");
        }

        MyJaxbMessage res = (MyJaxbMessage) responseASR.get();
        System.out.println(" - 3.2 Asynchronous request respondet at: "
                + new Date() + " with Response: " + res.getResult());

//// asynchronous request (call back)
        System.out.println("4 - Asynchronous callback - Start: " + new Date());
        port.invokeAsync(requestFuture, new AsyncHandler<Object>() {
        
			@Override
			public void handleResponse(Response<Object> response) {
				try {
					MyJaxbMessage res = (MyJaxbMessage)response.get();
					System.out.println(" - 4 Asynchronous request callback respondet at: "
			                + new Date() + " with Response: " + res.getResult());
				} 
				catch (InterruptedException | ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
        	
        }) ;
        System.out.println("4- Asynchronous callback - End: " + new Date());
        	
        System.out.println("waiting for the async callback response");
        Thread.sleep(10000);
// ... 
    }
}