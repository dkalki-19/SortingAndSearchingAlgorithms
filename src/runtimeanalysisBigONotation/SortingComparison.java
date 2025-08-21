package runtimeanalysisBigONotation;

import java.util.Arrays;

public class SortingComparison {
    // Bubble Sort (O(n^2))
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int size = 10000; // test with small dataset
        int[] arr1 = new int[size];
        for (int i = 0; i < size; i++) arr1[i] = (int)(Math.random() * size);

        int[] arr2 = Arrays.copyOf(arr1, size);
        int[] arr3 = Arrays.copyOf(arr1, size);

        long start, end;

        start = System.nanoTime();
        bubbleSort(arr1);
        end = System.nanoTime();
        System.out.println("Bubble Sort Time: " + (end - start) + " ns");

        start = System.nanoTime();
        Arrays.sort(arr2); // Dual-Pivot QuickSort
        end = System.nanoTime();
        System.out.println("QuickSort Time: " + (end - start) + " ns");

        start = System.nanoTime();
        Arrays.parallelSort(arr3); // Parallel MergeSort
        end = System.nanoTime();
        System.out.println("MergeSort Time: " + (end - start) + " ns");
    }
}
