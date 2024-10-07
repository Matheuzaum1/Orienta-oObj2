package Aula03.Ex1;

public class Pessoa {
    protected String nome;
    protected String idade;
    

    public Pessoa(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void ImprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());

    }

}
