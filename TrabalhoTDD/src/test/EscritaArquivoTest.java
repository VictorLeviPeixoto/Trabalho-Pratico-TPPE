package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import app.EscritaArquivo;
import exceptions.DelimitadorInvalidoException;

public class EscritaArquivoTest {
	
	public EscritaArquivo escritaArquivo;
	
	@Before
	public void setup() {
		escritaArquivo = new EscritaArquivo();
	}
	
	@Test
	public void testDefinirDelimitadorFalsificacao() {
		assertEquals(',', escritaArquivo.getDelimitadorFalsificacao());
	}
	
	@Test
	public void testDefinirDelimitador() throws DelimitadorInvalidoException {
		escritaArquivo.definirDelimitador(';');
		assertEquals(';', escritaArquivo.getDelimitador());
	}
	
	@Test
	public void testDefinirDelimitadorBackSlash() throws DelimitadorInvalidoException {
		escritaArquivo.definirDelimitador('\n');
		assertEquals('\n', escritaArquivo.getDelimitador());
	}
}
