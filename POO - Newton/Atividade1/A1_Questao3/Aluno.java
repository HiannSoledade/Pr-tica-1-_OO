package A1_Questao3;

public class Aluno {
	private String nome;
	private String matricula;
	private float notaAV1;
	private float notaAV2;
	private float notaAE;
	private String curso;
	private int periodo;
	private String curso2;
	
	public Aluno(String nome, String matricula, float notaAV1, float notaAV2, float notaAE, String curso, int periodo) {
		this.nome = nome;
		this.matricula = matricula;
		this.notaAV1 = notaAV1;
		this.notaAV2 = notaAV2;
		this.notaAE = notaAE;
		this.curso = curso;
		this.periodo = periodo;
	}

	public float getNotaAV1() {
		return notaAV1;
	}

	public void setNotaAV1(float notaAV1) {
		this.notaAV1 = notaAV1;
	}

	public float getNotaAV2() {
		return notaAV2;
	}

	public void setNotaAV2(float notaAV2) {
		this.notaAV2 = notaAV2;
	}

	public float getNotaAE() {
		return notaAE;
	}

	public void setNotaAE(float notaAE) {
		this.notaAE = notaAE;
	}
	
	public void avaliarAluno(float notaAV1, float notaAV2) {
		if ((this.notaAV1 + this.notaAV2)/2 == 60) {
			System.out.println("APROVADO");
		}else {
			System.out.println("REPROVADO");
		}
	}
	
	public void avaliarRecuperaçao (float notaAV1, float notaAV2, float notaAE) {
		if ((this.notaAV1 + this.notaAV2 + this.notaAE)/3 == 60) {
			System.out.println("APROVADO");
		}else {
			System.out.println("REPROVADO");
		}
	}
}
