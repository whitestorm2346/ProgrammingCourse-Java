class CTest {
    private int value;

    public CTest() {
        this(12); // part a
        System.out.println("value: " + value);
    }

    public CTest(int value) {
        this.value = value;
        System.out.println("value: " + value);
    }
}

public class myClass {
    public static void main(String[] args) {
        CTest obj1 = new CTest();   // CTest()
        CTest obj2 = new CTest(15); // CTest(int value) 
    }
}

/*

part c:
    不可以宣告為public，每個java檔只能有一個public class

part d:
    不會影響，因為在class內部不論是何種存取標籤皆能進行存取

*/
