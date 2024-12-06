package tarefaCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class A2ArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<Integer>();

		Scanner leia = new Scanner(System.in);
		
		lista.add(2);
		lista.add(5);
		lista.add(1);
		lista.add(3);
		lista.add(4);
		lista.add(9);
		lista.add(7);
		lista.add(8);
		lista.add(10);
		lista.add(6);
		
		Integer num = 0;
		for (int i = 0; i < 1; i++) {
		System.out.println("Procure um número: ");
		num = leia.nextInt();
		}
		
		Integer posi = lista.indexOf(num);
		if (lista.contains(num)) {
		System.out.println("\nO número: " + num + " está na posição " + posi);
		} else {
			System.out.println("\nO número: " + num + " não foi encontrado");
		}


	}

}
