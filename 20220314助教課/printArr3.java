public class myClass {
    public static void main(String[] args) {
        int arr3[][][] = { { { 15, 85, 36 }, { 30, 14, 37 }, { 42, 23, 96 }, { 19, 39, 51 } },
                { { 22, 16, 51 }, { 97, 30, 12 }, { 68, 77, 26 }, { 57, 32, 76 } } };
        int min = 2147483647;

        System.out.println("before: ");

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                for (int k = 0; k < arr3[i][j].length; k++) {
                    System.out.print(arr3[i][j][k]);

                    if (arr3[i][j][k] > 50)
                        arr3[i][j][k] = 99;
                }

                System.out.println();
            }

            System.out.println("");
        }

        System.out.println("\nafter: ");

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                for (int k = 0; k < arr3[i][j].length; k++) {
                    System.out.print(arr3[i][j][k]);
                }

                System.out.println();
            }

            System.out.println("");
        }
    }
}