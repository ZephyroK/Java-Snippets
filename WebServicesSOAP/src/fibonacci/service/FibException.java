package fibonacci.service;

public class FibException extends Exception {
	private static final long serialVersionUID = 1L;
	private String details;
	
	public FibException(String reason, String details) {
		super(reason);
		this.details = details;
	}
	
	public String getFaultInfo() {
		return details;
	}
}
