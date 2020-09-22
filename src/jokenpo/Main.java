package jokenpo;

import java.util.Random;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("***JOKENPÔ***");
		
		
		System.out.println("Escolha uma das opcoes: ");
		System.out.println("[0]PEDRA "); 
		System.out.println("[1]PAPEL ");
		System.out.println("[2]TESSOURA ");
		System.out.println("------------------------------------");
		
		Scanner teclado = new Scanner (System.in);
		System.out.print("Digite o número: "); 
		
		int numerousuario = teclado.nextInt();
		
		
		Random aleatorio = new Random();
		int numerocomputador = aleatorio.nextInt(3);
		System.out.println("O computador escolheu a opção " + numerocomputador );
		
	
		System.out.println("------------------------------------");
		System.out.println("RESULTADO: ");
		jogo r = new jogo();
		System.out.println(r.status());
		
		System.out.println("------------------------------------");
		
	}

}
