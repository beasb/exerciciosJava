package tarefaIf;

import java.util.Scanner;

public class A1If {

	public static void main(String[] args) {
		
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		
		if (num >= 0 && num % 2 == 0) {
			System.out.println("O número " + num + " é par e positivo!");
		}else if (num < 0 && num % 2 == 0) {
			System.out.println("O número " + num + " é par e negativo!");
		}else if (num == 0) {
			System.out.println("O número " + num + " é neutro");
		}else if (num > 0 && num % 2 != 0) {
			System.out.println("O número " + num + " é impar e positivo!");
		}else {
			System.out.println("O número " + num + " é impar e negativo!");
		}
		
		leia.close();
	}
}
