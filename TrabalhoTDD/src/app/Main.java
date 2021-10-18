package app;

import java.io.IOException;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		//LerArquivoAnalysisTime analysisTime = new LerArquivoAnalysisTime();
		//analysisTime.lerAnalysisTime();
		//LerArquivoAnalysisMemory analysisMemory = new LerArquivoAnalysisMemory();
		//analysisMemory.lerAnalysisMemory();
		NumeroAnalises analysisTime = new NumeroAnalises();
		analysisTime.getNumeroAnalysisTime();
		NumeroAnalises analysisMemory = new NumeroAnalises();
		analysisMemory.getNumeroAnalysisMemory();
	}

}
