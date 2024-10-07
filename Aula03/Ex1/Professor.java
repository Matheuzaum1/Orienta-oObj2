package Aula03.Ex1;

public class Professor extends Pessoa {
    private Double SalarioBase;
    private Double SalarioTitulacao;

    public Professor(String nome, String idade, Double salarioBase, Double salarioTitulacao) {
        super(nome, idade);
        SalarioBase = salarioBase;
        SalarioTitulacao = salarioTitulacao;
    }
    public Double getSalarioBase() {
        return SalarioBase;
    }
    public void setSalarioBase(Double salarioBase) {
        SalarioBase = salarioBase;
    }
    public Double getSalarioTitulacao() {
        return SalarioTitulacao;
    }
    public void setSalarioTitulacao(Double salarioTitulacao) {
        SalarioTitulacao = salarioTitulacao;
    }


    public Double calcularSalario() {
        return SalarioBase + SalarioTitulacao;
    }

    public void ImprimirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salario Base: " + getSalarioBase());
        System.out.println("Salario Titulacao: " + getSalarioTitulacao());
        System.out.println("Salario: " + calcularSalario());
    }



}
