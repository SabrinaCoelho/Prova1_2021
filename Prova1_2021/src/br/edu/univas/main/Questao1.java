package br.edu.univas.main;

public class Questao1 {
	public static void main(String[] args) {
		int a = 43;
		int b = 80;
		int c = 100;
		int d = 64;
		double media;
		
		media = (a + b + c + d)/4;
		if(media >= 70){
			System.out.println("Aluno aprovado");
		}
		else if( media >= 50 && media <= 69) {
			System.out.println("Aluno em recuperação");
		}
		else if(media < 50) {
			System.out.println("Aluno em dependência");
		}
	}
}
