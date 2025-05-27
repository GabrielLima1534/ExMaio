package LopalEx;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String mascote1 = "Fuleco";
		String mascote2 = "Capivara Skatista";
		String mascote3 = "Canarinho Pistola";
		String mascote4 = "Tigrinho das bets";
		
        int votos1 = 0, votos2 = 0, votos3 = 0, votos4 = 0;
        String entrada = "";
        
        do {
            System.out.println("Digite o número da opção para votar ou 'fim' para encerrar:");
            System.out.println("1 - " + mascote1);
            System.out.println("2 - " + mascote2);
            System.out.println("3 - " + mascote3);
            System.out.println("4 - " + mascote4);
            System.out.print("Sua escolha: ");
            
            entrada = sc.next();

            switch (entrada) {
                case "1":
                    votos1++;
                    break;
                case "2":
                    votos2++;
                    break;
                case "3":
                    votos3++;
                    break;
                case "4":
                    votos4++;
                    break;
                case "fim":
                    System.out.println("Votação encerrada.");
                    break;
                default:
                    System.out.println("Entrada inválida. Tente novamente.");
            }

            System.out.println();

        } while (!entrada.equalsIgnoreCase("fim"));

        int total = votos1 + votos2 + votos3 + votos4;

        double percentual1 = (votos1 / (double) total) * 100;
        double percentual2 = (votos2 / (double) total) * 100;
        double percentual3 = (votos3 / (double) total) * 100;
        double percentual4 = (votos4 / (double) total) * 100;

        System.out.println("Resultado final da votação:");
        System.out.printf("%s: %.2f%% dos votos (%d votos)\n", mascote1, percentual1, votos1);
        System.out.printf("%s: %.2f%% dos votos (%d votos)\n", mascote2, percentual2, votos2);
        System.out.printf("%s: %.2f%% dos votos (%d votos)\n", mascote3, percentual3, votos3);
        System.out.printf("%s: %.2f%% dos votos (%d votos)\n", mascote4, percentual4, votos4);

        // Identifica o vencedor
        String vencedor = mascote1;
        int maiorVoto = votos1;

        if (votos2 > maiorVoto) {
            maiorVoto = votos2;
            vencedor = mascote2;
        }
        if (votos3 > maiorVoto) {
            maiorVoto = votos3;
            vencedor = mascote3;
        }
        if (votos4 > maiorVoto) {
            maiorVoto = votos4;
            vencedor = mascote4;
        }

        System.out.println("\nO mascote vencedor foi: " + vencedor + " com " + maiorVoto + " votos!");

        sc.close();
	}
}
