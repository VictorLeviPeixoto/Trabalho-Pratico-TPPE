package exceptions;


public class DelimitadorInvalidoException extends Exception {
	private static final long serialVersionUID = 1L;

	public DelimitadorInvalidoException(String errorMessage) {
		super(errorMessage);
	}
}
