// class: 資工一A name: 游昃勛 ID: 410411218
public class myClass {
    public static void main(String[] args) {
        System.out.println("abs(-6) = " + abs(-6));
        System.out.println("abs(-3.5f) = " + abs(-3.5f));
        System.out.println("abs(-2.12345) = " + abs(-2.12345));
    }

    public static int abs(int num) {
        return (num < 0) ? (-num) : num;
    }

    public static float abs(float num) {
        return (num < 0) ? (-num) : num;
    }

    public static double abs(double num) {
        return (num < 0) ? (-num) : num;
    }
}
