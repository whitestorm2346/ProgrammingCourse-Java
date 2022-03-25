// class: 資工一A name: 游昃勛 ID: 410411218
public class myClass {
    public static void main(String[] args) {
        System.out.println("rpower(5.0, 4) = " + rpower(5.0, 4));
    }

    public static double rpower(double b, int n) {
        if (n == 0)
            return 1.0;
        else
            return b * rpower(b, n - 1);
    }
}
