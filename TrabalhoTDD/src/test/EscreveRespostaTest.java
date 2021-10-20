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
	private static List<List<String>> mock ;


	@Before
	public void setup() {
		escritaArquivo = new EscritaArquivo();
        mock = new ArrayList<List<String>>();
		mock.add(new ArrayList<String>());
        mock.get(0).add('1');
        mock.get(0).add('2');
        mock.get(0).add('3');
	}
	
	@Test
	public void testEscreverLinhasArquivoRespostaAnalysisMemory() throws Exception {
        long linhas = 0;
		escritaArquivo.setFormato(linhas);
        escritaArquivo.definirDelimitador(";")
        escreverArquivoRespostaAnalysisMemory(mock);
        BufferedReader analysisTime = new BufferedReader(new FileReader("../TrabalhoTDD/outFiles/analysisMemoryTab.out"));
        while (analysisTime.readLine() != null) linhas++;
    	assertEquals(1, linhas);
	}
	
	@Test
	public void testEscreverColunasArquivoRespostaAnalysisMemory() throws Exception {
		long linhas = 0;
		escritaArquivo.setFormato(colunas);
        escritaArquivo.definirDelimitador(";")
        escreverArquivoRespostaAnalysisMemory(mock);
        BufferedReader analysisTime = new BufferedReader(new FileReader("../TrabalhoTDD/outFiles/analysisMemoryTab.out"));
        while (analysisTime.readLine() != null) linhas++;
    	assertEquals(4, linhas);
	}
	
	@Test
	public void testEscreverLinhasArquivoRespostaAnalysisTime() throws Exception {
        long linhas = 0;
		escritaArquivo.setFormato(linhas);
        escritaArquivo.definirDelimitador(";")
        escreverArquivoRespostaAnalysisMemory(mock);
        BufferedReader analysisTime = new BufferedReader(new FileReader("../TrabalhoTDD/outFiles/analysisTimeTab.out"));
        while (analysisTime.readLine() != null) linhas++;
    	assertEquals(1, linhas);
	}
	
	@Test
	public void testEscreverColunasArquivoRespostaAnalysisTime() throws Exception {
		long linhas = 0;
		escritaArquivo.setFormato(colunas);
        escritaArquivo.definirDelimitador(";")
        escreverArquivoRespostaAnalysisMemory(mock);
        BufferedReader analysisTime = new BufferedReader(new FileReader("../TrabalhoTDD/outFiles/analysisTimeTab.out"));
        while (analysisTime.readLine() != null) linhas++;
    	assertEquals(4, linhas);
	}
}
