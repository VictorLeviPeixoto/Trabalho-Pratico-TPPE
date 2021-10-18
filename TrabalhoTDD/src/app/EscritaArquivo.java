package app;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import exceptions.EscritaNaoPermitidaException;

public class EscritaArquivo {
	public EscritaArquivo() {
		
	}
	
	private char delimitador;
	private String caminhoSaida;

	
	public void definirDelimitador(char delimitador) {
		this.delimitador = delimitador;
	}
	
	public char getDelimitador() {
		return delimitador;
	}

	public String getCaminhoSaida() {
		return caminhoSaida;
	}

	public void setCaminhoSaida(String caminho) throws EscritaNaoPermitidaException{
		try {
			Path caminhoDoArquivo = Paths.get(caminho);
			
			if(!Files.isWritable(caminhoDoArquivo)) {
				throw new EscritaNaoPermitidaException(caminhoDoArquivo);
			}
			this.caminhoSaida = caminho;

		}catch(EscritaNaoPermitidaException e) {
			System.out.println(e);
			System.exit(-1);
		}
	}
	
}
