// 2.
class CTest {
    public void test() throws ArithmeticException {
        int num = 12, den = 0;

        if (den == 0)
            throw new ArithmeticException();

        int ans = num / den;
    }
}

public class myClass {
    public static void main(String args[]) {
        CTest obj = new CTest();

        try {
            obj.test();
        } catch (ArithmeticException e) {
            System.out.println("catch an exception");
        } finally {
            System.out.println("end of main()");
        }
    }

    /*
     * 1.
     * public static void test() throws ArithmeticException{
     * int num = 12, den = 0;
     * 
     * if(den == 0) throw new ArithmeticException();
     * 
     * int ans = num / den;
     * }
     */
}