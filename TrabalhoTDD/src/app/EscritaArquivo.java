package app;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import exceptions.EscritaNaoPermitidaException;

public class EscritaArquivo {
	public EscritaArquivo() {
		this.caminhoSaida = "";
		this.formatoSaida = "";
		
	}
	
	private char delimitador;
	private String caminhoSaida;
	private String formatoSaida;


	
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

	public void setFormato(String formatoArquivoSaida) throws Exception {
		try {
			if (formatoArquivoSaida != "linhas" && formatoArquivoSaida != "colunas" ) {
				throw new Exception("Formato incorreto. Digite linhas ou colunas");
			}
			else {
				this.formatoSaida = formatoArquivoSaida;
			}
		}
		catch(Exception e) {
			System.out.println(e);
			System.exit(-1);
		}
	}
	

	public Object getFormato() {
		return formatoSaida;
	}
	
}
