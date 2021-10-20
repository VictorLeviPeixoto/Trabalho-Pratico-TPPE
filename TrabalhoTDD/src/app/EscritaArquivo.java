package app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import exceptions.ArquivoNaoEncontradoException;
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
	
	public void escreverAnalysisTimeLinha() throws IOException {
		Scanner arquivoAnalysisTime = null;
        ArrayList<String> arrayLinhas = new ArrayList<String>();
        FileWriter analysisTimeTab = new FileWriter("../TrabalhoTDD/outFiles/analysisTimeTab.out");
        int i=1;
        
		try {
			arquivoAnalysisTime = new Scanner(new FileReader("../TrabalhoTDD/analysisTime.out")).useDelimiter("\\n");
		} catch (FileNotFoundException e) {
				throw new ArquivoNaoEncontradoException("O arquivo analysisTime.out não foi encontrado!");
			}
		while (arquivoAnalysisTime.hasNext()) {
        	String linha = arquivoAnalysisTime.next();
        	if(linha.contains("-")) {
            	analysisTimeTab.write("\n" + new Integer(i).toString() + getDelimitador());
            	i++;
        	}
        	else {
        	arrayLinhas.add(linha);
        	analysisTimeTab.write(linha + getDelimitador());
        	}
        	

        	
            
        }
    	analysisTimeTab.close();		
	}
	
	public void escreverAnalysisMemoryLinha() throws IOException {
		Scanner arquivoAnalysisTime = null;
        ArrayList<String> arrayLinhas = new ArrayList<String>();
        FileWriter analysisTimeTab = new FileWriter("../TrabalhoTDD/outFiles/analysisMemoryTab.out");
        int i=1;
        
		try {
			arquivoAnalysisTime = new Scanner(new FileReader("../TrabalhoTDD/analysisMemory.out")).useDelimiter("\\n");
		} catch (FileNotFoundException e) {
				throw new ArquivoNaoEncontradoException("O arquivo analysisMemory.out não foi encontrado!");
			}
		while (arquivoAnalysisTime.hasNext()) {
        	String linha = arquivoAnalysisTime.next();
        	if(linha.contains("-")) {
            	analysisTimeTab.write("\n" + new Integer(i).toString() + getDelimitador());
            	i++;
        	}
        	else {
        	arrayLinhas.add(linha);
        	analysisTimeTab.write(linha + getDelimitador());
        	}
        	

        	
            
        }
    	analysisTimeTab.close();		
	}
	
}
