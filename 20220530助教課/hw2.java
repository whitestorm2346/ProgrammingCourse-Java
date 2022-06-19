class CTest implements Runnable {
    String id;

    // 1
    public CTest(String str) {
        id = str;
    }

    // 1.a
    public void run() {
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 100000000; j++) {
                System.out.println(id + " " + i);
            }
        }
    }
}

class Add implements Runnable {
    private int n;
    private int sum = 0;

    public Add(int a) {
        n = a;
    }

    public void run() {
        sum = 0;

        while (n > 0) {
            sum += n;

            System.out.println("sum += " + n + " = " + sum);

            n++;
        }

        System.out.println("Result = " + sum);
    }
}

public class myClass {
    public static void main(String args[]) {
        // 5
        Add a1 = new Add(5);
        Add a2 = new Add(10);
        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(a2);
        t1.start();
        t2.start();

        // 6 & 7
        CTest morning = new CTest("Good morning");
        CTest night = new CTest("Good night");
        Thread t3 = new Thread(morning);
        Thread t4 = new Thread(night);
        t3.start();
        t4.start();
    }
}
