import java.io.*;

public class B1032 {

    static int lineCount;
    static char[][] inputs;
    static char[] answer;

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        init();
        makeAnswer();
        bw.write(String.valueOf(answer));
        bw.close();
    }

    private static void makeAnswer() {
        for (int i = 0; i < inputs[0].length; i++) {
            answer[i] = extractCommonLetter(i);
        }
    }

    private static char extractCommonLetter(int index) {
        char letter = inputs[0][index];
        for (int j = 1; j < lineCount; j++) {
            if (letter != inputs[j][index]) {
                return '?';
            }
        }
        return letter;
    }

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        lineCount = Integer.parseInt(br.readLine());
        inputs = new char[lineCount][];
        for (int i = 0; i < lineCount; i++) {
            inputs[i] = br.readLine().toCharArray();
        }
        answer = new char[inputs[0].length];
    }
}