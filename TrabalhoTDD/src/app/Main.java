package app;

import java.util.Scanner;

import exceptions.ArquivoNaoEncontradoException;
import exceptions.EscritaNaoPermitidaException;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ArquivoNaoEncontradoException, EscritaNaoPermitidaException {
		Scanner scanner = new Scanner(System.in);
		LerArquivoAnalysisTime analysisTime = new LerArquivoAnalysisTime();
		LerArquivoAnalysisMemory analysisMemory = new LerArquivoAnalysisMemory();
		EscritaArquivo escritaArquivo = new EscritaArquivo();

		analysisTime.lerAnalysisTime();
		analysisMemory.lerAnalysisMemory();
		

		System.out.print("Digite o caminho do diretório para salvar o arquivo de saída: ");
		String caminhoArquivoSaida = scanner.nextLine();
		escritaArquivo.setCaminhoSaida(caminhoArquivoSaida);
		scanner.close();

	}

}
