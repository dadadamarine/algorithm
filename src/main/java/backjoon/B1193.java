package backjoon;

import java.io.*;

public class B1193 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = getAnswer(Integer.parseInt(br.readLine()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("" + answer);
        bw.close();
    }

    private static String getAnswer(int parseInt) {
        int[] matrixIndexs = getMatrixIndexs(parseInt);
        return matrixIndexs[0] + "/" + matrixIndexs[1];
    }

    private static int[] getMatrixIndexs(int input) {
        int result = -1;
        for (int n = 0; result == -1; n++) {
            result = checkSection(n, input);
        }
        int gap = input - sumUntil(result - 1);
        if ((result + 1) % 2 == 1) {
            return new int[]{gap, result - gap + 1};
        }
        return new int[]{result - gap + 1, gap};

    }

    private static int checkSection(int n, int input) {
        int result = -1;
        if (sumUntil(n - 1) < input && input <= sumUntil(n)) {
            result = n;
        }
        return result;
    }

    private static int sumUntil(int n) {
        return n * (n + 1) / 2;
    }

}