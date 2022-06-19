import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

class ArgumentOutOfBound extends Exception {
    private int n;

    public ArgumentOutOfBound(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return (n + "小於0");
    }
}

public class myClass {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        try {
            mySqrt(n);
        } catch (ArgumentOutOfBound e) {
            System.out.println(e);
        }
    }

    static void mySqrt(int n) throws ArgumentOutOfBound {
        if (n < 0)
            throw new ArgumentOutOfBound(n);
        else
            System.out.println("sqrt(" + n + ") = " + Math.sqrt(n));
    }
}
