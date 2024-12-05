package tarefaVetor;

import java.util.Scanner;

public class A1Vetor {

	public static void main(String[] args) {
		
		int num[] = {2,5,1,3,4,9,7,8,10,6};
		int i;
		int num2;
		boolean posi = false;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQual número você deseja encontrar? ");
			num2 = leia.nextInt();
		
		for (i = 0; i < 10; i++) {
			
			if (num[i] == num2) {
				System.out.println("O número " + num2 + " está localizado na posição " + i);
				posi = true;
				
			}
		} 
		if (!posi) {
			System.out.println("Não foi encontrado");
		}
		
		leia.close();
	}

}


