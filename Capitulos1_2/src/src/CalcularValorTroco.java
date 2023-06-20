package src;

import java.util.Scanner;

public class CalcularValorTroco {

	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); //Scanner é uma classe com funcionalidades específicas;
 
       System.out.print("Digte o valor do produto:" );
       Double valorProduto = scanner.nextDouble(); 
       
       System.out.print("Digite o valor pago pelo cliente: "  );
       Double valorPassadoPeloCliente = scanner.nextDouble();
       
      Double resultado = valorPassadoPeloCliente  - valorProduto;
       System.out.println("Troco: " + resultado);
       
			scanner.close();
		}

}
