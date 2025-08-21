package runtimeanalysisBigONotation;

import java.util.*;

public class DataStructureComparison {
    public static void main(String[] args) {
        int size = 1000000;
        int target = size - 1;

        // Array
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = i;

        // HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < size; i++) hashSet.add(i);

        // TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);

        long start, end;

        // Array Search
        start = System.nanoTime();
        boolean found = false;
        for (int num : arr) {
            if (num == target) { found = true; break; }
        }
        end = System.nanoTime();
        System.out.println("Array Search Time: " + (end - start) + " ns");

        // HashSet Search
        start = System.nanoTime();
        hashSet.contains(target);
        end = System.nanoTime();
        System.out.println("HashSet Search Time: " + (end - start) + " ns");

        // TreeSet Search
        start = System.nanoTime();
        treeSet.contains(target);
        end = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (end - start) + " ns");
    }
}
