package backjoon;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;

public class B10798 {
    private static final int LINE_SIZE = 5;
    private static final int MAX_SIZE = 15;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList[] listArray = new LinkedList[5];
        for (int i = 0; i < LINE_SIZE; i++) {
            listArray[i] = new LinkedList(Arrays.asList(br.readLine().split("")));
        }
        for (int j = 0; j < MAX_SIZE; j++) {
            bw.write(readVertical(listArray));
        }
        bw.close();
    }

    private static String readVertical(LinkedList<String>[] listArray) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < LINE_SIZE; i++) {
            stringBuilder.append(getLetter(listArray[i]));
        }
        return stringBuilder.toString();
    }

    private static String getLetter(LinkedList<String> strings) {
        if (strings.peek() != null) {
            return strings.pop();
        }
        return "";
    }
}