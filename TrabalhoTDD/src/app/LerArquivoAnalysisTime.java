package app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import exceptions.ArquivoNaoEncontradoException;


public class LerArquivoAnalysisTime {
	private static String nomeArquivo = "analysisTime.out";

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public String getNomeFalsificacao() {
		return "testeTime1";
	}

	public String getNomeDuplicacao() {
		return "testeTime2";
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}


	public static String[] lerAnalysisTime() throws ArquivoNaoEncontradoException {
		Scanner arquivoAnalysisTime = null;
        ArrayList<String> arrayLinhas = new ArrayList<String>();

		try {
			arquivoAnalysisTime = new Scanner(new FileReader("../TrabalhoTDD/analysisTime.out")).useDelimiter("\\n");
		} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				throw new ArquivoNaoEncontradoException(nomeArquivo);
			}
		while (arquivoAnalysisTime.hasNext()) {
        	String linha = arquivoAnalysisTime.next();
        	arrayLinhas.add(linha);
            
        }
		//System.out.println(arrayLinhas);
        return arrayLinhas.toArray(new String[arrayLinhas.size()]);
}


	}
