package Listas.Lista2.Ex1;

public class Calculadora {

    public static double somar(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException(" Não é possivél realizar divisão por zero");
        }
        return num1 / num2;
    }

    public static double potenciar(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public static double raizQuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Raiz quadrada de número negativo");
        }
        return Math.sqrt(numero);
    }

    public static double inverso(double numero) {
        if (numero == 0) {
            throw new IllegalArgumentException("Inversão de número zero");
        }
        return 1 / numero;
    }

}
