package LopalEx;

import java.util.Scanner; // Importa a classe Scanner para leitura de entrada

public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria o Scanner para ler dados do usuário

        // Solicita ao usuário que digite uma senha
        System.out.println("Digite uma senha para validar:");
        String senha = sc.nextLine(); // Lê a senha digitada

        // Verifica se a senha é válida, chamando o método senhaValida
        if (senhaValida(senha)) {
            System.out.println("Senha válida.");
        } else {
            System.out.println("Senha inválida.");
        }

        sc.close(); // Boa prática: fecha o Scanner
    }

    // Método que verifica se a senha atende aos critérios exigidos
    public static boolean senhaValida(String senha) {
        boolean temMaiuscula = false; // Verifica se tem pelo menos uma letra maiúscula
        boolean temPrimo = false;     // Verifica se tem pelo menos um número primo (2, 3, 5 ou 7)
        boolean temEspecial = false;  // Verifica se tem pelo menos um caractere especial

        // Define os caracteres especiais permitidos
        String caracteresEspeciais = "!@#$%&*()_+=-{}[]:;\"'<>,.?/";
        // Define os caracteres que são vogais (maiúsculas e minúsculas)
        String vogais = "aeiouAEIOU";

        // Percorre cada caractere da senha
        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i); // Caractere atual

            // Verifica se o caractere é uma letra maiúscula
            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            }

            // Verifica se o caractere é um número primo entre os definidos
            if ("2357".indexOf(c) != -1) {
                temPrimo = true;
            }

            // Verifica se o caractere é um dos caracteres especiais
            if (caracteresEspeciais.indexOf(c) != -1) {
                temEspecial = true;
            }

            // Verifica se há vogais repetidas seguidas (ignorando maiúsculas/minúsculas)
            if (i > 0) {
                char anterior = senha.charAt(i - 1); // Caractere anterior
                // Se ambos forem vogais e forem iguais (ignorar maiúsculas), a senha é inválida
                if (vogais.indexOf(c) != -1 && vogais.indexOf(anterior) != -1 &&
                    Character.toLowerCase(c) == Character.toLowerCase(anterior)) {
                    return false; // Vogais duplicadas seguidas => senha inválida
                }
            }
        }

        // Retorna true apenas se a senha tiver:
        // - pelo menos uma letra maiúscula
        // - pelo menos um número primo (2, 3, 5 ou 7)
        // - pelo menos um caractere especial
        return temMaiuscula && temPrimo && temEspecial;
    }
}
