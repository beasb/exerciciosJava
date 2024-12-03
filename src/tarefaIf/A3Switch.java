package tarefaIf;

import java.util.Scanner;

public class A3Switch {

	public static void main(String[] args) {
		
		int opcao;
		int quant;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite 1 para Cachorro Quente - R$10.00");
		System.out.println("Digite 2 para X-Salada - R$15.00");
		System.out.println("Digite 3 para X-Bacon -  R$18.00");
		System.out.println("Digite 4 para Bauru -  R$12.00");
		System.out.println("Digite 5 para Refrigerante -  R$8.00");
		System.out.println("Digite 6 para Suco de Laranja -  R$13.00");
		opcao = leia.nextInt();
		
		System.out.println("Digite a quantidade do produto: ");
		quant = leia.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Cachorro Quente");
			System.out.println("total: " + (10.00 * quant));
			break;
		case 2:
			System.out.println("X-Salada");
			System.out.println("total: " + (15.00 * quant));
			break;
		case 3:
			System.out.println("X-Bacon");
			System.out.println("total: " + (18.00 * quant));
			break;
		case 4:
			System.out.println("Bauru");
			System.out.println("total: " + (12.00 * quant));
			break;
		case 5:
			System.out.println("Refrigerante");
			System.out.println("total: " + (8.00 * quant));
			break;
		case 6:
			System.out.println("Suco de Laranja");
			System.out.println("total: " + (13.00 * quant));
			break;
		default:
			System.out.println("Opção Inválida");
		}
		
		leia.close();
			
	}

}
