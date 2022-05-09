class CTriangle {
    protected int base;
    protected int height;

    protected void show() {
        System.out.println("base = " + base + ", height = " + height);
    }
}

// 4.a
class CData extends CTriangle {
    public CData(int base, int height) {
        this.base = base;
        this.height = height;
    }

    // 4.b
    public void area() {
        show();
        System.out.println("area = " + ((base * height) / 2.0));
    }
}

public class myClass {
    public static void main(String args[]) {
        // 4.c
        CData obj = new CData(3, 8);
        obj.area();
    }
}

// 4.d protected可以防止類別外部存取，同時子類別仍能自由存取
// 4.e 可以，因為宣告為protected時，子類別也能自由存取