package ses.exceptions;

public class ConstructDoesNotExistException extends Exception {
	private String constructName;
	
	public ConstructDoesNotExistException(String constructName) {
		this.constructName = constructName;
	}
	
	@Override
	public String getMessage() {
		return "The construct \"" + constructName + "\" has not (yet) been included in the SES model.";
	}
}
