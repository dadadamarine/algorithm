//
//import java.io.*;
//import java.util.Arrays;
//
//public class Main {
//    private static final int SIZE=3;
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int[] arr = new int[SIZE];
//        String[] abc =new String[SIZE];
//
//        String[] str=br.readLine().split(" ");
//        for(int i=0; i<SIZE; i++){
//            arr[i] = Integer.parseInt(str[i]);
//        }
//
//        abc=br.readLine().split("");
//
//        Arrays.sort(arr);
//
//        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
//        for(int i=0; i<SIZE; i++){
//            bw.write(""+getMatchNumber(arr, abc[i]) + " ");
//        }
//        bw.close();
//    }
//    public static int getMatchNumber(int[] arr, String abc){
//        switch (abc){
//            case "A" :
//                return arr[0];
//            case "B" :
//                return arr[1];
//            case "C" :
//                return arr[2];
//        }
//        return 0;
//    }
//
//}
//
