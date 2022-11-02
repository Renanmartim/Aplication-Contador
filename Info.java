package main;

import java.util.Scanner;

public class Info {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Quantos números deseja digitar: ");
		
		int n = sc.nextInt();
		
		
		double [] vetor = new double[n];
		
		for (int x = 0; x < vetor.length; x++) {
			
			System.out.println("Digite um número: ");
			vetor[x] = sc.nextDouble();
			
		};
		
		System.out.println("NUM PARES: ");
		
		for (int x = 0; x < vetor.length; x++) {
			
			
			if (vetor[x] % 2 == 0) {
				System.out.println(vetor[x]);
			};
			
		};
		
		int pares = 0;
	    
		for (int x = 0; x < vetor.length; x++) {
			
			
			if (vetor[x] % 2 == 0) {
				pares ++;
			};
			
		};
		
		System.out.println("QUANTIDADE DE PARES: " + pares);
		
		sc.close();
	}
	
	
	
	

}
