public class pessoa {
    private String nome;
    private String dataNascimento;
    private String sexo;
    private String email;
    private String estadoCivil;
    @SuppressWarnings("FieldMayBeFinal")
    private endereco endereco;

  
    public pessoa(String nome, String dataNascimento, String sexo, String email, String estadoCivil,
            endereco endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.email = email;
        this.estadoCivil = estadoCivil;
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }



    public void imprimirDados() {
        System.out.println("=======================================");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Sexo: " + sexo);
        System.out.println("Email: " + email);
        System.out.println("Estado Civil: " + estadoCivil);
        System.out.println("Logradouro : " + endereco.getLogradouro());
        System.out.println("Numero : " + endereco.getNumero());
        System.out.println("Bairro : " + endereco.getBairro() + " Cidade: " + endereco.getCidade() + " Estado:  " + endereco.getEstado());
        System.out.println("=======================================");
    }

}
