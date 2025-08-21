package runtimeanalysisBigONotation;

import java.io.*;

public class LargeFileReadComparison {

    // Read file using FileReader (Character Stream)
    public static void readWithFileReader(String filePath) throws IOException {
        long start = System.currentTimeMillis();

        try (FileReader fr = new FileReader(filePath)) {
            while (fr.read() != -1) {
                // reading character by character
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("FileReader Time: " + (end - start) + " ms");
    }

    // Read file using InputStreamReader (Byte Stream → Character Stream)
    public static void readWithInputStreamReader(String filePath) throws IOException {
        long start = System.currentTimeMillis();

        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath))) {
            while (isr.read() != -1) {
                // reading character by character
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("InputStreamReader Time: " + (end - start) + " ms");
    }

    public static void main(String[] args) throws IOException {
        String filePath = "largefile.txt"; // path of a large file (1MB, 100MB, 500MB)

        System.out.println("Reading Efficiency Test:");

        readWithFileReader(filePath);
        readWithInputStreamReader(filePath);
    }
}
