package A3_Questao1;

public class Normal extends Ingresso{
	public Normal(double valor) {
		super(valor);
	}
	
	public void imprimeNormal() {
		System.out.printf("Ingresso Normal: " + getValor());
	}
}
