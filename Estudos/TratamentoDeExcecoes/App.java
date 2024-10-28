
public class App {
    //printsacktrace
    public static void main(String[] args) throws Exception{
        try {
            System.out.println("mensagem antes da exceção");
            int resultado = 10 / 0;
            System.out.println("O resultado é: " + resultado);
            System.out.println("Mensagem depois da exceção");   
        } catch (Exception e) {
            System.out.println((e.getMessage()));
        }finally{
            //sempre sera executado
            System.out.println("Fim do programa com sucesso");
        }
        System.out.println("Programa encerrado");
  }
}
