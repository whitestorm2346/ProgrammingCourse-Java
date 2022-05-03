class CGo {
    private static int ct = 0;
    private String str;
    private int width;
    private int height;

    public CGo() { // part b
        this("Red", 2, 2);
    }

    public CGo(String str, int width, int height) { // part a
        this.str = str;
        this.width = width;
        this.height = height;
    }

    public static void count() {
        System.out.println("ct: " + ct);
    }

    public void setZero() { // part c
        ct = 0;
    }

    public void setValue(int n) { // part d
        ct = n;
    }
}

public class myClass {
    public static void main(String[] args) {

    }
}

/*
 * 
 * part e:
 * ct應該宣告為類別變數，因為每次產生物件都要加到同一個變數
 * 
 * part f:
 * 都可以，只是呼叫方式有些差異
 * 
 */