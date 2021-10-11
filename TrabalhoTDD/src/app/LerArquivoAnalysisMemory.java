package app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class LerArquivoAnalysisMemory {
	
	public static void lerAnalysisMemory() throws ArquivoNaoEncontradoException {
        Scanner arquivoAnalysisMemory = null;
		try {
			arquivoAnalysisMemory = new Scanner(new FileReader("../TrabalhoTDD/analysisMemory.out")).useDelimiter("\\n");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        while (arquivoAnalysisMemory.hasNext()) {
            System.out.println( arquivoAnalysisMemory.next() );
        }
        arquivoAnalysisMemory.close();
    }

}
