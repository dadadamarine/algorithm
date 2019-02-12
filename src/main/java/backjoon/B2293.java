//import java.io.*;
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String[] input = bufferedReader.readLine().split(" ");
//        int n = Integer.parseInt(input[0]);//동전의 종류수
//        int k = Integer.parseInt(input[1]);//k원
//        int[] coinArray = new int[n];
//        for(int i =0; i<n; i++){
//            coinArray[i] = Integer.parseInt(bufferedReader.readLine());
//        }
//        int[][] dp = new int[n][n];
//        //가장 큰거부터 시작해서.
//        //coinArray[i][k] == i번째 코인까지 사용해서 금액 k를 만들수있는 경우의수
//        //coinArray[i][k] = coinArray[i-1][k-]
//    }
//
//}
//
