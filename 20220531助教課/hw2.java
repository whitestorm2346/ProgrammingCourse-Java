class CTest extends Thread {
    String id;

    public CTest(String str) {
        id = str;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(id + " " + i);

            try {
                sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}

public class myClass {
    public static void main(String args[]) {
        CTest hi = new CTest("Hello");
        CTest bye = new CTest("Good bye");
        CTest morning = new CTest("Good morning");
        CTest night = new CTest("Good night");

        hi.setPriority(1);
        morning.setPriority(2);
        night.setPriority(3);
        bye.setPriority(4);

        hi.start();
        morning.start();
        night.start();
        bye.start();

        System.out.println("All threads are finished");
    }
}
