import java.util.Scanner;

class myClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.print("請輸入第一個整數: ");
        num1 = sc.nextInt();

        System.out.print("請輸入第二個整數: ");
        num2 = sc.nextInt();

        System.out.println(num1 + " > " + num2 + " = " + (num1 > num2));

        sc.close();
    }
}