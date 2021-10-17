package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import app.EscritaArquivo;

public class FormatoSaidaTest {
	
	public EscritaArquivo escritaArquivo;
	private String linhas = "linhas";
	private String colunas = "colunas";


	@Before
	public void setup() {
		escritaArquivo = new EscritaArquivo();
	}
	
	@Test
	public void testDefinirFomatoLinha() throws Exception {
		escritaArquivo.setFormato(linhas);
		assertEquals(linhas, escritaArquivo.getFormato());
	}
	
	@Test
	public void testDefinirFomatoColuna() throws Exception {
		escritaArquivo.setFormato(colunas);
		assertEquals(colunas, escritaArquivo.getFormato());
	}
	
	@Test(expected = Exception.class)
	public void testDefinirFomatoErrado() throws Exception {
		escritaArquivo.setFormato("wtf");

	}
	
}
