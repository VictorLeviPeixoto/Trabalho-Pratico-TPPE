package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import app.EscritaArquivo;
import exceptions.EscritaNaoPermitidaException;

public class CaminhoSaida {

	public EscritaArquivo escritaArquivo;
	private String caminho = "outFiles/";

	@Before
	public void setup() {
		escritaArquivo = new EscritaArquivo();
	}
	
	
	@Test
	public void testCaminhoSaida() throws EscritaNaoPermitidaException{
		escritaArquivo.setCaminhoSaida(caminho);
		assertEquals(caminho ,escritaArquivo.getCaminhoSaida());
		
	}
	
	@Test(expected = EscritaNaoPermitidaException.class)
	public void testCaminhoSaidaException() throws EscritaNaoPermitidaException{
		escritaArquivo.setCaminhoSaida("caminhoerrado");
			
	}

}
