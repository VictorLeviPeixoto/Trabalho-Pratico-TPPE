package test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.LerArquivoAnalysisMemory;
import app.LerArquivoAnalysisTime;

@RunWith(Parameterized.class)
public class testArquivoParametrizado {
	
	@Parameters
	public static Iterable getParameters() {
		Object[][] data = new Object[][] {
			{"testeMemory1", "testeMemory1"},
			{"testeMemory2", "testeMemory2"},
			{"analysisMemory.out", "analysisMemory.out"},
			{"testeTime1", "testeTime1"},
			{"testeTime2", "testeTime2"},
			{"analysisTime.out", "analysisTime.out"}
		};
		return Arrays.asList(data);
	}

	private String arquivoLido;
	private String arquivoEsperado;
	
	public testArquivoParametrizado(String arquivoLido, String arquivoEsperado) {
		this.arquivoLido = arquivoLido;
		this.arquivoEsperado = arquivoEsperado;
	}

	@Test
	public void testTime() {
		LerArquivoAnalysisMemory arquivoEsperado = new LerArquivoAnalysisMemory();
		arquivoEsperado.setNomeArquivo(arquivoLido);
		assertEquals(arquivoLido, arquivoEsperado.getNomeArquivo());
	}
	
	@Test
	public void testMemory() {
		LerArquivoAnalysisTime arquivoEsperado = new LerArquivoAnalysisTime();
		arquivoEsperado.setNomeArquivo(arquivoLido);
		assertEquals(arquivoLido, arquivoEsperado.getNomeArquivo());
	}

}
