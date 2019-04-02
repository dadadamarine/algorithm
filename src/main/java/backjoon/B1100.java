package backjoon;
import java.io.*;

public class B1100 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int SIZE = 8;

    static char[][] board;

    public static void main(String[] args) throws IOException {
        init();
        int horseCountInWhite = count();
        bw.write(horseCountInWhite + "");
        bw.close();
    }

    private static int count() {
        int count = 0;
        for (int spin = 0; spin < SIZE * 2 - 1; spin+=2) {
            for (int i = 0; i < SIZE; i++) {
                int j = spin - i;
                if (j < 0 || j >= SIZE) continue;
                if (board[i][j] == 'F') count++;
            }
        }
        return count;
    }


    private static void init() throws IOException {
        board = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            board[i] = br.readLine().toCharArray();
        }
    }

}