package br.edu.univas.main;

public class Questao3 {
	public static void main(String[] args) {
		int dia = 1;
		
		switch(dia) {
			case 1: {//DOMINGO
				System.out.println("Deverá trabalhar 0 horas.");
				break;
			}
			case 2: {//SEGUNDA
				System.out.println("Deverá trabalhar 7 horas.");
				break;
			}
			case 3:{//TERÇA
				System.out.println("Deverá trabalhar 7 horas.");
				break;
			}
			case 4: {//QUARTA
				System.out.println("Deverá trabalhar 6 horas.");
				break;
			}
			case 5: {//QUINTA
				System.out.println("Deverá trabalhar 5 horas.");
				break;
			}
			case 6: {//SEXTA
				System.out.println("Deverá trabalhar 4 horas.");
				break;
			}
			case 7:{//SABADO
				System.out.println("Deverá trabalhar 4 horas.");
				break;
			}
		}
	}
}
