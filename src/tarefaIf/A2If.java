package tarefaIf;

import java.util.Scanner;

public class A2If {

	public static void main(String[] args) {
		
		int numA;
		int numB;
		int numC;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número para A: ");
		numA = leia.nextInt();
		
		System.out.println("Digite um número para B: ");
		numB = leia.nextInt();
		
		System.out.println("Digite um número para C: ");
		numC = leia.nextInt();
		
		
		if (numA + numB > numC) {
			System.out.println("A soma de A + B é maior que C");
		}else if (numA + numB < numC) {
			System.out.println("A soma de A + B é menor que C");
		}else {
			System.out.println("A soma de A + B é igual C");
		}
		
		leia.close();
	}

}
