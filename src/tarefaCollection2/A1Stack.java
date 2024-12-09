package tarefaCollection2;

import java.util.Scanner;
import java.util.Stack;

public class A1Stack {

	public static void main(String[] args) {
		
		Stack<String> livros = new Stack<String>();
		
		Scanner leia = new Scanner(System.in);
		
		String opcao;
			
		do {
			
			System.out.println("\n1 - Adicionar livro na pilha ");
			System.out.println("\n2 - Listar todos os Livros ");
			System.out.println("\n3 - Retirar Livro da Pilha ");
			System.out.println("\n0 - Sair ");
				
			System.out.println("\nEscolha uma Opção: ");
			opcao = leia.nextLine();
			
		
		switch (opcao) {
		
		case "1":
			System.out.println("\nDigite o nome do Livro: ");
			String livro = leia.nextLine();
			livros.push(livro);
			System.out.println("\nO Livro foi adicionado ");
			break;
		case "2":
			System.out.println("\nLivros na pilha: " + livros);
			break;
		case "3":
			if (livros.isEmpty()) {
				System.out.println("\nA pilha está vazia ");
			} else {
			System.out.println("\nRemover livros da pilha " + livros.pop());
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
