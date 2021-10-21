package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NumeroAnalises {

	// matriz dinâmica 
	private static List<List<String>> dynamic2DAnalisisTime = new ArrayList<List<String>>();
	private static List<List<String>> dynamic2DAnalisisMemory = new ArrayList<List<String>>();
	private int numMaxAnalisisTime = 0;
	private int numMaxAnalisisMemory = 0;

	public List<List<String>> getDynamic2DAnalisisTime() {
		return dynamic2DAnalisisTime;
	}
	
	public List<List<String>> getDynamic2DAnalisisMemory() {
		return dynamic2DAnalisisMemory;
	}
	
	public void getNumeroAnalysisTime() throws IOException {

			BufferedReader analysisTime = new BufferedReader(new FileReader("../TrabalhoTDD/analysisTime.out"));
			
			int i = 0, j = 0, k = 0;
			System.out.println("Arquivo analysisTime.out: ");
			
			while(analysisTime.ready()){
				String linha = analysisTime.readLine();
				if((linha.contains("-"))){
					dynamic2DAnalisisTime.add(new ArrayList<String>());
					dynamic2DAnalisisTime.get(i).add(Integer.toString(i));
					while(k<i) {
						//mostra o número de analises em cada evolução
						System.out.println("Foram feitas " + (j-1) + " análises na evolução " + (i));
						if((j)>numMaxAnalisisTime) {
							numMaxAnalisisTime=(j);
						}

						k++;
						}
					i++;
					j=0;
				}else {
					dynamic2DAnalisisTime.get(i-1).add(linha);
				}
				j++;
			}
			
			System.out.println("Foram realizadas "+ i + " evoluções no arquivo analysisTime.out");
			analysisTime.close();
		
	}
	public  void getNumeroAnalysisMemory() throws IOException {

		BufferedReader analysisMemory = new BufferedReader(new FileReader("../TrabalhoTDD/analysisMemory.out"));
		int i = 0, j = 0, k = 0;
		System.out.println("Arquivo analysisMemory.out: ");
		while(analysisMemory.ready()){
			String linha = analysisMemory.readLine();
			if((linha.contains("-"))){
				dynamic2DAnalisisMemory.add(new ArrayList<String>());
				dynamic2DAnalisisMemory.get(i).add(Integer.toString(i));
				while(k<i) {
					//mostra o número de analises em cada evolução
					System.out.println("Foram feitas " + (j-1) + " análises na evolução " + (i));
					if((j)>numMaxAnalisisMemory) {
						numMaxAnalisisMemory=(j);
					}
					k++;
				}
				i++;
				j=0;
			}else {
				dynamic2DAnalisisMemory.get(i-1).add(linha);
			}
			j++;

		}
		System.out.println("Foram realizadas "+ i + " evoluções no arquivo analysisMemory.out");
		analysisMemory.close();
	}

	public int getNumMaxAnalisisTime() {
		return numMaxAnalisisTime;
	}

	public int getNumMaxAnalisisMemory() {
		return numMaxAnalisisMemory;
	}
}