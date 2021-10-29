package app;

import exceptions.ArquivoNaoEncontradoException;


public class LerArquivoAnalysisMemory extends Persistencia{
	private String nomeArquivo = "analysisMemory.out";

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

	public String[] lerAnalysisTime() throws ArquivoNaoEncontradoException {
		return(lerAnalysis(this.nomeArquivo));
	}

}
