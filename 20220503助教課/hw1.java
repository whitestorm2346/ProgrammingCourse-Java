import java.util.jar.Attributes.Name;

class Namecard {
    private String name;
    private String address;
    private String data;
    private Phone phone;

    class Phone {
        public String company;
        public String cell;

        public Phone(String s1, String s2) {
            company = s1;
            cell = s2;
        }
    }

    public Namecard(String s1, String s2, String s3, String s4) {
        name = s1;
        address = s2;
        data = "";
        phone = new Phone(s3, s4);
    }

    public void show() {
        System.out.println("姓名：" + name);
        System.out.println("地址：" + address);
        System.out.println("電話：" + phone.company);
        System.out.println("手機：" + phone.cell);
    }
}

public class myClass {
    public static void main(String[] args) {
        Namecard first = new Namecard("David", "TKU", "2586-6478", "0910-123-456");

        first.show();
    }
}