package backjoon;
import java.io.*;

public class B2243 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int lines;
    static int size;
    static char[][] board;

    public static void main(String[] args) throws IOException {
        init();
        insertLines();
        bw.write(getPrintFormat());
        bw.close();
    }


    private static String getPrintFormat() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<lines; i++){
            for(int j=0; j<size; j++){
                if(board[i][j]!='\u0000'){
                    stringBuilder.append(board[i][j]);
                }
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    private static void insertLines() {
        for(int i=0; i<lines; i++){
            insertLine(i);
        }
    }

    private static void insertLine(int line) {
        for(int i=line; i<size-line;i++){
            board[line][i] = '*';
        }
    }

    private static void init() throws IOException {
        lines = Integer.parseInt(br.readLine());
        size = lines * 2 - 1;
        board = new char[lines][size];

        for (int i = 0; i < lines; i++) {
            for(int j=0; j<size/2; j++){
                board[i][j] = ' ';
            }
        }

    }
}


