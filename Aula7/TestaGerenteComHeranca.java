package Aula7;

public class TestaGerenteComHeranca {
	public static void main(String[] args) {
		GerenteComHeranca gerente = new GerenteComHeranca();
		Funcionario Jose = new Funcionario();	
		
		//podemos chamar metodos do funcionarios
		
		gerente.setNome("Joao da Silva");
		
		Jose.setNome("Zeus");	
		
		gerente.setCpf(123456789);
		
		// e tambem metodos do gerente 
		
		gerente.setSenha(34343);
		
		Jose.setSalario(1500);
		
		gerente.setSalario(25000);
		
		//testando a heranca 
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getSenha());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getBonificacao());
		System.out.println(Jose.getNome());
		System.out.println(Jose.getBonificacao());
		System.out.println(Jose.salario);
		
		
		
		
	}
}
