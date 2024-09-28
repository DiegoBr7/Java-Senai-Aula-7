package Aula7;

public class UsaEmprego {

	public static void main(String[] args) {
		
		Empregado trooper = new Empregado();
		
		trooper.setNome("Hans Solo"); //Classe Pessoa
		
		trooper.setRg("23.345.345-0"); // Classe PessoaFisica
		
		trooper.setCartao("RP876"); //Classe Empregado
		
		
		System.out.println(trooper.getNome());
		System.out.println(trooper.getRg());
		System.out.println(trooper.getCartao());

	}

}
