package Listas.Lista2.Ex2;

public class IntConverterTeste {

    public static void main(String[] args) {
        //IntConverter converter = new IntConverter();
        try {
            System.out.println("Long: " + IntConverter.LongPraInt(123456789L));
            System.out.println("Float: " + IntConverter.FloatPraInt(123456789F));
            System.out.println("Double: " + IntConverter.DoublePraInt(123456789D));
            System.out.println("String: " + IntConverter.StringPraInt("123456789"));

            //Testando exceções
            System.out.println("String: " + IntConverter.StringPraInt("aaaaaaaaaa"));

        } catch (NumberFormatException nfe) {
            System.out.println("Entrada inválida: " + nfe.getMessage());
        } finally {
            System.out.println("Fim do programa");
        }
    }
}
