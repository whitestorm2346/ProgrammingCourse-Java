// class: 資工一A name: 游昃勛 ID: 410411218
public class myClass {
    public static void main(String[] args) {
        int arr[] = { 75, 29, 10, 38, 45, 16 };

        System.out.println("max * min = " + max_x_min(arr));
    }

    public static int max_x_min(int arr[]) {
        int max = -2147483648;
        int min = 2147483647;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];

            if (arr[i] < min)
                min = arr[i];
        }

        return max * min;
    }
}
