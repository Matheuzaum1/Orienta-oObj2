package Listas.Lista2.Ex3;

public class UsuarioTeste {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Joao", "1234567890");

        try {
            usuario1.RealizarLogin("Joao", "1234567890");
        } catch (UsuarioIncorretoException | SenhaIncorretaException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Fim do programa");
        }

        try {
            usuario1.RealizarLogin("joao", "1234567890");
        } catch (UsuarioIncorretoException | SenhaIncorretaException e) {
            System.out.println(e.getMessage());
        }

        try {
            usuario1.RealizarLogin("Joao", "123456789");
        } catch (UsuarioIncorretoException | SenhaIncorretaException e) {
            System.out.println(e.getMessage());
        }

        try {
            usuario1.alterarSenha("joao", "123456789", "1234567890");
        } catch (UsuarioIncorretoException | SenhaIncorretaException e) {
            System.out.println(e.getMessage());
        }

        try {
            usuario1.alterarSenha("Joao", "123456789", "1234567890");
        } catch (UsuarioIncorretoException | SenhaIncorretaException e) {
            System.out.println(e.getMessage());
        }

        try {
            usuario1.alterarSenha("Joao", "1234567890", "123456789");
        } catch (UsuarioIncorretoException | SenhaIncorretaException e) {
            System.out.println(e.getMessage());
        }

    }

}
