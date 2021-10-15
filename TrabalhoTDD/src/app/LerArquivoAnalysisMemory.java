package app;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.util.Scanner;
import app.ArquivoNaoEncontradoException;


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

	public static void lerAnalysisMemory() throws ArquivoNaoEncontradoException{
        Scanner arquivoAnalysisMemory = null;
		try {
			arquivoAnalysisMemory = new Scanner(new FileReader("../TrabalhoTDD/analysisMemory.out")).useDelimiter("\\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ArquivoNaoEncontradoException(nomeArquivo);
		}
        while (arquivoAnalysisMemory.hasNext()) {
            System.out.println( arquivoAnalysisMemory.next() );
        }
        arquivoAnalysisMemory.close();
    }


	}
