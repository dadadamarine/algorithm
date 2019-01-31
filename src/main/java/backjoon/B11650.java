//
//import java.io.*;
//import java.util.Arrays;
//
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        Main main = new Main();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        long[][] arr = new long[n][2];
//
//        for (int i = 0; i < n; i++) {
//            String line = br.readLine();
//            arr[i][0] = Integer.parseInt(line.split(" ")[0]);
//            arr[i][1] = Integer.parseInt(line.split(" ")[1]);
//        }
//        arr = main.sort(arr, n);
//        br.close();
//
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        for (int i = 0; i < n; i++) {
//            bw.write("" + arr[i][0] + " ");
//            bw.write("" + arr[i][1] + "\n");
//        }
//        bw.close();
//    }
//
//    public static long[][] sort(long[][] arr, int n) {
//        long[][] newArr = new long[n][2];
//        long[] array = new long[n];
//        for (int i = 0; i < n; i++) {
//            array[i] = (arr[i][0] + 100000) * 1000000 + (arr[i][1] + 100000);
//        }
//        Arrays.sort(array);
//        for (int i = 0; i < n; i++) {
//            newArr[i][0] = (array[i] / 1000000) - 100000;
//            newArr[i][1] = (array[i] % 1000000) - 100000;
//        }
//        return newArr;
//    }
//
//    static void print(int[] arr) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        for (int i = 0; i < arr.length; i++) {
//            bw.write("" + arr[i] + "\n");
//        }
//        bw.close();
//    }
//}
//
