public class myClass {
    public static void main(String[] args) {
        System.out.println("max(8, 2) = " + max(8, 2));
        System.out.println("max(1, 9, 2) = " + max(1, 9, 2));
    }

    public static int max(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    public static int max(int num1, int num2, int num3) {
        int max1 = (num1 > num2) ? num1 : num2;

        return (max1 > num3) ? max1 : num3;
    }
}
