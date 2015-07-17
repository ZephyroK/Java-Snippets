package inheritance.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CatalogWS extends BaseCatalog {
	@WebMethod
	public String getTitle() {
		return null;
	}
	
	public String getAuthor() {
		return null;
	}
	
	@WebMethod
	private String getPublisher() {
		return null;
	}
}
