package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NumeroAnalises {

	// matriz dinâmica 

	private static List<List<String>> dynamic2D = new ArrayList<List<String>>();

	
	public static void getNumeroAnalysisTime() throws IOException {
			dynamic2D.add(new ArrayList<String>());

			BufferedReader analysisTime = new BufferedReader(new FileReader("../TrabalhoTDD/analysisTime.out"));
			
			int i = 0, j = 0, k = 0;
			
			System.out.println("Arquivo analysisTime.out: ");
			
			while(analysisTime.ready()){
				String linha = analysisTime.readLine();
				if((linha.contains("-"))){
					dynamic2D.add(new ArrayList<String>());

					while(k<i) {
						//mostra o número de analises em cada evolução
						System.out.println("Foram feitas " + (j-1) + " análises na evolução " + (i));
						k++;
						}
					i++;
					j=0;
				}else {
					dynamic2D.get(i).add(linha);
				}
				j++;
			}
			
			System.out.println("Foram realizadas "+ i + " evoluções no arquivo analysisTime.out");
			analysisTime.close();
		
	}
	public static void getNumeroAnalysisMemory() throws IOException {
		dynamic2D.add(new ArrayList<String>());

		BufferedReader analysisMemory = new BufferedReader(new FileReader("../TrabalhoTDD/analysisMemory.out"));
		int i = 0, j = 0, k = 0;
		System.out.println("Arquivo analysisMemory.out: ");
		while(analysisMemory.ready()){
			String linha = analysisMemory.readLine();
			if((linha.contains("-"))){
				dynamic2D.add(new ArrayList<String>());
				while(k<i) {
					//mostra o número de analises em cada evolução
					System.out.println("Foram feitas " + (j-1) + " análises na evolução " + (i));
					k++;
				}
				i++;
				j=0;
			}else {
				dynamic2D.get(i).add(linha);
			}
			j++;
		}
		
		System.out.println("Foram realizadas "+ i + " evoluções no arquivo analysisMemory.out");
		analysisMemory.close();
	
	}
}