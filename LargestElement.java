package Sorting;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 324, 45, 90, 9808};
        int max = findLargest(arr);
        System.out.println("Largest element in the array is: " + max);
    }

    static int findLargest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
