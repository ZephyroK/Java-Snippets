package exception.checked;

public class ZeroParameterException extends Exception {
	private double parameter;

	public ZeroParameterException(double parameter) {
		super("Parameter sent is Zero");
		this.parameter = parameter;
	}
	
	public double getParameter() {
		return parameter;
	}

	public void setParameter(double parameter) {
		this.parameter = parameter;
	}
}
