package A2_Questão2;
import java.util.Scanner;

public class A2Q2_MAIN {

	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		System.out.println("Digite o Investimento inicial: ");
		float investimento = entry.nextFloat();
		System.out.println("Digite a taxa do rendimento: ");
		float taxa = entry.nextFloat();
		System.out.println("Digite a qtd de meses: ");
		int mes = entry.nextInt();
		Rendimento rendimento = new Rendimento(investimento,taxa,mes);
		rendimento.rendimentoMes();
	}

}
