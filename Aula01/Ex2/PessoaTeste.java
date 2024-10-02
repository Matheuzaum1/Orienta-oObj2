package Aula01.Ex2;

public class PessoaTeste {
    public static void main(String[] args) {

        Endereco e1 = new Endereco("rua dos bobos", 0, "centro", "sao paulo", "sp");

        Pessoa p1 = new Pessoa("joao", "01/01/2000", "masculino", "j@j.com", e1);

        p1.imprimirDados();

        p1.MudarParaCasado();
        p1.MudarParaSolteiro();
        p1.MudarParaDivorciado();
        p1.MudarParaViuvo();

        p1.imprimirDados();

    }
}
