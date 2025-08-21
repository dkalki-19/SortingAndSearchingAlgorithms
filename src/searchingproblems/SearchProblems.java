package searchingproblems;


import java.util.*;

public class SearchProblems {

    // Linear Search 1: First Negative Number
    public static int firstNegativeIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) return i;
        }
        return -1;
    }

    // Linear Search 2: Search for a Specific Word in Sentences
    public static String findSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) return sentence;
        }
        return "Not Found";
    }

    // Binary Search 1: Find Rotation Point in Rotated Sorted Array
    public static int findRotationPoint(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) left = mid + 1;
            else right = mid;
        }
        return left; // index of smallest element
    }

    // Binary Search 2: Find Peak Element
    public static int findPeak(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    // Binary Search 3: Search Target in 2D Sorted Matrix
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / cols, col = mid % cols;
            if (matrix[row][col] == target) return true;
            if (matrix[row][col] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }

    // Binary Search 4: First and Last Occurrence in Sorted Array
    public static int[] findFirstAndLast(int[] arr, int target) {
        return new int[]{findBound(arr, target, true), findBound(arr, target, false)};
    }

    private static int findBound(int[] arr, int target, boolean isFirst) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                if (isFirst) right = mid - 1;
                else left = mid + 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return result;
    }

    // Main Method with Sample Test Cases
    public static void main(String[] args) {
        // Linear Search Tests
        int[] arr1 = {2, 4, -3, 7, -1};
        System.out.println("First Negative Index: " + firstNegativeIndex(arr1));

        String[] sentences = {"Java is fun", "I love coding", "AI is the future"};
        System.out.println("Sentence Found: " + findSentence(sentences, "coding"));

        // Binary Search Tests
        int[] rotated = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Rotation Point Index: " + findRotationPoint(rotated));

        int[] arr2 = {1, 3, 20, 4, 1, 0};
        System.out.println("Peak Element Index: " + findPeak(arr2));

        int[][] matrix = {
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 17}
        };
        System.out.println("Search 9 in Matrix: " + searchMatrix(matrix, 9));

        int[] sorted = {5, 7, 7, 8, 8, 10};
        System.out.println("First and Last of 8: " + Arrays.toString(findFirstAndLast(sorted, 8)));
    }
}
