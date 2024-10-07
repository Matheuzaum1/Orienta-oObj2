package Aula02.Ex1;

public class Contato {
    private String nome;
    private String sobrenome;
    private String telefone;
    private String endereco;
    private String aniversario;

    public Contato(String nome, String sobrenome, String telefone, String endereco, String aniversario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.aniversario = aniversario;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getAniversario() {
        return aniversario;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome + " | Telefone: " + telefone + " | Endereço: " + endereco + " | Aniversário: " + aniversario;
    }
}
