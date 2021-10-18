package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumeroAnalises {
	
	public static void getNumeroAnalysisTime() throws IOException {
			BufferedReader analysisTime = new BufferedReader(new FileReader("../TrabalhoTDD/analysisTime.out"));
			int i = 0, j = 0, k = 0;
			System.out.println("Arquivo analysisTime.out: ");
			while(analysisTime.ready()){
			String linha = analysisTime.readLine();
			if((linha.contains("-"))){
				while(k<i) {
					//mostra o número de analises em cada evolução
					System.out.println("Foram feitas " + (j-1) + " análises na evolução " + (i));
					k++;
					}
				i++;
				j=0;
				
			}
			j++;
			
			}
			System.out.println("Foram realizadas "+ i + " evoluções no arquivo analysisTime.out");
			analysisTime.close();
		
	}
	public static void getNumeroAnalysisMemory() throws IOException {
		BufferedReader analysisMemory = new BufferedReader(new FileReader("../TrabalhoTDD/analysisMemory.out"));
		int i = 0, j = 0, k = 0;
		System.out.println("Arquivo analysisMemory.out: ");
		while(analysisMemory.ready()){
		String linha = analysisMemory.readLine();
		if((linha.contains("-"))){
			while(k<i) {
				//mostra o número de analises em cada evolução
				System.out.println("Foram feitas " + (j-1) + " análises na evolução " + (i));
				k++;
				}
			i++;
			j=0;
			
		}
		j++;
		
		}
		System.out.println("Foram realizadas "+ i + " evoluções no arquivo analysisMemory.out");
		analysisMemory.close();
	
}

}
