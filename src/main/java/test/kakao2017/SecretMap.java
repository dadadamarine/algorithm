//
//import java.io.*;
//import java.util.Arrays;
//
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        Main main = new Main();
//        int[] arr1 = {46, 33, 33 ,22, 31, 50};
//        int[] arr2 = {27 ,56, 19, 14, 14, 10};
//        main.solution(6, arr1, arr2);
//    }
//    public String[] solution(int n, int[] arr1, int[] arr2) {
//        int[] secretMap = new int[n];
//        String[] answer = new String[n];
//        for(int i=0; i<n; i++){
//            secretMap[i] = arr1[i] | arr2[i];
//        }
//        for(int i=0; i<n ; i++){
//            answer[i] = Integer.toBinaryString(secretMap[i]);
//            while (answer[i].length() < n) {
//                answer[i] = "0" + answer[i];
//            }
//        }
//
//
//        return changeMark(n ,answer);
//    }
//    public static String[] changeMark(int n, String[] array){
//        String[] answer = new String[n];
//        String test.line;
//        for(int i =0; i< n; i++){
//            test.line = "";
//            for(int k=0; k<n; k++){
//                switch(array[i].charAt(k)){
//                    case '1' :
//                        test.line += "#";
//                        break;
//                    default :
//                        test.line +=" ";
//                }
//            }
//            answer[i] = test.line;
//            System.out.println(answer[i]);
//        }
//        return answer;
//    }
//}
//
