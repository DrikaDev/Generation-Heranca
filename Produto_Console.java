package Heranca;

public class Produto_Console extends Produto{

	private String plataforma;
	private String conexao;
	
	public Produto_Console(String marca, String voltagem, String garantia, String paisOrigem, String idioma,
			String plataforma, String conexao) {
		super(marca, voltagem, garantia, paisOrigem, idioma);
		this.plataforma = plataforma;
		this.conexao = conexao;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getConexao() {
		return conexao;
	}

	public void setConexao(String conexao) {
		this.conexao = conexao;
	}
	
	public void visualizar() {
		System.out.println("\nDetalhes do Console\n");
		System.out.println("Jogo: " + getMarca());
		System.out.println("Voltagem: " + getVoltagem());
		System.out.println("Garantia: " + getGarantia());
		System.out.println("País de origem: " + getPaisOrigem());
		System.out.println("Idioma: " + getIdioma());
		System.out.println("Plataforma: " + plataforma);
		System.out.println("Conexões: " + conexao);
	}
}
