package package4;

import java.util.Arrays;

public class BubbleSort {
	    public static void bubbleSort(char[] array) {
	        int n = array.length;
	        boolean swapped;

	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;

	            for (int j = 0; j < n - i - 1; j++) {
	                if (array[j] > array[j + 1]) {
	                    // Swap array[j] and array[j + 1]
	                    char temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                    swapped = true;
	                }
	            }

	            // If no two elements were swapped in the inner loop, the array is already sorted
	            if (!swapped) {
	                break;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        char[] array = {'c', 'a', 'b', 'z', 'f'};

	        System.out.println("Array before sorting: " + Arrays.toString(array));

	        bubbleSort(array);

	        System.out.println("Array after sorting: " + Arrays.toString(array));
	    }
	}