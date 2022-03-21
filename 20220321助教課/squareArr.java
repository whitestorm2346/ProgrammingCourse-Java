public class myClass {
    public static void main(String[] args) {
        int arr[][] = { { 2, 4, 6 }, { 1, 3, 5 }, { 8, 9 } };

        squareArr(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println("");
        }
    }

    public static void squareArr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] *= arr[i][j];
            }
        }
    }
}
