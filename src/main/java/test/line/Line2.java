//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class Kakao2019.Solution4 {
//    static Pattern stringPattern = Pattern.compile("[A-Z][a-z]*");
//    static Pattern numberPattern = Pattern.compile("[0-9]");
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String test.line = sc.nextLine();
//        String print = "";
//        try {
//            print = toGoodFormat(test.line);
//        } catch (RuntimeException e) {
//            print = "error";
//        }
//        System.out.println(print);
//    }
//
//    private static String toGoodFormat(String test.line) {
//        Queue<String> stringQueue = toStringQueue(test.line);
//        Queue<Integer> integerQueue = toIntegerQueue(test.line);
//
//        System.out.println(stringQueue);
//        System.out.println(integerQueue);
//
//        StringBuilder sb = new StringBuilder("");
//        while (!stringQueue.isEmpty()) {
//            sb.append(stringQueue.poll());
//            String nextInt = getNextInteger(integerQueue);
//            if (!(nextInt.equals("1"))) {
//                sb.append(nextInt);
//            }
//        }
//        if (sb.toString().contains("null")) {
//            return "error";
//        }
//        return sb.toString();
//    }
//
//    private static String getNextInteger(Queue<Integer> integerQueue) {
//        StringBuilder next = new StringBuilder("");
//        next.append(integerQueue.poll());
//        if (integerQueue.isEmpty()) return next.toString();
//        if (integerQueue.peek() == 0) {
//            next.append(integerQueue.poll());
//        }
//        return next.toString();
//    }
//
//    private static Queue<String> toStringQueue(String test.line) {
//        Matcher stringMatcher = stringPattern.matcher(test.line);
//        Queue<String> stringQueue = new LinkedList<>();
//        while (stringMatcher.find()) {
//            stringQueue.add(stringMatcher.group());
//        }
//        return stringQueue;
//    }
//
//    private static Queue<Integer> toIntegerQueue(String test.line) {
//        Matcher integerMatcher = numberPattern.matcher(test.line);
//        Queue<Integer> integerQueue = new LinkedList<>();
//        while (integerMatcher.find()) {
//            integerQueue.add(Integer.parseInt(integerMatcher.group()));
//        }
//        return integerQueue;
//    }
//
//}