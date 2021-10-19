package app;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import exceptions.DelimitadorInvalidoException;
import exceptions.EscritaNaoPermitidaException;

public class EscritaArquivo {

	
	private String delimitador;
	private String caminhoSaida;
	private String formatoSaida;


	
	public void definirDelimitador(String delimitador) throws DelimitadorInvalidoException {
		if(delimitador.length() > 1) {
			throw new DelimitadorInvalidoException("Escolha um delimitador com apenas 1 caracter");
		}else {
			this.delimitador=delimitador;
		}
	}
	
	public char getDelimitadorFalsificacao() {
		return ',';
	}
	
	public String getDelimitador() {
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
			System.out.println(formatoArquivoSaida);

			if (formatoArquivoSaida.equals("linhas") || formatoArquivoSaida.equals("colunas") ) {
				this.formatoSaida = formatoArquivoSaida;
			}
			else {
				throw new Exception();
			}
		}
		catch(Exception e) {
			throw new Exception("Formato incorreto. Digite linhas ou colunas");
		}
	}
	

	public Object getFormato() {
		return formatoSaida;
	}
	
}
