public class myClass {
    public static void main(String[] args) {
        int n = 50;

        System.out.println("fib(" + n + "): " + fib(n));
    }

    public static long fib(int n) {
        long num1 = 0, num2 = 1;

        for (int i = 0; i < n; i++) {
            long temp = num2;

            num2 += num1;
            num1 = temp;
        }

        return num2;
    }
}
