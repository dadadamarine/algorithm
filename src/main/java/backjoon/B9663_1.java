package backjoon;
import java.io.*;

public class B9663_1 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        ChessCalculator_1 chessCalculator = new ChessCalculator_1();
        int size = Integer.parseInt(br.readLine());
        bw.write(chessCalculator.solution(size) + "");
        bw.close();
    }
}

class ChessCalculator_1 {
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
        try {
            enumerateCollisionCheck(currentRow);
        } catch (RuntimeException e) {
            return false;
        }
        return true;
    }

    public void enumerateCollisionCheck(int currentRow) {
        for (int beforeRow = 0; beforeRow < currentRow; beforeRow++) {
            checkVerticalCollision(currentRow, beforeRow);
            checkCrossCollision(beforeRow, currentRow);
        }
    }

    private void checkVerticalCollision(int beforeRow, int currentRow) {
        if (chessBoard[currentRow] == chessBoard[beforeRow]) {
            throw new RuntimeException("vertically Collide");
        }
    }

    private void checkCrossCollision(int beforeRow, int currentRow) {
        if (Math.abs(chessBoard[beforeRow] - chessBoard[currentRow]) == Math.abs(beforeRow - currentRow)) {
            throw new RuntimeException("Cross Collide");
        }
    }

}
