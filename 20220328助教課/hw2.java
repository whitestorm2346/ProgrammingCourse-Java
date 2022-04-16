class Cbbb {
    public String name;
    public double height; // cm
    public double weight; // kg

    public double getBMI() {
        return weight / ((height / 100) * (height / 100));
    }
}

public class myClass {
    public static void main(String[] args) {
        Cbbb student = new Cbbb();

        student.name = "David";
        student.height = 164.5;
        student.weight = 59.7;

        System.out.println("name: " + student.name);
        System.out.println("height: " + student.height);
        System.out.println("weight: " + student.weight);
        System.out.printf("BMI: %.2f", student.getBMI());
    }
}
