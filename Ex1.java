package LopalEx;

import java.util.Scanner;

		public class Ex1 {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
			System.out.println("Digite quantas moedas você possui de cada valor.");
				
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
			
			double cent1 = m1 * 0.01;
			double cent5 = m5 * 0.05;
			double cent10 = m10 * 0.10;
			double cent25 = m25 * 0.25;
			double cent50 = m50 * 0.50;
			double cent100 = m100 * 1.00;
			
			double total = cent1 + cent5 + cent10 + cent25 + cent50 + cent100;
			
			System.out.println("Você possui R$" + total);
			
			System.out.println("Falta R$" + (100 - total) + " para você chegar a R$100,00.");
			
			double day = total/7;
			int count = 0;
			double acumulado = 0;

			while (acumulado < 100) {
				count++;
				acumulado+=day;

			}
			
			int semanas = count / 7;
			if (count % 7 != 0) {
				semanas++;
			}
			
			System.out.println("Você precisará de " + semanas + " semanas");

			sc.close();

			
			}
			
			
			}