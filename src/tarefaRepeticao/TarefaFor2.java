package tarefaRepeticao;

import java.util.Scanner;

public class TarefaFor2 {

	public static void main(String[] args) {
		
		int num, i;
		int par = 0;
		int impar = 0;
		
		Scanner leia = new Scanner(System.in);		
		
		for (i = 1; i < 11; i++) {
			System.out.println("\nDigite o " + i + "º número: ");
			num = leia.nextInt();
			
		if (num % 2 == 0)	{
				par++;
	        } else {
	        	impar++;
	        }
			
		}
		
        System.out.println("O total de números pares é: " + par);
        System.out.println("O total de números ímpares é: " + impar);

	}

}
