package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import app.EscritaArquivo;
import exceptions.EscritaNaoPermitidaExceptionn;

public class CaminhoSaida {

	public EscritaArquivo escritaArquivo;
	private String caminho = "caminho";

	@Before
	public void setup() {
		escritaArquivo = new EscritaArquivo();
	}
	
	@Test
	public void testDefinirCaminhoSaida() {
		escritaArquivo.setCaminhoSaida(caminho);
		assertEquals(escritaArquivo.getCaminhoSaida(), caminho );
	}
	
	@Test
	public void testCaminhoSaidaException() throws EscritaNaoPermitidaExceptionn{
		escritaArquivo.setCaminhoSaida(caminho);
		assertEquals(caminho ,escritaArquivo.getCaminhoSaida());
		
	}

}
