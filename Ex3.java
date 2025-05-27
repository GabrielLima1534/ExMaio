package LopalEx;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma senha para validar:");
        String senha = sc.nextLine();

        if (senhaValida(senha)) {
            System.out.println("Senha válida.");
        } else {
            System.out.println("Senha inválida.");
        }
    }

    public static boolean senhaValida(String senha) {
        boolean temMaiuscula = false;
        boolean temPrimo = false;
        boolean temEspecial = false;

        String caracteresEspeciais = "!@#$%&*()_+=-{}[]:;\"'<>,.?/";
        String vogais = "aeiouAEIOU";

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);

            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            }

            if ("2357".indexOf(c) != -1) {
                temPrimo = true;
            }

            if (caracteresEspeciais.indexOf(c) != -1) {
                temEspecial = true;
            }

            if (i > 0) {
                char anterior = senha.charAt(i - 1);
                if (vogais.indexOf(c) != -1 && vogais.indexOf(anterior) != -1 && Character.toLowerCase(c) == Character.toLowerCase(anterior)) {
                    return false; // vogais duplicadas seguidas
                }
            }
        }

        return temMaiuscula && temPrimo && temEspecial;
    }
}