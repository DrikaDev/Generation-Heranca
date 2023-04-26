package Heranca;

//1º indicar que o Empregado é uma subclasse da super classe Pessoa:
public class Empregado extends Pessoa {

	//atributos:
	
	private int codSetor;
	private float salarioBase;
	private float imposto;
	
	//construtor:
	
	public Empregado(String nome, String endereço, String cpf, int telefone, int idade, int codSetor, float salarioBase,
			float imposto) {
		//ja puxou os atributos da super classe:
		super(nome, endereço, cpf, telefone, idade);
		this.codSetor = codSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	//getters e setters:

	public int getCodSetor() {
		return codSetor;
	}

	public void setCodSetor(int codSetor) {
		this.codSetor = codSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	//metodo:
	public void imprimirInfo() {
		System.out.println("\nNome do empregade: "+getNome()
		+"\nCPF: "+getCpf()
		+"\nIdade: "+getIdade()
		+"\nTelefone: "+getTelefone()+"\nEndereço: "+getEndereco()
		+"\nCódigo setor: "
		+codSetor+"\nSalário base: "
		+salarioBase
		+"\nValor em porcentagem (sem o %) de imposto a ser retido do salário: "
		+imposto);
		
	}
	
	public void calcularSalario() {
		double salarioTotal = salarioBase - (salarioBase * (imposto/100));
		System.out.println("\nO salário total a ser recebido pelo empregade " + getNome() 
		+ " é igual a: "+salarioTotal);
	}
}
