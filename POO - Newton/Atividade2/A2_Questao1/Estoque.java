package A2_Questao1;

public class Estoque {
	private String nome;
	private int qtdAtual;
	private int qtdMinima;
	
	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		super();
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdAtual() {
		return qtdAtual;
	}

	private void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public int getQtdMinima() {
		return qtdMinima;
	}

	public void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	
	void darBaixa(int qtde){
		if(this.qtdAtual >= qtde) {
			setQtdAtual(this.qtdAtual - qtde);
		}else{
			System.out.printf("quantidade insuficiente no estoque\n");
		}
	}
	
	void  mostra(){
		System.out.printf("nome do produto: %s quantidade mínima: %d quantidade atual: %d\n", this.nome, this.qtdAtual, this.qtdMinima);
	}
	
	boolean precisaRepor(){
		return (this.qtdAtual <= this.qtdMinima)? true:false;
	}
}
