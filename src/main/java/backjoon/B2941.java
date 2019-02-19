//import java.io.*;
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String string = bufferedReader.readLine();
//        String[] dictionary = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
//
//        System.out.println(Main.toCroatia(string, dictionary));
//
//    }
//
//    private static int toCroatia(String string, String[] dictionary) {
//        for(String word : dictionary){
//            string = string.replace(word, "A");
//        }
//        return string.length();
//    }
//
//}