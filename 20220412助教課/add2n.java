class Solution {
    public static int add2n(int n) {
        return (1 + n) * n / 2;
    }
}

public class myClass {
    public static void main(String[] args) {
        System.out.println("1~10: " + Solution.add2n(10));
        System.out.println("1~20: " + Solution.add2n(20));
    }
}