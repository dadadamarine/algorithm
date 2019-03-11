//import java.io.*;
//import java.util.Collections;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.StringTokenizer;
//
//public class Main {
//    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//    static boolean reversed;
//
//    public static void main(String[] args) throws IOException {
//        Main main = new Main();
//        int testcaseNumber = Integer.parseInt(br.readLine());
//        for (int i = 0; i < testcaseNumber; i++) {
//            reversed = false;
//            main.start(br.readLine(), br.readLine(), br.readLine()); // RDD, 4, [1,2,3,4]
//        }
//        bw.close();
//    }
//
//    private void start(String operationsString, String numberCount, String numberString) throws IOException {
//        List<Integer> list = toNumbers(numberCount, numberString);
//        char[] operations = toOperations(operationsString);
//        try {
//
//            for (char operation : operations) {
//                operate(list, operation);
//            }
//            if (reversed) {
//                Collections.reverse(list);
//                bw.write(list.toString().replaceAll(" ", ""));
//            } else {
//                bw.write(list.toString().replaceAll(" ", ""));
//            }
//            bw.write("\n");
//
//        } catch (RuntimeException e) {
//            bw.write("error\n");
//        }
//    }
//
//    private void operate(List<Integer> list, char operation) {
//        if (operation == 'R') {
//            reverse(list);
//            return;
//        }
//        delete(list);
//    }
//
//    private void reverse(List<Integer> list) {
//        reversed = !reversed;
//    }
//
//    private void delete(List<Integer> list) {
//        if (list.isEmpty()) {
//            throw new RuntimeException("");
//        }
//        if (reversed) {
//            list.remove(list.size() - 1);
//            return;
//        }
//        list.remove(0);
//    }
//
//    public char[] toOperations(String operationsString) {
//        return operationsString.toCharArray();
//    }
//
//    public List<Integer> toNumbers(String numberCount, String numberString) {
//        List<Integer> list = new LinkedList<>();
//        if (numberCount.equals("0")) return list;
//        numberString = numberString.substring(1, numberString.length() - 1);
//        StringTokenizer stringTokenizer = new StringTokenizer(numberString, ",");
//        while (stringTokenizer.hasMoreTokens()) {
//            list.add(Integer.parseInt(stringTokenizer.nextToken()));
//        }
//        return list;
//    }
//
//}
//
//
