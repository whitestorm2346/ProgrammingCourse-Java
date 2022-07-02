import java.lang.Math;

class PrePaid extends Thread {
    private static int sum = 200;

    public PrePaid() {
    }

    public void run() {
        while (sum > 10)
            talk((int) (Math.random() * 100));
    }

    public synchronized void talk(int fee) {
        sum -= fee;
        System.out.println("sum = " + sum);

        try {
            sleep(1000);
        } catch (InterruptedException e) {

        }
    }
}

public class myClass {
    public static void main(String args[]) {
        PrePaid p1 = new PrePaid();
        PrePaid p2 = new PrePaid();
        PrePaid p3 = new PrePaid();

        p1.start();
        p2.start();
        p3.start();
    }
}
