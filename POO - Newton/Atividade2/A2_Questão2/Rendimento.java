package A2_Questão2;

public class Rendimento {
	private float investimentoInicial = 0;
	private float  taxaRendimento = 0;
	private int meses = 0;
	
	public Rendimento(float investimentoInicial, float taxaRendimento, int meses) {
		this.investimentoInicial = investimentoInicial;
		this.taxaRendimento = taxaRendimento;
		this.meses = meses;
	}

	public float getInvestimentoInicial() {
		return investimentoInicial;
	}

	public void setInvestimentoInicial(float investimentoInicial) {
		this.investimentoInicial = investimentoInicial;
	}

	public float getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(float taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	public int getMeses() {
		return meses;
	}

	public void setMeses(int meses) {
		this.meses = meses;
	}

	void rendimentoMes(){
		float rendimento = 0;
		for (int i = 1; i <= this.meses; i++) {
			rendimento = this.investimentoInicial + this.investimentoInicial*this.taxaRendimento/100;
			setInvestimentoInicial(rendimento);
			System.out.printf("Mês %d rendeu: %.2f\n", i, rendimento);
		}
	}
	
}
