package backjoon;
import java.io.*;

public class B2444 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int numbers;
    static int size;

    public static void main(String[] args) throws IOException {
        init();
        String result = makeLines();
        bw.write(result);
        bw.close();
    }

    private static String makeLines() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(makeLine(i) + "\n");
        }
        return stringBuilder.toString();
    }

    private static String makeLine(int index) {
        StringBuilder stringBuilder = new StringBuilder();
        int gap = Math.abs(numbers - index - 1);
        for (int i = 0; i < gap; i++) {
            stringBuilder.append(" ");
        }
        int stars = size - 2 * gap;
        for (int i = 0; i < stars; i++) {
            stringBuilder.append("*");
        }
        return stringBuilder.toString();
    }

    private static void init() throws IOException {
        numbers = Integer.parseInt(br.readLine());
        size = 2 * numbers - 1;
    }
}


