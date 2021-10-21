package app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
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


	
	public void escreverAnalysisTimeLinha(List<List<String>> arrayLinhas) throws IOException {
        FileWriter analysisTimeTab = new FileWriter("../TrabalhoTDD/"+this.caminhoSaida+"/analysisTimeTab.out");
        for(int i = 0; i< arrayLinhas.size();i++) {
        	for(int j = 0; j< arrayLinhas.get(i).size(); j++) {
        		if(j == ( arrayLinhas.get(i).size()-1)){
                	analysisTimeTab.write(arrayLinhas.get(i).get(j));
        		}else {
                	analysisTimeTab.write(arrayLinhas.get(i).get(j) + this.delimitador);
        		}
        	}
        	analysisTimeTab.write("\n");
        }
    	analysisTimeTab.close();		
	}
	
	public void escreverAnalysisTimeColuna(List<List<String>> arrayLinhas, int k) throws IOException {
        FileWriter analysisTimeTab = new FileWriter("../TrabalhoTDD/"+this.caminhoSaida+"/analysisTimeTab.out");
        for(int i = 0; i< k;i++) {
        	for(int j = 0; j< arrayLinhas.size(); j++) {
        			if(j == ( arrayLinhas.size()-1)){
                       	analysisTimeTab.write(arrayLinhas.get(j).get(i));
            		}else {
                       	analysisTimeTab.write(arrayLinhas.get(j).get(i) + this.delimitador);
            		}
        	}
        	analysisTimeTab.write("\n");
        }
        analysisTimeTab.close();		
	}
	
	public void escreverAnalysisMemoryLinha(List<List<String>> arrayLinhas) throws IOException {
        FileWriter analysisMemoryTab = new FileWriter("../TrabalhoTDD/"+this.caminhoSaida+"/analysisMemoryTab.out");
        for(int i = 0; i< arrayLinhas.size();i++) {
        	for(int j = 0; j< arrayLinhas.get(i).size(); j++) {
        		if(j == ( arrayLinhas.get(i).size()-1)){
        			analysisMemoryTab.write(arrayLinhas.get(i).get(j));
        		}else {
        			analysisMemoryTab.write(arrayLinhas.get(i).get(j) + this.delimitador);
        		}
        	}
        	analysisMemoryTab.write("\n");
        }
        analysisMemoryTab.close();		
	}
	
	public void escreverAnalysisMemoryColuna(List<List<String>> arrayLinhas, int k) throws IOException {
        FileWriter analysisMemoryTab = new FileWriter("../TrabalhoTDD/"+this.caminhoSaida+"/analysisMemoryTab.out");
        for(int i = 0; i< k;i++) {
        	for(int j = 0; j< arrayLinhas.size(); j++) {
        			if(j == ( arrayLinhas.size()-1)){
        				analysisMemoryTab.write(arrayLinhas.get(j).get(i));
            		}else {
            			analysisMemoryTab.write(arrayLinhas.get(j).get(i) + this.delimitador);
            		}
        	}
        	analysisMemoryTab.write("\n");
        }
        analysisMemoryTab.close();
	}
	
}
