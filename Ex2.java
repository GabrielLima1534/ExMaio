package LopalEx;

import java.util.Scanner;
import java.util.Random;


public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		 
		 String[] opcoes = {"pedra", "papel", "tesoura", "lagarto", "spock"};
		  
		 System.out.println("Jo ken po 2.0 com a máquina.");
		 System.out.printf("Escolha: pedra, papel, tesoura, lagarto ou spock. \n");
		
		 String jogador = sc.next().toLowerCase();
	     String maquina = opcoes[rand.nextInt(5)];
	     
	     System.out.println("Jogador escolheu: " + jogador);
	     System.out.println("Máquina escolheu: " + maquina);

		
		 if (
			(jogador.equals("pedra") && (maquina.equals("tesoura") || maquina.equals("lagarto"))) ||
		    (jogador.equals("papel") && (maquina.equals("pedra") || maquina.equals("spock"))) ||
		    (jogador.equals("tesoura") && (maquina.equals("papel") || maquina.equals("lagarto"))) ||
		    (jogador.equals("lagarto") && (maquina.equals("papel") || maquina.equals("spock"))) ||
		    (jogador.equals("spock") && (maquina.equals("pedra") || maquina.equals("tesoura")))
		        )// Spock vence pedra ou tesoura 
		    {
			 System.out.print("Jogador venceu");
		 } 
		 else if (jogador.equals(maquina)) {
			 System.out.print("Empate");
		 }
		 else {
			 System.out.println("Maquina venceu");
		 }
		 
		 sc.close();
	}

}
