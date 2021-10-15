package app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import app.ArquivoNaoEncontradoException;


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


	public static void lerAnalysisTime() throws ArquivoNaoEncontradoException {
		Scanner arquivoAnalysisTime = null;
		try {
			arquivoAnalysisTime = new Scanner(new FileReader("../TrabalhoTDD/analysisTime.out")).useDelimiter("\\n");
		} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				throw new ArquivoNaoEncontradoException(nomeArquivo);
			}
			while (arquivoAnalysisTime.hasNext()) {

		        	System.out.println(arquivoAnalysisTime.next());
			}
			arquivoAnalysisTime.close();

		}


	}
