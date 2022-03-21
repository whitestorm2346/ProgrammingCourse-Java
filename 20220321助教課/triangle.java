public class myClass {
    public static void main(String[] args) {
        int int_Base = 6, int_Height = 3;
        float flt_Base = 4.2f, flt_Height = 3.3f;

        System.out.println("base: " + int_Base);
        System.out.println("height: " + int_Height);
        System.out.println("area: " + triangle(int_Base, int_Height));

        System.out.println("");

        System.out.println("base: " + flt_Base);
        System.out.println("height: " + flt_Height);
        System.out.printf("area: %.3f", triangle(flt_Base, flt_Height));
    }

    public static float triangle(int base, int height) {
        return (base * height) / 2.f;
    }

    public static float triangle(float base, float height) {
        return (base * height) / 2.f;
    }
}
