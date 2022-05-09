
// 2. 如果改為private 則不能在子類別內透過方法呼叫，因為private 是只有自己能直接存取
class Caaa {
    public int num1;
    public int num2;

    // 3.a
    public Caaa() {
        num1 = num2 = 1;
    }

    // 3.b
    public Caaa(int a, int b) {
        num1 = a;
        num2 = b;
    }
}

// 1.
class Cbbb extends Caaa {
    public Cbbb() {
    }

    // 3.c
    public Cbbb(int a, int b) {
        super(a, b);
    }

    public void set_num(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void show() {
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}

public class myClass {
    public static void main(String args[]) {
        Cbbb bb = new Cbbb();
        bb.set_num(5, 10);
        bb.show();

        Cbbb non_arg = new Cbbb();
        non_arg.show();

        Cbbb with_args = new Cbbb(3, 4);
        with_args.show();
    }
}