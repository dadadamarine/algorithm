package backjoon;

import java.io.*;

public class B10808 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int ALPHABET_SIZE = 26;
    static String example;
    static int[] alphabetCounter;

    public static void main(String[] args) throws IOException {
        init();
        count();
        bw.write(print());
        bw.close();
    }

    private static String print() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            sb.append(alphabetCounter[i] + " ");
        }
        return sb.toString();
    }

    private static void count() {
        for (int i = 0; i < example.length(); i++) {
            int alphabetIndex = example.charAt(i) - 97;
            alphabetCounter[alphabetIndex]++;
        }
    }

    private static void init() throws IOException {
        example = br.readLine();
        alphabetCounter = new int[ALPHABET_SIZE];
    }

}



