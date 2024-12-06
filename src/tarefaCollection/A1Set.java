package tarefaCollection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A1Set {

	public static void main(String[] args) {
		
		Set<Integer> lista = new HashSet<Integer>();
		
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
		
		if (lista.contains(num)) {
		System.out.println("\nO número: " + num + " foi encontrado!");
		} else {
			System.out.println("\nO número: " + num + " não foi encontrado");
		}
		

	}

}
