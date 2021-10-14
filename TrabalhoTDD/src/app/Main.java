package app;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ArquivoNaoEncontradoException {
		LerArquivoAnalysisTime analysisTime = new LerArquivoAnalysisTime();
		analysisTime.lerAnalysisTime();
		LerArquivoAnalysisMemory analysisMemory = new LerArquivoAnalysisMemory();
		analysisMemory.lerAnalysisMemory();
		
	}

}
