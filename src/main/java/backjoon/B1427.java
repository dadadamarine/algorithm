//import org.omg.PortableInterceptor.INACTIVE;
//
//import java.util.Scanner;
//import java.util.Arrays;
//
///*
//    key: 그래프 이용
//    - 크기 n행인 & 행 3개인 배열 선언 (둘째줄은 학생번호, )
//    - 조건으로 주어진 애들끼리 그래프 그림( 배열이용 )
//        -
//    - 마지막에 독립된 배열 다 합쳐서 출력
//
// */
//
//public class Main {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        String n = scanner.nextLine();
//        String[] stringArr = n.split("");
//        int[] numberArr = new int[stringArr.length];
//        for(int i=0; i<stringArr.length; i++){
//            numberArr[i] = Integer.parseInt(stringArr[i]);
//        }
//        Arrays.sort(numberArr);
//        printReverse(numberArr);
//    }
//    static void printReverse(int[] arr){
//        for(int i=arr.length-1; i>=0; i--){
//            System.out.print(""+arr[i]);
//        }
//    }
//
//
//
//}
//
