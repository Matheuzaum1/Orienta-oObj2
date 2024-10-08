package Aula03.Ex1;

public class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, int idade, Endereco end, String curso) {
        super(nome, idade, end);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Curso: " + this.curso);
    }

    public void realizarMatricula(String curso){
        if(this.curso.equals(curso)){
            System.out.println("Matriculado no curso: " + this.curso);
        }else{
            System.out.println("Não matriculado no curso: " + this.curso);
        }
    }

}
