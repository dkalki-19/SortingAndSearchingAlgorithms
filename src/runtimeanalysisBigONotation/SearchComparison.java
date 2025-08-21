package runtimeanalysisBigONotation;

import java.util.Arrays;

public class SearchComparison {
    // Linear Search (O(n))
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    // Binary Search (O(log n))
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int size = 1000000; // dataset size
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = i;
        int target = size - 1;

        long start, end;

        start = System.nanoTime();
        linearSearch(arr, target);
        end = System.nanoTime();
        System.out.println("Linear Search Time: " + (end - start) + " ns");

        Arrays.sort(arr); // ensure sorted for binary search
        start = System.nanoTime();
        binarySearch(arr, target);
        end = System.nanoTime();
        System.out.println("Binary Search Time: " + (end - start) + " ns");
    }
}

