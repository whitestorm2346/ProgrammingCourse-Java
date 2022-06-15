public class myClass {
    public static void main(String args[]) {
        int num = 12, den = 0;

        /*
         * 2.
         * if(den != 0){
         * int ans = num / den;
         * }
         */

        // 3.
        try {
            int ans = num / den;
        } catch (ArithmeticException e) {
            System.out.println("catch an exception");
        } finally {
            System.out.println("end of main()");
        }
    }
}

// 1.a 不會有錯誤訊息
// 1.b 除以0這個運算未定義，因此丟出例外
// 1.c 不會執行，因為系統會執行預設的exception，會直接結束程式
