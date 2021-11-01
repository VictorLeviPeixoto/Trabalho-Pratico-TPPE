package app;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import exceptions.DelimitadorInvalidoException;
import exceptions.EscritaNaoPermitidaException;

public class EscritaArquivo extends Persistencia{

	
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
	
	public void escreverAnalysisTimeLinha(List<List<String>> arrayLinhas) throws IOException {
		EscritaNoArquivoPorLinha(arrayLinhas, new FileWriter("../TrabalhoTDD/" + this.caminhoSaida + "/analysisTimeTab.out"), this.delimitador);
	}

	public void escreverAnalysisTimeColuna(List<List<String>> arrayLinhas, int k) throws IOException {
        escreverAnalysisColuna(k, new FileWriter("../TrabalhoTDD/" + this.caminhoSaida + "/analysisTimeTab.out"), arrayLinhas, this.delimitador);	
	}
	
	public void escreverAnalysisMemoryLinha(List<List<String>> arrayLinhas) throws IOException {
		EscritaNoArquivoPorLinha(arrayLinhas, new FileWriter("../TrabalhoTDD/" + this.caminhoSaida + "/analysisMemoryTab.out"), this.delimitador);
	}
	
	public void escreverAnalysisMemoryColuna(List<List<String>> arrayLinhas, int k) throws IOException {
        escreverAnalysisColuna(k, new FileWriter("../TrabalhoTDD/" + this.caminhoSaida + "/analysisMemoryTab.out"), arrayLinhas, this.delimitador);
	}
	
}
