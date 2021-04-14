package br.edu.univas.main;

public class Questao2 {
	public static void main(String[] args) {
		int a = 1000;
		int b = -50;
		int c = 50;
		int c1, c2, c3, c4, c5, c6, c7;
		//ano atual -> 2021
		c1 = (2021 + a) + b;
		c2 = (2021 + a) + c;
		c3 = (2021 + b) + c;
		c4 = (2021 + b) + a;
		c5 = (2021 + c) + a;
		c6 = (2021 + c) + b;
		c7 = 2021 + a + b + c;
		
		System.out.println("Iniciado");
		
		if(c1 == 2021) {//FUTURO 12 ANOS E VOLTEI 
			System.out.println("Sim.");
		}
		else if(c2 == 2021) {
			System.out.println("Sim.");
		}
		else if(c3 == 2021) {
			System.out.println("Sim.");
		}
		else if (c4 == 2021){
			System.out.println("Sim.");
		}
		else if(c5 == 2021) {
			System.out.println("Sim.");
		}
		else if(c6 == 2021) {
			System.out.println("Sim.");
		}
		else if(c7 == 2021) {
			System.out.println("Sim.");
		}
		else {
			System.out.println("Não.");
		}
	}
}
