//import java.io.*;
//import java.util.Collections;
//import java.util.LinkedList;
//
//public class Solution {
//    private static final int TESTCASES = 10;
//    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//    public static void main(String[] args) throws IOException {
//        Solution main = new Solution();
//        for (int i = 0; i < TESTCASES; i++) {
//            int buildingCount = toInt(br.readLine());
//            int result = 0;
//            result = main.doCalculate(buildingCount);
//            bw.write("#" + (i + 1) + " " + result + "\n");
//        }
//        bw.close();
//    }
//
//    private int doCalculate(int buildingCount) throws IOException {
//        String[] buildHeights = br.readLine().split(" ");
//        int result = 0;
//        for (int i = 0 + 2; i < buildingCount - 2; i++) {
//            result += getGoodViewHouse(buildHeights, i);
//        }
//        return result;
//    }
//
//    private int getGoodViewHouse(String[] buildHeights, int buildingNumber) {
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(Integer.parseInt(buildHeights[buildingNumber - 2]));
//        list.add(Integer.parseInt(buildHeights[buildingNumber - 1]));
//        list.add(Integer.parseInt(buildHeights[buildingNumber + 1]));
//        list.add(Integer.parseInt(buildHeights[buildingNumber + 2]));
//
//        Collections.sort(list);
//
//        int gap = Integer.parseInt(buildHeights[buildingNumber]) - list.getLast();
//        if (gap > 0) {
//            return gap;
//        }
//        return 0;
//    }
//
//    private static int toInt(String readLine) {
//        return Integer.parseInt(readLine);
//    }
//
//}