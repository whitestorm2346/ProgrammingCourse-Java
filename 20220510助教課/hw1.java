class Caaa {
    private int num;

    public Caaa(int n) {
        num = n;
    }

    public int get() {
        return num;
    }

    // 1.a
    public void display() {
        System.out.println("printed from Caaa Class");
    }
}

class Cbbb extends Caaa {
    public Cbbb() {
        super(2);
    }

    public void show() {
        System.out.println("num=" + get());
    }

    // 1.b
    public void display() {
        System.out.println("printed from Cbbb Class");
    }
}

public class myClass {
    public static void main(String args[]) {
        Cbbb bb = new Cbbb();
        bb.show();

        // 1.c
        // 如果建立 Caaa bb = new Cbbb();，利用 bb 呼叫 display()，
        // 則是子類別的 display() 被呼叫。
    }
}
