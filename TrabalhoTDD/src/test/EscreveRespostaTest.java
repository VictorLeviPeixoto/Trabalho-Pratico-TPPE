package test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import app.EscritaArquivo;

public class EscreveRespostaTest {
	
	public EscritaArquivo escritaArquivo;
	private static List<List<String>> mock ;


	@Before
	public void setup() {
		escritaArquivo = new EscritaArquivo();
        mock = new ArrayList<List<String>>();
		mock.add(new ArrayList<String>());
        mock.get(0).add("1");
        mock.get(0).add("2");
        mock.get(0).add("3");
	}
	
	@Test
	public void testEscreverLinhasArquivoRespostaAnalysisMemory() throws Exception {
        long linhas = 0;
        escritaArquivo.definirDelimitador(";");
        escritaArquivo.setCaminhoSaida("outFiles");
        escritaArquivo.escreverAnalysisMemoryLinha(mock);
        BufferedReader analysisTime = new BufferedReader(new FileReader("../TrabalhoTDD/outFiles/analysisMemoryTab.out"));
        while (analysisTime.readLine() != null) linhas++;
    	assertEquals(1, linhas);
	}
	
	@Test
	public void testEscreverColunasArquivoRespostaAnalysisMemory() throws Exception {
		long linhas = 0;
        escritaArquivo.definirDelimitador(";");
        escritaArquivo.setCaminhoSaida("outFiles");
        escritaArquivo.escreverAnalysisMemoryColuna(mock, 3);
        BufferedReader analysisTime = new BufferedReader(new FileReader("../TrabalhoTDD/outFiles/analysisMemoryTab.out"));
        while (analysisTime.readLine() != null) linhas++;
    	assertEquals(3, linhas);
	}
	
	@Test
	public void testEscreverLinhasArquivoRespostaAnalysisTime() throws Exception {
        long linhas = 0;
        escritaArquivo.definirDelimitador(";");
        escritaArquivo.setCaminhoSaida("outFiles");
        escritaArquivo.escreverAnalysisTimeLinha(mock);
        BufferedReader analysisTime = new BufferedReader(new FileReader("../TrabalhoTDD/outFiles/analysisTimeTab.out"));
        while (analysisTime.readLine() != null) linhas++;
    	assertEquals(1, linhas);
	}
	
	@Test
	public void testEscreverColunasArquivoRespostaAnalysisTime() throws Exception {
		long linhas = 0;
        escritaArquivo.definirDelimitador(";");
        escritaArquivo.setCaminhoSaida("outFiles");
        escritaArquivo.escreverAnalysisTimeColuna(mock, 3);
        BufferedReader analysisTime = new BufferedReader(new FileReader("../TrabalhoTDD/outFiles/analysisTimeTab.out"));
        while (analysisTime.readLine() != null) linhas++;
    	assertEquals(3, linhas);
	}
}
