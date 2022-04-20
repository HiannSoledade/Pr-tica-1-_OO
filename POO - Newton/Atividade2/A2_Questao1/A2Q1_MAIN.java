package A2_Questao1;

public class A2Q1_MAIN {

	public static void main(String[] args) {
		Estoque estoque = new Estoque("hiann", 100, 10);
		estoque.mostra();
		estoque.precisaRepor();
		estoque.darBaixa(120);
		System.out.printf("%d",estoque.getQtdAtual());
	}

}
