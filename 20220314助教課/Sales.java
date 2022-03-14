public class myClass {
    public static void main(String[] args) {
        int sales[][] = { { 32, 15, 22, 12 },
                { 33, 30, 23, 10 } };
        int totalSales = 0;

        for (int i = 0; i < sales.length; i++) {
            System.out.print("員工" + (i + 1) + "的業績分別為");

            for (int j = 0; j < sales[i].length; j++) {
                System.out.print(" " + sales[i][j]);

                totalSales += sales[i][j];
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("總銷售量為" + totalSales + "部手機");
    }
}