package app;

import exceptions.ArquivoNaoEncontradoException;


public class LerArquivoAnalysisTime extends Persistencia{
	private String nomeArquivo = "analysisTime.out";

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


	public String[] lerAnalysisTime() throws ArquivoNaoEncontradoException {
		return(lerAnalysis(this.nomeArquivo));
	}


}
