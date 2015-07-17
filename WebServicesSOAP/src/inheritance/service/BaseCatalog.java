package inheritance.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

public class BaseCatalog {
	@WebMethod
	public int getIDByName() {
		return 0;
	}
	
	public int getNameById() {
		return 1;
	}
}
