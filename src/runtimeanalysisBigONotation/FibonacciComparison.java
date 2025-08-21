package runtimeanalysisBigONotation;

public class FibonacciComparison {
    // Recursive (O(2^n))
    public static int recursiveFib(int n) {
        if (n <= 1) return n;
        return recursiveFib(n - 1) + recursiveFib(n - 2);
    }

    // Iterative (O(n))
    public static int iterativeFib(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        int n = 40; // test value

        long start, end;

        start = System.nanoTime();
        System.out.println("Recursive Result: " + recursiveFib(n));
        end = System.nanoTime();
        System.out.println("Recursive Time: " + (end - start) + " ns");

        start = System.nanoTime();
        System.out.println("Iterative Result: " + iterativeFib(n));
        end = System.nanoTime();
        System.out.println("Iterative Time: " + (end - start) + " ns");
    }
}
