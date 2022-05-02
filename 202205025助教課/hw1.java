class CCircle
{
    private static double pi = 3.14;
    private double radius;

    public CCircle(double radius)
    {
        this.radius = radius;
    }

    public void show()
    {
        System.out.println("area = " + (pi * radius * radius));
    }

    public static double compare(CCircle c[]) // 1. 加上static是將method宣告為類別方法
    {
        double max = 0.0;

        for(int i = 0; i < c.length; i++)
        {
            if(c[i].radius > max) max = c[i].radius;
        }

        return max;
    }

    public static double avg(CCircle c[]) // 2.
    {
        double sum = 0.0;

        for(int i = 0; i < c.length; i++)
        {
            sum += c[i].radius;
        }

        return (sum / c.length);
    }
}

class test
{
    public static void main(String args[]) 
    {
        CCircle cir = new CCircle[3];

        for(int i = 0; i < 3; i++) // 3.
        {
            cir[i] = new CCircle((double)i);
        }

        for(int i = 0; i < 3; i++)
        {
            cir[i].show();
        }

        System.out.println("Average radius = " + CCircle.avg(cir));
    }
}