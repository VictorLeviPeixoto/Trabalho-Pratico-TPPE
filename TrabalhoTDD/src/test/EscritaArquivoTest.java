package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import app.EscritaArquivo;

public class EscritaArquivoTest {
	
	public EscritaArquivo escritaArquivo;
	
	@Before
	public void setup() {
		escritaArquivo = new EscritaArquivo();
	}
	
	@Test
	public void testDefinirDelimitador() {
		escritaArquivo.definirDelimitador(';');
		assertEquals(';', escritaArquivo.getDelimitador());
	}
	
	@Test
	public void testDefinirDelimitadorBackSlash() {
		escritaArquivo.definirDelimitador('\n');
		assertEquals('\n', escritaArquivo.getDelimitador());
	}
}
