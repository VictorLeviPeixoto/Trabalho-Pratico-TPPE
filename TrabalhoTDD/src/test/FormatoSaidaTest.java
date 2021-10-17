package test;

import static org.junit.Assert.*;

import org.junit.Before;
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
	public void testDefinirFomatoLinha() {
		escritaArquivo.setFormato(linhas);
		assertEquals(linhas, escritaArquivo.getFormato());
	}
	
	@Test
	public void testDefinirFomatoColuna() {
		escritaArquivo.definirDelimitador(colunas);
		assertEquals(colunas, escritaArquivo.getFormato());
	}
	
	@Test
	public void testDefinirFomatoErrado() {
		escritaArquivo.definirDelimitador('wtf');
		assertEquals('wtf', escritaArquivo.getFormato());
	}
	
}
