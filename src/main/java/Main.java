import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());
        for (int i= 1; i<=number; i++){
            int[] numbers = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
            bw.write(add(numbers) + "\n");
        }
        bw.close();
    }

    private static int add(int[] numbers) {
        return numbers[0] + numbers[1];
    }

}