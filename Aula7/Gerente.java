package Aula7;

public class Gerente {

	private String nome;
	
	private int cpf ;
	
	private double salario;
	
	private int senha;
	
	private int numeroFuncionariosGerenciados;
	
	
	
	
	
	public int getSenha() {
		return senha;
	}

	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	
	
	public int getNumeroFuncionariosGerenciados() {
		return numeroFuncionariosGerenciados;
	}


	public void setNumeroFuncionariosGerenciados(int numeroFuncionariosGerenciados) {
		this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido");
			return true;
		}else {
			System.out.println("Acesso Negado");
			return false;
		}
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
}
