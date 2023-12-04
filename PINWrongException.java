package pinabfrage;

public class PINWrongException extends Exception {
	private String errorMessage;
	
	public PINWrongException(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
}
