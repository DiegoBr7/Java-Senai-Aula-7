package Aula7;

public class GerenteComHeranca extends Funcionario{

	private int senha;
	
	private int numerosFuncionariosGerenciaveis;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumerosFuncionariosGerenciaveis() {
		return numerosFuncionariosGerenciaveis;
	}

	public void setNumerosFuncionariosGerenciaveis(int numerosFuncionariosGerenciaveis) {
		this.numerosFuncionariosGerenciaveis = numerosFuncionariosGerenciaveis;
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
	
	@Override
	public double getBonificacao() {
		return this.salario * 0.15;
	}

}
