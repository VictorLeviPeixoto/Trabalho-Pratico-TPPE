package app;

public class EscritaArquivo {
	public EscritaArquivo() {
		
	}
	
	private char delimitador;
	
	public void definirDelimitador(char delimitador) {
		this.delimitador = delimitador;
	}
	
	public char getDelimitador() {
		return delimitador;
	}
}
