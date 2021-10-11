package app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class LerArquivoAnalysisTime {
	
	public static void lerAnalysisTime() throws ArquivoNaoEncontradoException {
        Scanner arquivoAnalysisTime = null;
		try {
			arquivoAnalysisTime = new Scanner(new FileReader("../TrabalhoTDD/analysisTime.out")).useDelimiter("\\n");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        while (arquivoAnalysisTime.hasNext()) {
            System.out.println( arquivoAnalysisTime.next() );
        }
        arquivoAnalysisTime.close();
    }
	
	
}
