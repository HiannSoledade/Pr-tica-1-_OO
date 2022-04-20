package A3_Questao1;

public class VIP extends Ingresso{
	private double valorAddVip;
	public VIP(double valor, double valorAddVip) {
		super(valor);
		this.valorAddVip = valorAddVip;
	}
	public double getValorAddVip() {
		return valorAddVip;
	}

	public void setValorAddVip(double valorAddVip) {
		this.valorAddVip = valorAddVip;
	}

	public void imprimeVIP() {
		double soma = (valor +  valorAddVip);
		System.out.printf("Ingresso VIP: " + soma);
	}
}
