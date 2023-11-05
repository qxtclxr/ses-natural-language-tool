package ses.exceptions;

public class BadParsingException extends Exception {
	
	@Override
	public String getMessage() {
		StringBuilder strBldr = new StringBuilder();
		strBldr.append("Couldn't finish parsing the input, likely due to a syntax error. Please revise input.");
		return strBldr.toString();
	}
}
