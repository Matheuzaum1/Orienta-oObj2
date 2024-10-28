package Listas.Lista2.Ex2;

public class IntConverter {

    public static int LongPraInt(long num) {
        return (int) num;
    }

    public static int FloatPraInt(float num) {
        return (int) num;
    }

    public static int DoublePraInt(double num) {
        return (int) num;
    }

    public static int StringPraInt(String num) throws NumberFormatException {
        return Integer.parseInt(num);
    }
}
