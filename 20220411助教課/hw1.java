class CRectangle {
    int width;
    int height;

    public CRectangle(int width, int height) // part a
    {
        this.width = width;
        this.height = height;
    }

    public CRectangle() // part b
    {
        width = 10;
        height = 8;
    }

    /*
     * part c
     * 
     * public CRectangle()
     * {
     *     this(10, 8);
     * }
     * 
     */
}

public class myClass {
    public static void main(String[] args) {
        CRectangle rect = new CRectangle();

        System.out.printf("width: %d\n", rect.width);
        System.out.printf("height: %d\n", rect.height);
    }
}
