package Aula01.Ex2;

public class Pessoa {
    public void imprimirDados() {
        System.out.println("=======================================");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Sexo: " + sexo);
        System.out.println("Email: " + email);
        System.out.println("Estado Civil: " + getEstadoCivil());
        System.out.println("Logradouro : " + endereco.getLogradouro());
        System.out.println("Numero : " + endereco.getNumero());
        System.out.println("Bairro : " + endereco.getBairro() + " Cidade: " + endereco.getCidade() + " Estado:  " + endereco.getEstado());
        System.out.println("=======================================");
    }

    public void MudarParaCasado() {
        setEstadoCivil(EstadoCivil.CASADO);
        System.out.println("======Atualizando estado civil======");
        System.out.println("Mudou para casado");
        System.out.println("Nome: " + nome);
        System.out.println("Estado Civil: " + getEstadoCivil());
        System.out.println("=======================================");
    }

    public void MudarParaSolteiro() {
        System.out.println("======Atualizando estado civil======");
        setEstadoCivil(EstadoCivil.SOLTEIRO);
        System.out.println("Mudou para solteiro");
        System.out.println("Nome: " + nome);
        System.out.println("Estado Civil: " + getEstadoCivil());
        System.out.println("=======================================");
    }

    public void MudarParaDivorciado() {
        System.out.println("======Atualizando estado civil======");
        setEstadoCivil(EstadoCivil.DIVORCIADO);
        System.out.println("Mudou para divorciado");
        System.out.println("Nome: " + nome);
        System.out.println("Estado Civil: " + getEstadoCivil());
        System.out.println("=======================================");
    }

    public void MudarParaViuvo() {
        System.out.println("======Atualizando estado civil======");
        setEstadoCivil(EstadoCivil.VIUVO);
        System.out.println("Mudou para viuvo");
        System.out.println("Nome: " + nome);
        System.out.println("Estado Civil: " + getEstadoCivil());
        System.out.println("=======================================");
    }



    
    
    
    
    public Pessoa(String nome, String dataNascimento, String sexo, String email, Endereco endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.email = email;
        this.endereco = endereco;
        this.estadoCivil = EstadoCivil.SOLTEIRO;
    }
    private String nome;
    private String dataNascimento;
    private String sexo;
    private String email;
    private EstadoCivil estadoCivil;
    private Endereco endereco;
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
    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
