class CShape {

}

class CCircle extends CShape {

}

class CTriangle extends CShape {

}

class CCoin extends CCircle {

}

public class myClass {
    public static void main(String arg[]) {
        CCircle circle = new CCircle();
        CTriangle triangle = new CTriangle();
        CCoin coin = new CCoin();

        System.out.println("coin is the instance of CCoin: " + (circle instanceof CCoin));
        System.out.println("triangle is the instance of CShape: " + (triangle instanceof CShape));
        /*
         * error: CCoin cannot be converted to Object
         * System.out.println("coin is the instance of Object: " + (coin instanceof
         * Object));
         */
        System.out.println("null is the instance of Object: " + (null instanceof Object));
    }
}
