import java.lang.Thread;

class CTest implements Runnable {
    String id;
    double timeGap;

    public CTest(String str, double timeGap) {
        id = str;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(id + " is running");

            try {
                Thread.sleep((long) (timeGap * 1000));
            } catch (InterruptedException e) {
                System.out.println("catched the exception");
            }
        }
    }
}

public class myClass {
    public static void main(String args[]) {
        CTest sec_1 = new CTest("Thread 1", 1);
        CTest sec_2_5 = new CTest("Thread 2", 2.5);
        Thread t1 = new Thread(sec_1);
        Thread t2 = new Thread(sec_2_5);

        t1.start();
        t2.start();
    }
}
