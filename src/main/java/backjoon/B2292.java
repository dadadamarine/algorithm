package backjoon;

import java.io.*;

public class B2292 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = calculate(Integer.parseInt(br.readLine()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(answer + 1 + "");
        bw.close();
    }

    private static int calculate(int input) {
        int answer = -1;
        int index = 1;
        if (input == 1) {
            return 0;
        }
        while (answer == -1) {
            answer = getIndexIfWriteIndex(input, index);
            index++;
        }
        return answer;
    }

    private static int getIndexIfWriteIndex(int input, int index) {
        if (3 * (index - 1) * index <= (input - 2) && (input - 2) < 3 * (index + 1) * index) {
            return index;
        }
        return -1;
    }
}