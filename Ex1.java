package LopalEx;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Mensagem inicial
        System.out.println("Digite quantas moedas você possui de cada valor.");

        // Entrada de dados: quantas moedas de cada valor o usuário tem
        System.out.print("Moedas de R$0,01: ");
        double m1 = sc.nextDouble();

        System.out.print("Moedas de R$0,05: ");
        double m5 = sc.nextDouble();

        System.out.print("Moedas de R$0,10: ");
        double m10 = sc.nextDouble();

        System.out.print("Moedas de R$0,25: ");
        double m25 = sc.nextDouble();

        System.out.print("Moedas de R$0,50: ");
        double m50 = sc.nextDouble();

        System.out.print("Moedas de R$1,00: ");
        double m100 = sc.nextDouble();

        // Conversão da quantidade de moedas para valor em reais
        double cent1 = m1 * 0.01;
        double cent5 = m5 * 0.05;
        double cent10 = m10 * 0.10;
        double cent25 = m25 * 0.25;
        double cent50 = m50 * 0.50;
        double cent100 = m100 * 1.00;

        // Soma de todos os valores
        double total = cent1 + cent5 + cent10 + cent25 + cent50 + cent100;

        // Mostra o total em reais
        System.out.println("Você possui R$" + String.format("%.2f", total));

        // Mostra quanto falta para atingir R$100,00
        System.out.println("Falta R$" + String.format("%.2f", (100 - total)) + " para você chegar a R$100,00.");

        // Simulação de economia diária (dividindo o total por 7 dias)
        double day = total / 7;
        int count = 0;
        double acumulado = 0;

        // Conta quantos dias seriam necessários para acumular R$100
        while (acumulado < 100) {
            count++;
            acumulado += day;
        }

        // Converte dias para semanas, arredondando para cima
        int semanas = count / 7;
        if (count % 7 != 0) {
            semanas++;
        }

        // Exibe o resultado final
        System.out.println("Você precisará de " + semanas + " semanas para juntar R$100,00 economizando esse valor por semana.");

        // Fecha o scanner
        sc.close();
    }
}
