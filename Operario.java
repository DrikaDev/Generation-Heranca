package Heranca;

public class Operario extends Pessoa{
	
	private double valorProducao;
	private double comissao;
	
	public Operario(String nome, String endereço, String cpf, int telefone, int idade, double valorProducao,
			double comissao) {
		super(nome, endereço, cpf, telefone, idade);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	//metodo:
	public void imprimirInfo() {
		System.out.println("\nNome do empregade: "+getNome()
		+"\nCPF: "+getCpf()
		+"\nIdade: "+getIdade()
		+"\nTelefone: "+getTelefone()
		+"\nEndereço: "+getEndereco()
		+"\nValor monetário total dos artigos produzidos por "+getNome()
		+" : "+valorProducao
		+"\nPorcentagem (sem o %) da comissão deste artigo: "+comissao);
		
		//System.out.println("\nValor da produção: " + getNome() + valorProducao);
		//System.out.println("\nPorcentagem (sem o %) da comissao: " + comissao);
	}

	public void calcularValorProducao() {
		double valorTotal = valorProducao + (valorProducao * (comissao/100));
		System.out.println("O valor total a ser recebido " + getNome() + "é igual a: " + valorTotal);
	}
	
}
