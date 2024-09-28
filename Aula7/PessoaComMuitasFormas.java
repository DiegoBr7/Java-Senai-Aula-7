package Aula7;

import javax.swing.JOptionPane;

public class PessoaComMuitasFormas {

	public static void main(String[] args) {
		Pessoa mano = null;

		int tipo = Integer.parseInt(JOptionPane.showInputDialog("Forneça um numero de 1 a 4 :"));

		switch(tipo) {

		case 1 :
			mano = new Pessoa(); break;
		case 2 :
			mano = new PessoaFisica(); break;

		case 3 :
			mano = new PessoaJuridica(); break;

		case 4 :
			mano = new Empregado(); break;
		default:{
			System.out.println("Tipo desconhecido");
			System.exit(0);
		}


		}

		mano.mostrarClasse();

	}

}
