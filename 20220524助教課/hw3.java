import java.util.Scanner;

class Exception520 extends Exception {

}

public class myClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input;

        try {
            input = sc.nextLine();

            if (input.compareTo("520") == 0)
                throw new Exception520();
            else
                System.out.println(input);
        } catch (Exception520 e) {
            System.out.println("這是由字串520所引發的例外");
        }
    }
}
