package Aula01.Ex3;

public class EmpresaTeste {

    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("Empresa A", "12345678901234", UnidadeFederativa.PARANA);
        Empresa empresa2 = new Empresa("Empresa B", "98765432109876", UnidadeFederativa.RIO_DE_JANEIRO);

        empresa1.ImprimirDados();
        empresa2.ImprimirDados();
    }
   

}
