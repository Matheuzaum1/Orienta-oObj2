package Listas.Lista2.Ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraTeste {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Potência");
        System.out.println("6. Raiz Quadrada");
        System.out.println("8. Inversão");
        System.out.println("9. Sair");

        try {
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Insira o primeiro valor:");
                    double num1 = scanner.nextDouble();
                    System.out.println("Insira o segundo valor:");
                    double num2 = scanner.nextDouble();
                    double resultado = Calculadora.somar(num1, num2);
                    System.out.println("O resultado da adição e: " + resultado);
                }

                case 2 -> {
                    System.out.println("Insira o primeiro valor:");
                    double num1 = scanner.nextDouble();
                    System.out.println("Insira o segundo valor:");
                    double num2 = scanner.nextDouble();
                    double resultado = Calculadora.subtrair(num1, num2);
                    System.out.println("O resultado da subtração e: " + resultado);
                }
                case 3 -> {
                    System.out.println("Insira o primeiro valor:");
                    double num1 = scanner.nextDouble();
                    System.out.println("Insira o segundo valor:");
                    double num2 = scanner.nextDouble();
                    double resultado = Calculadora.multiplicar(num1, num2);
                    System.out.println("O resultado da multiplicação e: " + resultado);
                }

                case 4 -> {
                    System.out.println("Insira o primeiro valor:");
                    double num1 = scanner.nextDouble();
                    System.out.println("Insira o segundo valor:");
                    double num2 = scanner.nextDouble();
                    double resultado = Calculadora.dividir(num1, num2);
                    System.out.println("O resultado da divisão e: " + resultado);
                }
                case 5 -> {
                    System.out.println("Insira o primeiro valor:");
                    double num1 = scanner.nextDouble();
                    System.out.println("Insira o segundo valor:");
                    double num2 = scanner.nextDouble();
                    double resultado = Calculadora.potenciar(num1, num2);
                    System.out.println("O resultado da potência e: " + resultado);
                }
                case 6 -> {
                    System.out.println("Insira o primeiro valor:");
                    double num1 = scanner.nextDouble();
                    double resultado = Calculadora.raizQuadrada(num1);
                    System.out.println("O resultado da raiz quadrada e: " + resultado);
                }
                case 8 -> {
                    System.out.println("Insira o primeiro valor:");
                    double num1 = scanner.nextDouble();
                    double resultado = Calculadora.inverso(num1);
                    System.out.println("O resultado da inversão e: " + resultado);
                }
                case 9 ->
                    System.out.println("Programa encerrado");
                default ->
                    System.out.println("Opcão inválida");
            }
        } catch (InputMismatchException ime) {
            System.out.println("Entrada inválida");

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            scanner.close();

        }

    }

}
