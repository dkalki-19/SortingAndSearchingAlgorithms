package runtimeanalysisBigONotation;

public class StringPerformance {
    public static void main(String[] args) {
        int iterations = 10000;

        long start, end;

        // String
        start = System.nanoTime();
        String s = "";
        for (int i = 0; i < iterations; i++) {
            s += "a";
        }
        end = System.nanoTime();
        System.out.println("String Time: " + (end - start) + " ns");

        // StringBuilder
        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");
        }
        end = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end - start) + " ns");

        // StringBuffer
        start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append("a");
        }
        end = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end - start) + " ns");
    }
}

