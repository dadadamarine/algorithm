package backjoon;
import java.io.*;

public class B2242 {
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

    private static void insertStars() {
        for (int i = 0; i < lineCount; i++) {
            insertStar(i);
        }
    }

    private static void insertStar(int lineNumber) {
        for (int i = lineCount - lineNumber - 1; i < lineCount + lineNumber; i++) {
            board[lineNumber][i] = '*';
        }
    }

    private static String getPrint() {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < lineCount; i++) {
            for (int j = 0; j < size; j++) {
                if(board[i][j]!='\u0000'){
                    stringBuilder.append(board[i][j]);
                }
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    private static void init() throws IOException {
        lineCount = Integer.parseInt(br.readLine());
        size = lineCount * 2 - 1;
        board = new char[lineCount][size];
        for (int i = 0; i < lineCount; i++) {
            for (int j = 0; j < size/2; j++) {
                board[i][j] = ' ';
            }
        }
    }


}


