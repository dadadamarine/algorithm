package backjoon;

import java.io.*;
import java.util.Arrays;

public class B10952 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        while (numbers[0] + numbers[1] != 0) {
            bw.write(add(numbers) + "\n");
            numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        bw.close();
    }

    private static int add(int[] numbers) {
        return numbers[0] + numbers[1];
    }

}