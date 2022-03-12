import java.util.Scanner;

class myClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        String motto;

        System.out.print("請輸入您的姓名: ");
        name = sc.next();

        System.out.print("請輸入您的年齡: ");
        age = sc.nextInt();

        System.out.println(name + "您好!您的年齡為" + age + "歲!");

        System.out.print("請輸入您的座右銘: ");
        motto = sc.next();

        System.out.println("您的座右銘是: " + motto);

        sc.close();
    }
}