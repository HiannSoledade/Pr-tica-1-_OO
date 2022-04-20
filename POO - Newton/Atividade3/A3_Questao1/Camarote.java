package A3_Questao1;

public class Camarote extends Ingresso{
	private String local;
	private double valorAddCam;
	public Camarote(double valor, String local, double valorAddCam) {
		super(valor);
		this.local = local;
		this.valorAddCam = valorAddCam;
		// TODO Auto-generated constructor stub
	}
	public void imprimeCamarote() {
		System.out.printf("Ingresso Camarote: %d \n", (valor + valorAddCam));
		System.out.println("No local:  " + local);
	}
}
