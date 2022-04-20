package A3_Questao1;
import java.util.Scanner;

public class A3Q1_MAIN {

	public static void main(String[] args) {
		double valorIgresso;
		double valorAdd;
		String local;
		
		Ingresso ingresso = new Ingresso(0);
		
		Scanner entry = new Scanner(System.in);
		System.out.println("		MENU DE ESCOLHA");
		System.out.println(" (1) Ingresso Normal.");
		System.out.println(" (2) VIP.");
		System.out.println(" (3)Camarote.");
		System.out.println("Digite a opção desejada: ");
		int escolha = entry.nextInt();
		switch(escolha) {
			case 1:
				System.out.println("		MENU Ingresso Normal");
				System.out.println("Digite o valor do ingresso: ");
				valorIgresso = entry.nextDouble();
				ingresso.setValor(valorIgresso);
				Normal normal = new Normal(ingresso.getValor());
				normal.imprimeNormal();
				break;
			case 2:
				VIP Vip = new VIP(0, 0);
				System.out.println("		MENU VIP");
				System.out.println("Digite o valor do ingresso: ");
				valorIgresso = entry.nextDouble();
				ingresso.setValor(valorIgresso);
				System.out.println("Digite o valor adicional: ");
				valorAdd = entry.nextDouble();
				Vip.setValorAddVip(valorAdd);
				Vip.imprimeVIP();
				break;
			case 3:
				System.out.println("		MENU Camarote");
				System.out.println("Digite o valor do ingresso: ");
				valorIgresso = entry.nextDouble();
				System.out.println("Digite o valor adicional: ");
				valorAdd = entry.nextDouble();
				System.out.println("Digite o local: ");
				local = entry.nextLine();
				Camarote camarote = new Camarote(valorIgresso, local, valorAdd);
				camarote.imprimeCamarote();
				break;
			default:
				System.out.println("ERROR");
				break;
		}
		
	}

}
