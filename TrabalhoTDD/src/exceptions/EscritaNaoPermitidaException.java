package exceptions;

import java.nio.file.Path;

public class EscritaNaoPermitidaException extends Exception {
	private static final long serialVersionUID = 1L;

	public EscritaNaoPermitidaException(Path caminhoDoArquivo) {
		super("Esse caminho não possui permisão de escrita: " + caminhoDoArquivo);
	}

	

}
