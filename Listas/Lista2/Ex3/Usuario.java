package Listas.Lista2.Ex3;

public class Usuario {

    private final String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public void RealizarLogin(String nome, String senha) throws UsuarioIncorretoException, SenhaIncorretaException {
        if (!this.nome.equals(nome)) {
            throw new UsuarioIncorretoException("Nome de Usuário Incorreto");
        }
        if (!this.senha.equals(senha)) {
            throw new SenhaIncorretaException("Senha Incorreta");
        }
        System.out.println("Login efetuado com sucesso");
    }

    public void alterarSenha(String nome, String senhaAtual, String senhaNova) throws SenhaIncorretaException, UsuarioIncorretoException {
        if (!this.nome.equals(nome)) {
            throw new UsuarioIncorretoException("Nome de Usuário Incorreto");
        }
        if (!this.senha.equals(senhaAtual)) {
            throw new SenhaIncorretaException("Senha Incorreta");
        }
        for (char caractere : senhaNova.toCharArray()) {
            if (!Character.isLetterOrDigit(caractere)) {
                throw new SenhaIncorretaException("A nova senha deve conter apenas letras maiúsculas e não pode conter números.");
            } 

        }
        this.senha = senhaNova;
        System.out.println("Senha alterada com sucesso");
    }
}
