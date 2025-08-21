package sortingAlgorithms;

class CountingSort {
    void sort(int arr[]) {
        int max = arr[0];
        for (int num : arr) if (num > max) max = num;
        int[] count = new int[max + 1];
        for (int num : arr) count[num]++;
        int idx = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[idx++] = i;
                count[i]--;
            }
        }
    }
}
