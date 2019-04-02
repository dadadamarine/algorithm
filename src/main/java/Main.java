
import java.io.*;

public class Main {
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

}



