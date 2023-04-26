package Heranca;

public class Produto_TestaGame {

	public static void main(String[] args) {
		
		Produto[] lista = new Produto [4];
		
		lista[0] = new Produto_Jogo("Play Station", "110v", "3 meses", "China", "Inglês", "Sonic", "abril/2022", true);
		lista[1] = new Produto_Jogo("Nintendo", "bi-volt", "3 meses", "USA", "Português", "Sonic", "abril/2022", true);
		lista[2] = new Produto_Console("Nintendo", "110v", "1 ano", "China", "Inglês", "Nintendo", "Wi-fi");
		lista[3] = new Produto_Console("PlayStation", "bi-volt", "9 meses", "USA", "Português", "PlayStation", "USB");
		
		for(Produto produtos : lista) {
			produtos.visualizar();
		}
	}
}
