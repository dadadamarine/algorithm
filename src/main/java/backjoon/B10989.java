//
//import java.io.*;
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//        for(int i =0; i<n; i++){
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//        Arrays.sort(arr);
//        print(arr);
//        br.close();
//    }
//    static void print(int[] arr) throws IOException {
//        BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out));
//        for(int i = 0; i<arr.length; i++){
//            bw.write(""+arr[i]+"\n");
//        }
//        bw.close();
//    }
//}
//
