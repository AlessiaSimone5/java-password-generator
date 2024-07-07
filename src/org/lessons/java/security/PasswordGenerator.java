package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = "Viviana";
		String cognome = "Adamo";
		String colorePrefe = "Rosa";

		byte meseNascita = 9;
		byte giornoNascita = 28 ;
		short annoNascita = 1997;

		
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("type your name");
		nome = scanner.nextLine();	
		System.out.println("type your last name");
		cognome = scanner.nextLine();
		System.out.println("type your favorite colour");
		colorePrefe = scanner.nextLine();
		
		System.out.println("type your birthday mounth");
		meseNascita = scanner.nextByte();
		System.out.println("type your birthday day");
		giornoNascita = scanner.nextByte();
		System.out.println("type your birthday year");
		annoNascita = scanner.nextShort();
		
		int dataNascita = meseNascita + giornoNascita + annoNascita;				
		String password = nome + "-" + cognome + "-" + colorePrefe + "-" + dataNascita ;
System.out.println(password);
	}

}
