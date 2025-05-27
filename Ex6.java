package LopalEx;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os códigos (ex: 4H 7A 2C): ");
        String linha = scanner.nextLine();
        String[] codigos = linha.trim().split("\\s+");

        StringBuilder resultado = new StringBuilder();

        for (String codigo : codigos) {
            // Validação mínima (ignora código inválido)
            if (codigo.length() < 2) continue;

            try {
                int quantidade = Integer.parseInt(codigo.substring(0, codigo.length() - 1));
                char letra = codigo.charAt(codigo.length() - 1);

                for (int i = 0; i < quantidade; i++) {
                    resultado.append(letra);
                }
            } catch (NumberFormatException e) {
                System.out.println("Código inválido ignorado: " + codigo);
            }
        }

        System.out.println("Código reconstruído: " + resultado.toString());
        scanner.close();
    }
}
