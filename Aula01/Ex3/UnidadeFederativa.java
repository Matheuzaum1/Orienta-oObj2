package Aula01.Ex3;

enum UnidadeFederativa {
    // Região Sul
    PARANA("Paraná", "PR", "Curitiba"),
    SANTA_CATARINA("Santa Catarina", "SC", "Florianópolis"),
    RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS", "Porto Alegre"),
    // Região Sudeste
    SAO_PAULO("São Paulo", "SP", "São Paulo"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ", "Rio de Janeiro"),
    MINAS_GERAIS("Minas Gerais", "MG", "Belo Horizonte"); 


    private final String nome;
    private final String sigla;
    private final String capital;

    UnidadeFederativa(String nome, String sigla, String capital) {
        this.nome = nome;
        this.sigla = sigla;
        this.capital = capital; 

    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getCapital() {
        return capital;
    }
}
