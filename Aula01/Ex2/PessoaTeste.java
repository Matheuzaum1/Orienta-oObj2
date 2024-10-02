public class PessoaTeste {
    public static void main(String[] args) {

        Endereco e = new Endereco("Rua rio do peixe", "Casa do caralho", "Pindorama", "SP", 13);
        Pessoa p = new Pessoa("João","11/09/2001","Maculino","joaojoaojoao@gmail.com",e);
        p.imprimirdados();
        p.MudarParaCasado();
        p.MudarParaDivorciado();
        p.MudarParaViuvo();
    }  

}
