package Quest_04;

public class Produto {
    private String nome;
	private double preco;
	private String dataVal;
	private int qtd;
	public Produto(String nome, double preco, String dataVal, int qtd) {
		
		
		super();
		this.nome = nome;
		this.preco = preco;
		this.dataVal = dataVal;
		this.qtd = qtd;
	}
		
	public void comprar (int comprou) {
		this.qtd = qtd - comprou;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDataVal() {
		return dataVal;
	}
	public void setDataVal(String dataVal) {
		this.dataVal = dataVal;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	

}


