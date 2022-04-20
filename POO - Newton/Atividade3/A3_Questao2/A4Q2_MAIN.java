package A3_Questao2;

public class A4Q2_MAIN {

	public static void main(String[] args) {
		FComissionado fcomissionado = new FComissionado(10,"hiann",1200,20,100);
		double teste = fcomissionado.calcularProventos();
		System.out.print(teste);
	}

}
