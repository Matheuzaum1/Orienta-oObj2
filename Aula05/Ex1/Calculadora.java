package Aula05.Ex1;

public class Calculadora {
    public double adicao(double num1, double num2) {
        return num1 + num2;
    }

    public double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public double divisao(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return num1 / num2;
    }

    public double potenciacao(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public double raizQuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Raiz quadrada de número negativo");
        }
        return Math.sqrt(numero);
    }

    public double inverso(double numero) {
        if (numero == 0) {
            throw new ArithmeticException("Inverso de zero");
        }
        return 1 / numero;
    }
}
