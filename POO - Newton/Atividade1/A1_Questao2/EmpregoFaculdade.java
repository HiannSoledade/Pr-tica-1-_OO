package A1_Questao2;

public class EmpregoFaculdade {
	private String nome;
	private double salario;
	private int horasAula;

	EmpregoFaculdade(String nome, double salario, int horasAula){
		this.nome = nome;
		this.salario = salario;
		this.horasAula = horasAula;
	}
	
	double getGastos() {
		 return this.salario + 40*this.horasAula;
	}
	String getInfo() {
		return "nome: " + this.nome + " com salário " + getGastos();
	}
}
