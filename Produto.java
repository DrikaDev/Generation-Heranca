package Heranca;

public class Produto {

	private String marca;
	private String voltagem;
	private String garantia;
	private String paisOrigem;
	private String idioma;
	
	public Produto(String marca, String voltagem, String garantia, String paisOrigem, String idioma) {
		super();
		this.marca = marca;
		this.voltagem = voltagem;
		this.garantia = garantia;
		this.paisOrigem = paisOrigem;
		this.idioma = idioma;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(String voltagem) {
		this.voltagem = voltagem;
	}

	public String getGarantia() {
		return garantia;
	}

	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public void visualizar() {
		
	}	
}
