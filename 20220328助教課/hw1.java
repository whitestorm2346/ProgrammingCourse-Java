class Caaa {
    public int a;
    public int b;
    public int c;
}

public class myClass {
    public static void main(String[] args) {
        Caaa obj = new Caaa();

        obj.a = 5;
        obj.b = 4;
        obj.c = obj.a * obj.b;

        System.out.println("a: " + obj.a);
        System.out.println("b: " + obj.b);
        System.out.println("c: " + obj.c);
    }
}
