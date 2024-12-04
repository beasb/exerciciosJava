package tarefaRepeticao;

import java.util.Scanner;

public class TarefaFor {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int i;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = leia.nextInt();
		
		for(i = num1; i <= num2; i++ ) {
			
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " é multiplo de 3 e 5!");
			} //else {
				// System.out.println(i + " não é multiplo de 3 e 5");
			// }
			
		}
        System.out.println("Acabou!");
	}

}
