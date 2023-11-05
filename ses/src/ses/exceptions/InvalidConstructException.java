package ses.exceptions;

import org.eclipse.emf.common.util.DiagnosticChain;

public class InvalidConstructException extends Exception {
	
	DiagnosticChain diagnostic;
	
	public InvalidConstructException(DiagnosticChain diagnostic) {
		this.diagnostic = diagnostic;
	}
	
	@Override
	public String getMessage() {
		return "This construct is invalid. Diagnostic:\n" + this.diagnostic.toString();
	}
}
