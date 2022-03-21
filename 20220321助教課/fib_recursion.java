public class myClass {
    public static void main(String[] args) {
        int n = 50;

        System.out.println("fib(" + n + "): " + fib(n));
    }

    public static long fib(int n) {
        if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        else
            return fib(n - 1) + fib(n - 2);
    }
}
