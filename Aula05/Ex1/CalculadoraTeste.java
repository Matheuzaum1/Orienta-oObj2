package Aula05.Ex1;

import java.util.Scanner;

public class CalculadoraTeste {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            Calculadora calculadora = new Calculadora();

            try {
                System.out.println("Adição: " + calculadora.adicao(num1, num2));
                System.out.println("Subtração: " + calculadora.subtracao(num1, num2));
                System.out.println("Multiplicação: " + calculadora.multiplicacao(num1, num2));
                System.out.println("Divisão: " + calculadora.divisao(num1, num2));
                System.out.println("Potênciação: " + calculadora.potenciacao(num1, num2));
                System.out.println("Raiz quadrada de " + num1 + ": " + calculadora.raizQuadrada(num1));
                System.out.println("Inverso de " + num1 + ": " + calculadora.inverso(num1));
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}