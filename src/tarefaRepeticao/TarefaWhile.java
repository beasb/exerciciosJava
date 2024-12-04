package tarefaRepeticao;

import java.util.Scanner;

public class TarefaWhile {

	public static void main(String[] args) {
		
		String continua = "s";
		int idade;
		int menor21 = 0;
		int maior50 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Você deseja digitar a sua idade? ");
		System.out.println("\nDigite S para sim e N para não: ");
		continua = leia.nextLine();
		
		while (!continua.equals("n")) {
			System.out.println("\nDigite sua idade: ");
			idade = leia.nextInt();
			
			if (idade < 0) {
				System.out.println("Idade inválida");
				break;
			}
			
			if (idade < 21) {
				menor21++;
			}else if (idade > 50) {
				maior50++;
			}
		}

		 System.out.println("\nTotal de pessoas menores de 21 anos: " + menor21);
	     System.out.println("Total de pessoas maiores de 50 anos: " + maior50);
	}

}
