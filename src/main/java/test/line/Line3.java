//import java.util.*;
//
//public class Solution {
//    private static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int tables = sc.nextInt();
//        sc.nextLine();
//        Map<Integer, String> firstMap = new HashMap<>();
//        H<Integer, String> sortedFirstMap = new TreeMap<Integer, String>(firstMap);
//
//        firstMap = getMap(tables);
//
//        int secondTables = sc.nextInt();
//        sc.nextLine();
//        Map<Integer, String> secondMap = new Hashtable<>();
//        Map<Integer, String> sortedSecondMap = new TreeMap<Integer, String>(secondMap);
//
//        secondMap = getMap(secondTables);
//
//        String print = joinMap(sortedFirstMap, sortedSecondMap);
//
//        System.out.println("id name occupation city zip");
//        System.out.println(print);
//    }
//
//    private static String joinMap(Map<Integer, String> firstMap, Map<Integer, String> secondMap) {
//        Enumeration keys = firstMap.keys();
//        StringBuilder sb = new StringBuilder("");
//        while (keys.hasMoreElements()) {
//            int key = (int) keys.nextElement();
//            String firstElement = firstMap.get(key);
//            firstMap.remove(key);
//            String secondElement = secondMap.get(key);
//            secondMap.remove(key);
//            sb.append(toJoinedLine(key, firstElement, secondElement));
//        }
//
//        Enumeration keys2 = secondMap.keys();
//        while (keys2.hasMoreElements()) {
//            int key = (int) keys2.nextElement();
//            String firstElement = firstMap.get(key);
//            firstMap.remove(key);
//            String secondElement = secondMap.get(key);
//            secondMap.remove(key);
//            sb.append(toJoinedLine(key, firstElement, secondElement));
//        }
//        return sb.toString();
//    }
//
//    private static String toJoinedLine(int key, String firstElement, String secondElement) {
//        StringBuilder sb = new StringBuilder("" + key);
//        if (firstElement == null) {
//            sb.append(" null null");
//        } else {
//            sb.append(firstElement);
//        }
//        if (secondElement == null) {
//            sb.append(" null null");
//        } else {
//            sb.append(secondElement);
//        }
//        sb.append("\n");
//        return sb.toString();
//    }
//
//
//    private static Hashtable<Integer, String> getMap(int tables) {
//        Hashtable<Integer, String> firstTable = new Hashtable<>();
//        sc.nextLine();
//        for (int i = 0; i < tables - 1; i++) {
//            int key = sc.nextInt();
//            String value1 = sc.nextLine();
//            firstTable.put(key, value1);
//        }
//        return firstTable;
//    }
//
//
//}