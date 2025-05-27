package LopalEx;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        String[] feitiços = {"Aceleratio", "Defensio", "Expelliarmus", "Lumos", "Wingardium Leviosa"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o feitiço a ser encontrado: ");
        String alvo = scanner.nextLine();

        int posicao = buscaBinaria(feitiços, alvo);

        if (posicao >= 0) {
            System.out.println("Feitiço encontrado na posição " + posicao);
        } else {
            System.out.println("Feitiço não encontrado.");
        }

        scanner.close();
    }

    public static int buscaBinaria(String[] lista, String alvo) {
        int inicio = 0;
        int fim = lista.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int comparacao = alvo.compareToIgnoreCase(lista[meio]);

            if (comparacao == 0) {
                return meio;
            } else if (comparacao < 0) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        return -1; // não encontrado
    }
}
