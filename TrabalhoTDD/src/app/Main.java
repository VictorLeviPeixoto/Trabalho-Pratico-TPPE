package app;


import java.io.IOException;

import java.util.Scanner;

import exceptions.ArquivoNaoEncontradoException;
import exceptions.EscritaNaoPermitidaException;


public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) throws Exception {
		//LerArquivoAnalysisTime analysisTime = new LerArquivoAnalysisTime();
		//analysisTime.lerAnalysisTime();
		//LerArquivoAnalysisMemory analysisMemory = new LerArquivoAnalysisMemory();
		//analysisMemory.lerAnalysisMemory();
		//NumeroAnalises analysisTime = new NumeroAnalises();
		//analysisTime.getNumeroAnalysisTime();
		//NumeroAnalises analysisMemory = new NumeroAnalises();
		//analysisMemory.getNumeroAnalysisMemory();

	//public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		LerArquivoAnalysisTime analysisTime = new LerArquivoAnalysisTime();
		LerArquivoAnalysisMemory analysisMemory = new LerArquivoAnalysisMemory();
		EscritaArquivo escritaArquivo = new EscritaArquivo();

		analysisTime.lerAnalysisTime();
		analysisMemory.lerAnalysisMemory();
		

		System.out.print("Digite o caminho do diretório para salvar o arquivo de saída: ");
		String caminhoArquivoSaida = scanner.nextLine();
		escritaArquivo.setCaminhoSaida(caminhoArquivoSaida);
		

		System.out.print("Escolha o formato de saída: linhas ou colunas");
		String formatoArquivoSaida = scanner.nextLine();
		escritaArquivo.setFormato(formatoArquivoSaida);
		
		scanner.close();
		
		


	}

}
