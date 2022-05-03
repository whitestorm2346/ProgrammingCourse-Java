class CCount {
    private static int ct = 0;

    public CCount() {
        ct++;
    }

    public static void count() {
        System.out.println("ct: " + ct);
    }

    public void setZero() { // part a
        ct = 0;
    }

    public void setValue(int n) { // part b
        ct = n;
    }
}

public class myClass {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            CCount obj = new CCount();

            CCount.count();
        }

        CCount obj = new CCount();

        CCount.count();

        obj.setZero();
        CCount.count();

        obj.setValue(15);
        CCount.count();
    }
}

/*
 * 
 * part c:
 * ct要宣告為類別變數，因為要讓每個新物件都能去計算當前宣告的個數
 * 
 * part d:
 * 都可以，只是呼叫的方式上有差異
 * 
 */