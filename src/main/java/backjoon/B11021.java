package backjoon;

import java.io.*;
import java.util.Arrays;

public class B11021 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        for(int i=1; i<=num; i++){
            bw.write(getAnswer(i,
                    Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray())+"\n");
        }
        bw.close();
    }

    private static String getAnswer(int i, int[] numbers) {
        return new StringBuilder("Case #")
                .append(i)
                .append(": ")
                .append(numbers[0]+numbers[1])
                .toString();
    }

}