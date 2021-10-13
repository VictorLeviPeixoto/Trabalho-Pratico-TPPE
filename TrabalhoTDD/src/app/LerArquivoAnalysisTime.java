package app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import app.ehNumero;
import app.ArquivoNaoEncontradoException;


public class LerArquivoAnalysisTime {
	private static String nomeArquivo = "analysisTime.out";	
	public static void lerAnalysisTime() throws ArquivoNaoEncontradoException {
		Scanner arquivoAnalysisTime = null;
		try {
			arquivoAnalysisTime = new Scanner(new FileReader("../TrabalhoTDD/analysisTime.out")).useDelimiter("\\n");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new ArquivoNaoEncontradoException(nomeArquivo);
		}
        while (arquivoAnalysisTime.hasNext()) {
            //System.out.println( arquivoAnalysisTime.next() );
           // if(arquivoAnalysisTime.next().length() < 20) {
            	//System.out.println("ACABA AQUI");
            	//System.out.println("Esta linha acaba aqui");
            //System.out.println(arquivoAnalysisTime.next() + ";");
            	
           // }
            //else {
            	//System.out.println(i);
            	System.out.println(arquivoAnalysisTime.next());
            	
            	//if(arquivoAnalysisTime.next().length() < 30) {
            		//System.out.println("Esta linha acaba aqui");
            	//}
            	//System.out.println("Esta linha acaba aqui");
            	//if(i%12 == 0) {
            		//System.out.println(j);
            		//System.out.println("\n\n\n\n");
            		//j++;
            	//}
            	
            }
                }
        //arquivoAnalysisTime.close();
    }
	
	

