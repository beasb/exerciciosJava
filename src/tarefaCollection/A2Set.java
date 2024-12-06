package tarefaCollection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A2Set {

	public static void main(String[] args) {

		Set<Integer> lista = new HashSet<Integer>();

		Scanner leia = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Digite um número: ");
			Integer num = leia.nextInt();
			
			lista.add(num);
			}
		
		for (Integer li : lista) {
		System.out.println(li);
		}


	}

}
