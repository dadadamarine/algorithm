//import java.io.*;
//
//public class Main{
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int num = Integer.parseInt(bufferedReader.readLine());
//        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
//        for(int i =0; i<num; i++){
//            String[] numbers = bufferedReader.readLine().split(" ");
//            int sum = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
//            bufferedWriter.write(sum+"\n");
//        }
//        bufferedWriter.close();
//    }
//}