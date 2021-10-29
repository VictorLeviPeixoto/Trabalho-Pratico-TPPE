package app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exceptions.ArquivoNaoEncontradoException;

public class Persistencia {

	public String[] lerAnalysis(String nomeArquivo) throws ArquivoNaoEncontradoException {
		Scanner arquivoAnalysis = null;
        ArrayList<String> arrayLinhas = new ArrayList<String>();

		try {
			arquivoAnalysis = new Scanner(new FileReader("../TrabalhoTDD/" + nomeArquivo)).useDelimiter("\\n");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new ArquivoNaoEncontradoException(nomeArquivo);
		}
		while (arquivoAnalysis.hasNext()) {
        	String linha = arquivoAnalysis.next();
        	arrayLinhas.add(linha);
            
        }
		//System.out.println(arrayLinhas);
        return arrayLinhas.toArray(new String[arrayLinhas.size()]);
	}
	
	public void escreverAnalysisLinha(List<List<String>> arrayLinhas, FileWriter analysisMemoryTab, String delimitador) throws IOException {
        for(int i = 0; i < arrayLinhas.size(); i++) {
        	for(int j = 0; j < arrayLinhas.get(i).size(); j++) {
        		if(j == ( arrayLinhas.get(i).size() - 1)){
        			analysisMemoryTab.write(arrayLinhas.get(i).get(j));
        		}else {
        			analysisMemoryTab.write(arrayLinhas.get(i).get(j) + delimitador);
        		}
        	}
        	analysisMemoryTab.write("\n");
        }
        analysisMemoryTab.close();
	}
	
	public void escreverAnalysisColuna(int tamanhoLinhas, FileWriter analysisMemoryTab, List<List<String>> arrayLinhas, String delimitador) throws IOException {
		for(int i = 0; i < tamanhoLinhas; i++) {
        	for(int j = 0; j < arrayLinhas.size(); j++) {
    			if(j == (arrayLinhas.size() - 1)){
    				analysisMemoryTab.write(arrayLinhas.get(j).get(i));
        		}else {
        			analysisMemoryTab.write(arrayLinhas.get(j).get(i) + delimitador);
        		}
        	}
        	analysisMemoryTab.write("\n");
        }
        analysisMemoryTab.close();
	}
}
