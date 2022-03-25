// class: 資工一A name: 游昃勛 ID: 410411218
public class myClass {
    public static void main(String[] args) {
        int a[][] = { { 2, 4, 6 }, { 2, 9, 5 }, { 6, 3 } };

        System.out.println("average: " + averageArr(a));
    }

    public static float averageArr(int[][] arr) {
        float sum = 0f;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++, count++) {
                sum += arr[i][j];
            }
        }

        return sum / count;
    }
}
