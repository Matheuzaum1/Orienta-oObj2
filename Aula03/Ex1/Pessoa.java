package Aula03.Ex1;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected Endereco end;

    public Pessoa(String nome, int idade, Endereco end) {
        this.nome = nome;
        this.idade = idade;
        this.end = end;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Endereco getEnd() {
        return end;
    }
    public void setEnd(Endereco end) {
        this.end = end;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: ");
        System.out.println("Logradouro: " + end.getLogradouro());
        System.out.println("Numero: " + end.getNumero());
        System.out.println("Bairro: " + end.getBairro());
        System.out.println("Cidade: " + end.getCidade());
        System.out.println("Estado: " + end.getEstado());
    }

}
