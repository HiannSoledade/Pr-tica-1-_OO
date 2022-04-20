package A3_Questao3;

public class Veiculo {
	private String placa;
	private int ano;
	
	public Veiculo(String placa, int ano) {
		this.placa = placa;
		this.ano = ano;
	}
	public Veiculo() {}
	
	public String getPlaca() {
		return "";
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return 0;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void setAno(String  ano) {
		this.ano = Integer.parseInt(ano);
	}
	
	
	
}
