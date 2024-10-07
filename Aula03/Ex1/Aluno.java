package Aula03.Ex1;

public class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, String idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void realizarMatricula(String curso){
        if(curso.equals(this.curso)){
            System.out.println("Matricula realizada com sucesso");
        }else{
            System.out.println("Matricula não realizada");
        }
    }

    public void ImprimirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Curso: " + getCurso());
    }

}
