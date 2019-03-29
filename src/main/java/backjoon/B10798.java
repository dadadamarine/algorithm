package backjoon;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;

//public class B10798 {
//    private static final int LINE_SIZE = 5;
//    private static final int MAX_SIZE = 15;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        LinkedList[] listArray = new LinkedList[5];
//        for (int i = 0; i < LINE_SIZE; i++) {
//            listArray[i] = new LinkedList(Arrays.asList(br.readLine().split("")));
//        }
//        for (int j = 0; j < MAX_SIZE; j++) {
//            bw.write(readVertical(listArray));
//        }
//        bw.close();
//    }
//
//    private static String readVertical(LinkedList<String>[] listArray) {
//        StringBuilder stringBuilder = new StringBuilder("");
//        for (int i = 0; i < LINE_SIZE; i++) {
//            stringBuilder.append(getLetter(listArray[i]));
//        }
//        return stringBuilder.toString();
//    }
//
//    private static String getLetter(LinkedList<String> strings) {
//        if (strings.peek() != null) {
//            return strings.pop();
//        }
//        return "";
//    }
//}

public class B10798{
    private static final int LINE_SIZE = 5;
    private static final int MAX_SIZE = 15;

    private static char[][] board;

    static void printBoard(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=15; j++){
                System.out.println(board[i][j]);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        board = new char[LINE_SIZE+2][MAX_SIZE+2];
        for(int i=1; i<=LINE_SIZE; i++){
            String line = br.readLine();
            writeLine(board[i], line);
        }

        System.out.println(getAnswer());
    }

    private static String getAnswer() {
        StringBuilder stringBuilder = new StringBuilder("");
        for(int i=1; i<=15; i++){
            for(int j=1; j<=5; j++){
                if(board[j][i]!='\u0000'){
                    stringBuilder.append(""+board[j][i]);
                }
            }
        }
        return stringBuilder.toString();
    }

    private static void writeLine(char[] strings, String line) {
        for(int i =0; i<line.length(); i++){
            strings[i] = line.charAt(i);
        }
    }
}