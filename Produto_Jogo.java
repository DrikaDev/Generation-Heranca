package Heranca;

public class Produto_Jogo extends Produto {

	private String nome;
	private String dataLancamento;
	private Boolean legenda = true;
	
	public Produto_Jogo(String marca, String voltagem, String garantia, String paisOrigem, String idioma, String nome,
			String dataLancamento, Boolean legenda) {
		super(marca, voltagem, garantia, paisOrigem, idioma);
		this.nome = nome;
		this.dataLancamento = dataLancamento;
		this.legenda = legenda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Boolean getLegenda() {
		return legenda;
	}

	public void setLegenda(Boolean legenda) {
		this.legenda = legenda;
	}
	
	public void visualizar() {
		System.out.println("\nDetalhes do Jogo\n");
		System.out.println("Jogo: " + getMarca());
		System.out.println("Voltagem: " + getVoltagem());
		System.out.println("Garantia: " + getGarantia());
		System.out.println("País de origem: " + getPaisOrigem());
		System.out.println("Idioma: " + getIdioma());
		System.out.println("Nome do jogo: " + nome);
		System.out.println("Data Lançamento: " + dataLancamento);
		System.out.println("Legenda: " + legenda);
	}
}
