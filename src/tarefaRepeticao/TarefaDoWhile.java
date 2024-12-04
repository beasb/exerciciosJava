package tarefaRepeticao;

import java.util.Scanner;

public class TarefaDoWhile {

	public static void main(String[] args) {
		
		int num;
		int res = 0;
		
		Scanner leia = new Scanner(System.in);

		do {   
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			if (num > 0) {
			
			res += num;
			}

		} while (num != 0);
		System.out.println("\nO resultado da soma é: " + res);	
	}

}
