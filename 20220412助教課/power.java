class Solution {
    public static int power(int x, int n) {
        int result = 1;

        for (int i = 0; i < n; i++) {
            result *= x;
        }

        return result;
    }
}

public class myClass {
    public static void main(String[] args) {
        System.out.println("power(5, 7): " + Solution.power(5, 7));
    }
}