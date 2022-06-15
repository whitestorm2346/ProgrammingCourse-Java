public class myClass {
    public static void main(String args[]) {
        int num = 12;
        int den[] = { 12, 0, 3, 0, 0, 4 };

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("ans =" + num / den[i]);
            }
            // a 
            catch (ArithmeticException e) {
                System.out.println("程式執行有問題");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("程式執行有問題");
            }
            // b 
            catch (Exception e) {
                System.out.println("捕捉到例外了");
            } finally {
                return;
            }
        }
    }

}

    