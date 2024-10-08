package Aula03.Ex1;

public class Professor extends Pessoa {
    private Double salarioBase;
    private Double salarioTitulacao;

    public Professor(String nome, int idade, Endereco end, Double salarioBase, Double salarioTitulacao) {
        super(nome, idade, end);
        this.salarioBase = salarioBase;
        this.salarioTitulacao = salarioTitulacao;
    }
    public Double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public Double getSalarioTitulacao() {
        return salarioTitulacao;
    }
    public void setSalarioTitulacao(Double salarioTitulacao) {
        this.salarioTitulacao = salarioTitulacao;
    }

    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Salário base: " + this.salarioBase);
        System.out.println("Salário titulação: " + this.salarioTitulacao);
    }

}
