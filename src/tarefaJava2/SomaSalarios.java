package tarefaJava2;

public class SomaSalarios {

	public static void main(String[] args) {
		
		float salarioBruto = 2000.00f;
		float addNoturno = 500.00f;
		float horaExtra = 100.00f;
		float desconto = 200.00f;
		float salarioLiq;
		
		salarioLiq = salarioBruto + addNoturno + (horaExtra * 5) - desconto;

		System.out.printf("O Salário Liquido é %.2f", salarioLiq);
	}

}
