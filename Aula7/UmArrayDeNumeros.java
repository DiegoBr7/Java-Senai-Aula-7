package Aula7;

import java.text.DecimalFormat;

public class UmArrayDeNumeros {

	public static void main(String[] args) {
		int[] inteiro =  new int[10];// cria um array

		DecimalFormat df = new DecimalFormat();

		df.applyPattern("000");

		for (int i = 0 ; i < inteiro.length ; i++) {
			inteiro[i] = (int)(Math.random() * 1000);
			System.out.println(df.format(inteiro[i]));
		}

	}

}
