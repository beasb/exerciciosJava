package tarefaCollection2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A1Queue {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();

		Scanner leia = new Scanner(System.in);
	
		String opcao;
			
		do {
			
			System.out.println("\n1 - Adicionar Cliente na Fila ");
			System.out.println("\n2 - Listar todos os Cliente ");
			System.out.println("\n3 - Retirar Cliente da Fila ");
			System.out.println("\n0 - Sair ");
				
			System.out.println("\nEscolha uma Opção: ");
			opcao = leia.nextLine();
			
		
		switch (opcao) {
		
		case "1":
			System.out.println("\nDigite o nome do Cliente: ");
			String cli = leia.nextLine();
			fila.add(cli);
			System.out.println("\nO Cliente foi adicionado ");
			break;
		case "2":
			System.out.println("\nClientes na fila: " + fila);
			break;
		case "3":
			if (fila.isEmpty()) {
				System.out.println("\nA fila está vazia ");
			} else {
			System.out.println("\nRemover Cliente da fila: " + fila.remove());
			}
			break;
		case "0":
			System.out.println("\nSaindo do Programa ");
			break;
		
		}
		
		 } while (!opcao.equals("0"));
		
		leia.close();

	}

}
