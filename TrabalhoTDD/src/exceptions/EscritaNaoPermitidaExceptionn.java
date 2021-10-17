package exceptions;


public class EscritaNaoPermitidaExceptionn extends Exception {
	private static final long serialVersionUID = 1L;

	public EscritaNaoPermitidaExceptionn(String errorMessage) {
		super("Esse caminho não possui permisão de escrita: "+errorMessage);
	}

	

}
