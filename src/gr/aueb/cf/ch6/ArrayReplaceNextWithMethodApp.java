package gr.aueb.cf.ch6;

public class ArrayReplaceNextWithMethodApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        shiftLeftByOne(arr, 0);
        printArray(arr);
    }

    public static void shiftLeftByOne(int[] arr, int low) {
        if (arr == null) return;
        if ((low < 0) || (low > arr.length - 1)) return;

        for (int i = low; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = 0;
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}