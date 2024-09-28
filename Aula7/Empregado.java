package Aula7;

public class Empregado extends PessoaFisica{

	private String cartao ;
	

	
	
	public String getCartao() {
		return cartao;
	}
	
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}


	public void mostrarClasse() {
		System.out.println("Classe empregado");
	}
	
	
}
