class myClass {
    public static void main(String[] args) {
        int array[] = { 3, -1, 2, 5, 6, 9, 1, 0, 7, 4 };

        System.out.println("size of array: " + array.length);

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 3 && array[i] <= 6)
                count++;
        }

        System.out.println("the count of the number (3~6): " + count);
    }
}