//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//public class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        List<Integer> countedList = getCountedList(n);
//        Collections.sort(countedList);
//        System.out.println(countedList.get(0));
//    }
//
//    private static List<Integer> getCountedList(int n) {
//        List<Integer> list = new ArrayList<>();
//        for(int i=1; i<=n; i++){
//            calculate(list, n , i);
//        }
//        return list;
//    }
//
//    private static void calculate(List<Integer> list, int width, int i) {
//        int height = width/i;
//        if(height*i == width){
//            list.add(Math.abs(i-height));
//        }
//    }
//
//}