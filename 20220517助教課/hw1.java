interface Math {
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

// 2-1. 若使用interface可以用來產生更多衍生類別
// 2-2. 語法上沒問題，但我覺得只寫在Compute類別裡會更好，因為show這個動作不包含在Math的範疇內

// 3. 可以加上abstract，因為定義在介面裡的都一定是抽象函式，只是可以省略abstract這個修飾詞而已

public class test {
    public static void main(String arg[]) {
        Compute cmp = new Compute();

        cmp.mul(3, 5);
        cmp.show();
    }
}
