package sortingAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] scores = {78, 55, 45, 98, 13};
        for (int i = 0; i < scores.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIdx]) minIdx = j;
            }
            int temp = scores[minIdx];
            scores[minIdx] = scores[i];
            scores[i] = temp;
        }
        for (int s : scores) System.out.print(s + " ");
    }
}
