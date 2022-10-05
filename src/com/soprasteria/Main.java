package com.soprasteria;

public class Main {

	public static void main(String[] args) {
		String nome = "arianna";
		String cognome = "greco";
		String eta = "29";
		String luogo = "cantu";
		double altezza = 1.68;
		boolean patente = true;
		char genere = 'f';
		
		System.out.println("nome:" + nome);
		System.out.println("cognome:" + cognome);
		System.out.println("età:" + eta);
		System.out.println("luogo di nascita:" + luogo);
		System.out.println("altezza:" + altezza);
		
		if (patente) {
			System.out.println("patente: si");
		};
		
		if (genere == 'f') {
			System.out.println("genere: femminile");
		};
			
		
	}

}
