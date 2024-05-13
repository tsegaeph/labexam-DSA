package package5;
import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return; // Array is already sorted
        }

        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        mergeSort(left);
        mergeSort(right);

        merge(left, right, array);
    }

    public static void merge(int[] left, int[] right, int[] array) {
        int i = 0; // Index for left array
        int j = 0; // Index for right array
        int k = 0; // Index for merged array

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 3};

        System.out.println("Array before sorting: " + Arrays.toString(array));

        mergeSort(array);

        System.out.println("Array after sorting: " + Arrays.toString(array));
    }
}