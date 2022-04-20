package A1_Questao2;

public class A1Q2_MAIN {

	public static void main(String[] args) {
		EmpregoFaculdade funcionario = new EmpregoFaculdade("hiann",1000,2);
		double gastos = funcionario.getGastos();
		String info = funcionario.getInfo();
		System.out.println(gastos);
		System.out.println(info);
	}

}
