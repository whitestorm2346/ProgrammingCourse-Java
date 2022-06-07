// 6.
interface Show_ans {
    public void show();
}

interface Math extends Show_ans {
    public void show();

    public void add(int a, int b);

    public void sub(int a, int b);

    public void mul(int a, int b);

    public void div(int a, int b);
}

class Compute implements Math {
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
}

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
    }
}
