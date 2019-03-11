//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.regex.Pattern;
//
//public class Main {
//    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    static Pattern aPattern = Pattern.compile("^A*B*A*$");
//    static Pattern bPattern = Pattern.compile("^B*A*B*$");
//
//    public static void main(String[] args) throws IOException {
//        int score = 0;
//        int testcaseCount = Integer.parseInt(br.readLine());
//        for (int i = 0; i < testcaseCount; i++) {
//            score += getMatchScore(br.readLine());
//        }
//        System.out.println(score);
//    }
//
//    public static int getMatchScore(String input) {
//        if (input.equals("AB") || input.equals("BA")) {
//            return 0;
//        }
//        if (aPattern.matcher(input).matches()) {
//            return 1;
//        }
//        if (bPattern.matcher(input).matches()) {
//            return 1;
//        }
//        return 0;
//    }
//}
