interface Math {
    public void show();

    public void add(int a, int b);

    public void sub(int a, int b);

    public void mul(int a, int b);

    public void div(int a, int b);
}

// 4.
interface AdvancedMath {
    public void mod(int a, int b);

    public void fac(int a);

    public void pow(int a, int b);
}

class Compute implements Math, AdvancedMath {
    // 1.
    private int ans;

    public void show() {
        System.out.println("ans=" + ans);
    }

    public void add(int a, int b) {
        ans = a + b;
    }

    public void sub(int a, int b) {
        ans = a - b;
    }

    public void mul(int a, int b) {
        ans = a * b;
    }

    public void div(int a, int b) {
        ans = a / b;
    }

    // 4.
    public void mod(int a, int b) {
        ans = a % b;
    }

    public void fac(int a) {
        ans = 1;

        for (int i = 2; i <= a; i++) {
            ans *= i;
        }
    }

    public void pow(int a, int b) {
        ans = 1;

        for (int i = 0; i < b; i++) {
            ans *= a;
        }
    }
}

// 5. 可以正常運作，系統會判定為定義在類別的方法

public class myClass {
    public static void main(String arg[]) {
        Compute cmp = new Compute();

        cmp.add(30, 5);
        cmp.show();

        cmp.sub(30, 5);
        cmp.show();

        cmp.mul(30, 5);
        cmp.show();

        cmp.div(30, 5);
        cmp.show();

        cmp.mod(30, 5);
        cmp.show();

        cmp.fac(5);
        cmp.show();

        cmp.pow(30, 5);
        cmp.show();
    }
}
