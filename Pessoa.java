package Heranca;

public class Pessoa {
	
	//atributos:
	private String nome;
	private String endereco;
	private String cpf;
	private int telefone;
	private int idade;
	
	//construtor:
	public Pessoa(String nome, String endereço, String cpf, int telefone, int idade) {
		super();
		this.nome = nome;
		this.endereco = endereço;
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
	}
	
	//gets e sets:

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereço) {
		this.endereco = endereço;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//metodo:
	public void validarCpf() {
		
		if(getCpf().length() != 11) {
			System.out.println("\n--CPF inválido!");
		}else {
			System.out.println("\n--CPF válido!");
		}
	}
}
