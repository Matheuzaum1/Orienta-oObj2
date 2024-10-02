package Aula01.Ex3;

public class Empresa {
    private String razãoSocial;
    private String CNPJ;
    private UnidadeFederativa unidadeFederativa;

   
    public Empresa(String razãoSocial, String CNPJ, UnidadeFederativa unidadeFederativa) {
        this.razãoSocial = razãoSocial;
        this.CNPJ = CNPJ;
        this.unidadeFederativa = unidadeFederativa;
    }
    public String getRazãoSocial() {
        return razãoSocial;
    }
    public void setRazãoSocial(String razãoSocial) {
        this.razãoSocial = razãoSocial;
    }
    public String getCNPJ() {
        return CNPJ;
    }
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    public UnidadeFederativa getUnidadeFederativa() {
        return unidadeFederativa;
    }
    public void setUnidadeFederativa(UnidadeFederativa unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }

    public void ImprimirDados() {
        System.out.println("Razão Social: " + razãoSocial);
        System.out.println("CNPJ: " + CNPJ);
        System.out.println("Unidade Federativa: " + unidadeFederativa.getNome());
    }

}
