package src;

import java.util.Scanner;

public class IMC {
	
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite seu peso: " );
		Double peso = scanner.nextDouble();
		
		
		System.out.println("Digite sua altura: " );
		Double altura = scanner.nextDouble();
		
		Double alturaQuadrado = altura * altura;
			
		Double imc =  (peso / alturaQuadrado);
		System.out.println("IMC: "  + imc);
		
		scanner.close();
	
		
		
	}

}
