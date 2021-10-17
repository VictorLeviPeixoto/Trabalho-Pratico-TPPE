package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import app.EscritaArquivo;

public class CaminhoSaida {

	public EscritaArquivo escritaArquivo;

	@Before
	public void setup() {
		escritaArquivo = new EscritaArquivo();
	}
	
	@Test
	public void testDefinirCaminhoSaida() {
		String caminho = "caminho";
		assertEquals("caminho", escritaArquivo.getCaminhoSaida());
	}

}
