package app;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import exceptions.ArquivoNaoEncontradoException;


public class LerArquivoAnalysisMemory {
	private static String nomeArquivo = "analysisMemory.out";

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public String getNomeFalsificacao() {
		return "testeMemory1";
	}

	public String getNomeDuplicacao() {
		return "testeMemory2";
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public static String[] lerAnalysisMemory() throws ArquivoNaoEncontradoException{
        Scanner arquivoAnalysisMemory = null;
        ArrayList<String> arrayLinhas = new ArrayList<String>();
		try {
			arquivoAnalysisMemory = new Scanner(new FileReader("../TrabalhoTDD/analysisMemory.out")).useDelimiter("\\n");
		} catch (Exception e) {
			throw new ArquivoNaoEncontradoException(nomeArquivo);
		}
        while (arquivoAnalysisMemory.hasNext()) {
        	String linha = arquivoAnalysisMemory.next();
        	arrayLinhas.add(linha);
            //System.out.println(linha);
        }
		//System.out.println(arrayLinhas);
        return arrayLinhas.toArray(new String[arrayLinhas.size()]);
        
        
    }


	}
