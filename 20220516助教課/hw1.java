abstract class CShape {
    protected String color;

    public CShape(String str) {
        color = str;
    }

    public void SetColor(String str) {
        color = str;
    }

    public abstract void show();
}

class CRectangle extends CShape {
    protected int width;
    protected int height;

    public CRectangle(int w, int h, String color) {
        super(color);

        width = w;
        height = h;
    }

    public void show() {
        System.out.println("color=" + color);
        System.out.println("area=" + (width * height));
    }
}

public class myClass {
    public static void main(String args[]) {
        CRectangle rect = new CRectangle(5, 10, "Yellow");

        rect.show();
    }
}
