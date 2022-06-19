class CTest extends Thread {
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

public class myClass {
    public static void main(String args[]) {
        // 1.b
        CTest hi = new CTest("Hello");
        CTest bye = new CTest("Good Bye");

        // 2
        CTest morning = new CTest("Good morning");

        morning.start();

        // 3
        CTest night = new CTest("Good night");

        night.start();

        Thread t1 = new Thread(hi);
        Thread t2 = new Thread(bye);

        /*
         * hi.run(); // 1.c 因為只有單一執行緒 要執行完一個method才會換下一個
         * bye.run();
         */

        t1.start();
        t2.start();
    }
}
