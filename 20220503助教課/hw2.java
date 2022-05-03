class Data {
    private String name;
    private Test score;

    class Test {
        public int english;
        public int math;

        public Test(int eng, int math) {
            english = eng;
            this.math = math;
        }

        public double avg() {
            return (english + math) / 2.0;
        }
    }

    public Data(String name, int english, int math) {
        this.name = name;
        score = new Test(english, math);
    }

    public void show() {
        System.out.println("學生姓名：" + name);
        System.out.println("英文成績：" + score.english);
        System.out.println("數學成績：" + score.math);
        System.out.println("平均成績：" + score.avg());
    }
}

public class myClass {
    public static void main(String[] args) {
        Data stu = new Data("John", 85, 91);
        stu.show();
    }
}