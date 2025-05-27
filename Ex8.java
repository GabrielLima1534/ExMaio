package LopalEx;

import java.util.Scanner;
import java.util.Random;


public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random(); 
		
		System.out.println("Faça uma operação básica de matematica com dois números."
				+ "Operadores: (+, -, *, /) ");
		
		double num1 = sc.nextDouble();
		String operador = sc.next();
		double num2 = sc.nextDouble();
		
		double operacao = 0;
		
		if (operador.equals("+")) {
			operacao = num1 + num2;
		}
		else if(operador.equals("-")) {
			operacao = num1 - num2;
		}
		else if(operador.equals("*")) {
			operacao = num1 * num2;
		}
		else if(operador.equals("/")) {
			if (num2 != 0) {
				operacao = num1 / num2;
			} else {
				System.out.println("Erro: divisão por zero.");
				return;
			}
		} else {
			System.out.println("Operador inválido.");
			return;
		}
		

		double erroPercentual = (rand.nextDouble() * 0.02) - 0.01; // de -1% a +1%
		double resultadoComErro = operacao + (operacao * erroPercentual);

		System.out.printf("Resultado: %.4f\n", resultadoComErro);


	}

}
