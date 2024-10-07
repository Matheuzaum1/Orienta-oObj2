package Aula02.Ex1;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso!");
    }

    public void removerContato(String nome) {
        Contato contatoRemover = null;
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                contatoRemover = c;
                break;
            }
        }
        if (contatoRemover != null) {
            contatos.remove(contatoRemover);
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void exibirContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato armazenado.");
        } else {
            for (Contato c : contatos) {
                System.out.println(c);
            }
        }
    }

    public void pesquisarContato(String termo) {
        boolean encontrado = false;
        for (Contato c : contatos) {
            if (c.getNome().toLowerCase().contains(termo.toLowerCase())) {
                System.out.println(c);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum contato encontrado com o termo: " + termo);
        }
    }
}

