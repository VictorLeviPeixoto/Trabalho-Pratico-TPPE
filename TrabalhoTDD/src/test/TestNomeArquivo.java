package test;

import static org.junit.Assert.*;

import org.junit.Test;

import app.LerArquivoAnalysisMemory;
import app.LerArquivoAnalysisTime;

public class TestNomeArquivo {
	private LerArquivoAnalysisMemory nomeAnalysisMemory;
	private LerArquivoAnalysisTime nomeAnalysisTime;


	@Test
	public void testAnalysisMemory1() {
		//falsificacao
		LerArquivoAnalysisMemory analysisMemory = new LerArquivoAnalysisMemory();
		assertEquals("testeMemory1", analysisMemory.getNomeFalsificacao());

	}

	@Test
	public void testAnalysisMemory2() {
		//duplicacao
		LerArquivoAnalysisMemory analysisMemory = new LerArquivoAnalysisMemory();
		assertEquals("testeMemory2", analysisMemory.getNomeDuplicacao());

	}

	@Test
	public void testAnalysisMemory() {
		//triangulacao
		LerArquivoAnalysisMemory analysisMemory = new LerArquivoAnalysisMemory();
		nomeAnalysisMemory = new LerArquivoAnalysisMemory();
		nomeAnalysisMemory.setNomeArquivo("analysisMemory.out");
		assertEquals("analysisMemory.out", analysisMemory.getNomeArquivo());

	}



	@Test
	public void testAnalysisTime1() {
		//falsificacao
		LerArquivoAnalysisTime analysisTime = new LerArquivoAnalysisTime();
		assertEquals("testeTime1", analysisTime.getNomeFalsificacao());

	}

	@Test
	public void testAnalysisTime2() {
		//duplicacao
		LerArquivoAnalysisTime analysisTime = new LerArquivoAnalysisTime();
		assertEquals("testeTime2", analysisTime.getNomeDuplicacao());

	}

	@Test
	public void testAnalysisTime() {
		//triangulacao
		LerArquivoAnalysisTime analysisTime = new LerArquivoAnalysisTime();
		nomeAnalysisTime = new LerArquivoAnalysisTime();
		nomeAnalysisTime.setNomeArquivo("analysisTime.out");
		assertEquals("analysisTime.out", analysisTime.getNomeArquivo());

	}



}
