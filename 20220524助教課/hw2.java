class RadiusTooLarge extends Exception {

}

class RadiusIsNagitive extends Exception {

}

class CCircleException extends Exception {
    @Override
    public String toString() {
        return "CCircleException例外被拋出了";
    }
}

class CCircle // 定義類別CCircle
{
    private double radius;

    public void setRadius(double r) throws CCircleException, RadiusIsNagitive, RadiusTooLarge {
        // 3.
        if (r < 0) {
            throw new RadiusIsNagitive(); // 拋出例外
        } else if (r > 100) {
            throw new RadiusTooLarge();
        } else {
            radius = r;
        }
    }

    public void show() {
        System.out.println("area=" + 3.14 * radius * radius);
    }
}

public class myClass {
    public static void main(String args[]) {
        CCircle cir = new CCircle();

        try {
            cir.setRadius(-2.0);
        } catch (CCircleException e) {
            System.out.println(e); // 4.
        } catch (RadiusIsNagitive e) {
            System.out.println("Radius is nagitive");
        } catch (RadiusTooLarge e) {
            System.out.println("Radius is too large");
        }

        cir.show();
    }
}
