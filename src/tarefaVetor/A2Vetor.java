package tarefaVetor;

import java.util.Scanner;

public class A2Vetor {

	public static void main(String[] args) {
		
		int num[] = new int[10];
		int i;
		int par = 0, impar = 0;
		float soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for (i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			num[i] = leia.nextInt();	
			soma += num[i];
		}
		
		System.out.println("Os pares são: " + par);
		for (i = 0; i < 10; i++) {
			if (num[i] % 2 == 0)	{
			par = num[i];
		System.out.println(par);	
		     }
		
		}
		
		System.out.println("Os impares são: " + impar);
		for (i = 0; i < 10; i++) {
			if (num[i] % 2 != 0)	{
			impar = num[i];
		System.out.println(impar);	
		     }
		
		}
		
		System.out.println("A soma é: " + soma);
		System.out.println("A media é: " + (soma / 10));

		leia.close();
	}

}
