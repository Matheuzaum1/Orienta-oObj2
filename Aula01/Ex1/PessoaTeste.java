//Arrumar o arquivo que tá compilando errado


public class PessoaTeste {
    public static void main(String[] args) {

        Endereco e = new Endereco("Rua rio do peixe","Casa do caralho","Pindorama","SP",13);
        Pessoa p = new Pessoa("Marcelo","11/11/2001","Masculino","Marcelocaju@yahoo.com",e);

        p.imprimirdados();
    }
}
