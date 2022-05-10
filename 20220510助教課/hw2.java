class CRectangle {
    protected int length;
    protected int width;

    // 2.a
    public CRectangle(int l, int w) {
        length = l;
        width = w;
    }

    // 2.b
    public int area() {
        return length * width;
    }

    // 2.d
    @Override
    public String toString() {
        return ("length=" + length + ", width=" + width + ", area=" + area());
    }
}

public class myClass {
    public static void main(String args[]) {
        // 2.c
        CRectangle rect = new CRectangle(2, 6);

        System.out.println(rect);
    }
}
