package tarefaIf;

import java.util.Scanner;

public class A4Switch {

	public static void main(String[] args) {
		
		float num1;
		float num2;
		int cal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		num1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		num2 = leia.nextFloat();
		
		System.out.println("Digite 1 para Soma");
		System.out.println("Digite 2 para Subtração");
		System.out.println("Digite 3 para Multiplicação");
		System.out.println("Digite 4 para Divisão");
		cal = leia.nextInt();
		
		switch (cal) {
		case 1:
			System.out.println("O resulto é: " + (num1 + num2));
			break;
		case 2:
			System.out.println("O resulto é: " + (num1 - num2));
			break;
		case 3:
			System.out.println("O resulto é: " + (num1 * num2));
			break;
		case 4:
			System.out.println("O resulto é: " + (num1 / num2));
			break;
			
		}
		

	}

}
