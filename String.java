class StringClass {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        reverse(arr);
        printArray(arr);
    }

    static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int r = array.length - 1 - i;
            int temp = array[i];
            array[i] = array[r];
            array[r] = temp;
        }
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}