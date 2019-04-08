package backjoon;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class B2935 {
    private static final int STUDENTS = 30;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String token;
        int size1 = getSize(br.readLine());
        token = br.readLine();
        int size2 = getSize(br.readLine());
        bw.write(""+calculate(size1,token,size2));
        bw.close();
    }

    private static int getSize(String readLine) {
        return readLine.length();
    }

    private static String calculate(int size1, String token, int size2) {
        if(token.equals("+")){
            return plus(size1,token,size2);
        }
        if(token.equals("*")){
            return multiply(size1,token,size2);
        }
        return null;
    }

    private static String plus(int size1, String token, int size2) {
        int size = Math.max(size1, size2);
        int[] numberArray = new int[size];
        numberArray[size-size1]++;
        numberArray[size-size2]++;
        return Arrays.stream(numberArray).mapToObj(String::valueOf).collect(Collectors.joining(""));
    }

    private static String multiply(int size1, String token, int size2) {
        int tenSize = size1+size2-2;
        int[] numberArray = new int[tenSize + 1];
        numberArray[0] = 1;
        return Arrays.stream(numberArray).mapToObj(String::valueOf).collect(Collectors.joining(""));
    }
}