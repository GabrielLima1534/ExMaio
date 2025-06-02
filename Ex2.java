package LopalEx;

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário
import java.util.Random;  // Importa a classe Random para gerar escolhas aleatórias da máquina

public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Cria o scanner para leitura do teclado
        Random rand = new Random();           // Cria o gerador de números aleatórios

        // Define as opções possíveis para o jogo
        String[] opcoes = {"pedra", "papel", "tesoura", "lagarto", "spock"};

        // Exibe a introdução e instruções ao jogador
        System.out.println("Jo ken po 2.0 com a máquina.");
        System.out.printf("Escolha: pedra, papel, tesoura, lagarto ou spock. \n");

        // Lê a escolha do jogador e converte para minúsculas (evita erro por maiúsculas)
        String jogador = sc.next().toLowerCase();

        // Gera uma escolha aleatória da máquina entre as 5 opções
        String maquina = opcoes[rand.nextInt(5)];

        // Exibe as escolhas feitas por jogador e máquina
        System.out.println("Jogador escolheu: " + jogador);
        System.out.println("Máquina escolheu: " + maquina);

        // Verifica se o jogador venceu com base nas regras do "pedra, papel, tesoura, lagarto, spock"
        if (
            (jogador.equals("pedra") && (maquina.equals("tesoura") || maquina.equals("lagarto"))) ||
            (jogador.equals("papel") && (maquina.equals("pedra") || maquina.equals("spock"))) ||
            (jogador.equals("tesoura") && (maquina.equals("papel") || maquina.equals("lagarto"))) ||
            (jogador.equals("lagarto") && (maquina.equals("papel") || maquina.equals("spock"))) ||
            (jogador.equals("spock") && (maquina.equals("pedra") || maquina.equals("tesoura")))
        ) {
            System.out.print("Jogador venceu"); // Se alguma das condições acima for verdadeira, o jogador vence
        } 
        else if (jogador.equals(maquina)) {
            System.out.print("Empate"); // Se as escolhas forem iguais, é empate
        } 
        else {
            System.out.println("Máquina venceu"); // Caso contrário, a máquina vence
        }

        sc.close(); // Fecha o scanner (boa prática para evitar vazamento de recurso)
    }
}

