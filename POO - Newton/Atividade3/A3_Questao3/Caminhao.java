package A3_Questao3;

public class Caminhao extends Veiculo{
	private int eixo;

	public Caminhao(String placa, int ano, int eixo) {
		super(placa, ano);
		this.eixo = eixo;
	}
	public int getEixo() {
		return eixo;
	}
	public void setEixo(int eixo) {
		this.eixo = eixo;
	}
	public void exibirDados() {};
	
}
