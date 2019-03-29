import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static char[][] board;
    private static int size;
    private static int lineCount;

    public static void main(String[] args) throws IOException {
        init();
        insertStars();
        String output = getPrint();
        bw.write(output);
        bw.close();
    }


}


