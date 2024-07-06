package org.lessons.java.security;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = "Viviana";
		String cognome = "Adamo";
		String colorePrefe = "Rosa";

		byte meseNascita = 9;
		byte giornoNascita = 28 ;
		short annoNascita = 1997;
		int dataNascita = meseNascita + giornoNascita + annoNascita;
		
		String password = nome + "-" + cognome + "-" + colorePrefe + "-" + dataNascita ;

System.out.println(password);
	}

}
