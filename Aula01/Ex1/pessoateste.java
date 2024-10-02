public class pessoateste {
    public static void main(String[] args) {
        endereco e1 = new endereco("rua dos bobos", 0, "centro", "sao paulo", "sp");

        pessoa p1 = new pessoa("joao", "01/01/2000", "masculino", "j@j.com", "solteiro",e1);

        p1.imprimirDados();
    }
}
