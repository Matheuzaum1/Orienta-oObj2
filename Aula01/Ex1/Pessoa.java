public class Pessoa {
    protected String nome;
    protected String dataNascimento;
    protected String sexo;
    protected String email;
    protected String estadoCivil;
    protected Endereco endereco;

    public void imprimirdados() {
        System.out.println("=============");
        System.out.println("Nome: " + nome);
        System.out.println("Data Nascimento: " + dataNascimento);
        System.out.println("Sexo: " + sexo);
        System.out.println("Email: " + email);
        System.out.println("Estado Civil: " + estadoCivil);
        System.out.println("========== Endereço ======");
        System.out.println("Logradouro: " + this.getEndereco().getLogradouro());
        System.out.println("Numero: " + this.getEndereco().getNum());
        System.out.println("Bairro: " + this.getEndereco().getBairro());
        System.out.println("Cidade: " + this.getEndereco().getCidade());
        System.out.println("Estado: " + this.getEndereco().getEstado());

    }

    public Pessoa(String nome, String dataNascimento, String sexo, String email, String estadoCivil,
            Endereco endereco) {
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
