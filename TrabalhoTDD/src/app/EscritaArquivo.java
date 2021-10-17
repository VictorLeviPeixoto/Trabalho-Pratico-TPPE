package app;

public class EscritaArquivo {
	public EscritaArquivo() {
		
	}
	
	private char delimitador;
	private String caminhoSaida;

	
	public void definirDelimitador(char delimitador) {
		this.delimitador = delimitador;
	}
	
	public char getDelimitador() {
		return delimitador;
	}

	public String getCaminhoSaida() {
		return caminhoSaida;
	}

	public void setCaminhoSaida(String caminho) {
		this.caminhoSaida = caminho;
	}
}
