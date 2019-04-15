package backjoon;
import java.io.*;

public class B9663 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        ChessCalculator chessCalculator = new ChessCalculator();
        int size = Integer.parseInt(br.readLine());
        bw.write(chessCalculator.solution(size)+"");
        bw.close();
    }
}

class ChessCalculator {
    int count;
    int[] chessBoard;
    int boardSize;

    public int solution(int size) {
        boardSize = size;
        count = 0;
        chessBoard = new int[boardSize];
        count(0);
        return count;
    }

    private void count(int row) {
        if (row >= boardSize) {
            count++;
            return;
        }
        for (int column = 0; column < boardSize; column++) {
            chessBoard[row] = column;
            if (promising(row)) {
                count(row + 1);
            }
        }
    }

    private boolean promising(int currentRow) {
        for (int beforeRow = 0; beforeRow < currentRow; beforeRow++) {
            if (isVerticalCollide(currentRow, beforeRow)) {
                return false;
            }
            if (isCrossCollide(beforeRow, currentRow)) {
                return false;
            }
        }
        return true;
    }

    private boolean isVerticalCollide(int beforeRow, int currentRow) {
        return chessBoard[currentRow] == chessBoard[beforeRow];
    }

    private boolean isCrossCollide(int beforeRow, int currentRow) {
        if (Math.abs(chessBoard[beforeRow] - chessBoard[currentRow]) == Math.abs(beforeRow - currentRow)) {
            return true;
        }
        return false;
    }

}

