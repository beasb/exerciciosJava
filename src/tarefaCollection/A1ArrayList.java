package tarefaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A1ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<String>();
		
		Scanner leia = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
		
		System.out.println("Digite uma cor: ");
		String cor = leia.nextLine();
		
		cores.add(cor);
		}
		
		System.out.println("\nAs cores são: " + cores);
		Collections.sort(cores);
		System.out.println("\nAs cores ordenadas são: " + cores );
		
		leia.close();
	}

}
