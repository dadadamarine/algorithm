//
//import java.io.*;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine().trim());
//        int[][] pibonacci = new int[41][2];
//        pibonacci[0][0] = 1;
//        pibonacci[0][1] = 0;
//        pibonacci[1][0] = 0;
//        pibonacci[1][1] = 1;
//        for (int i = 1; i < 40; i++) {
//            pibonacci[i + 1][0] = pibonacci[i][0] + pibonacci[i - 1][0];
//            pibonacci[i + 1][1] = pibonacci[i][1] + pibonacci[i - 1][1];
//        }
//
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        for(int i=0; i<n; i++){
//            int index = Integer.parseInt(br.readLine().trim());
//            bw.write(""+pibonacci[index][0]+" ");
//            bw.write(""+pibonacci[index][1]+"\n");
//        }
//        bw.close();
//
//    }
//}
//
