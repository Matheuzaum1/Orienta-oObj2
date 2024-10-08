package Aula03.Ex1;

public class PessoaTeste {
    public static void main(String[] args) {
        Endereco e1 = new Endereco("Rua rio do peixe",12,"Centro","Rio de Janeiro","RJ");
        Endereco e2 = new Endereco("Rua dos bobos", 0, "centro", "sao paulo", "sp");
        Professor p1 = new Professor("João da Silva",30,e1,2000.50,2500.10);
        Aluno a1 = new Aluno("Marcelo tavares",20,e2,"Engenharia");
        p1.imprimirDados();
        a1.imprimirDados();
        a1.realizarMatricula("Engenharia");
        a1.realizarMatricula("Medicina");

    }
}   
