//import java.io.*;
//
//public class Main {
//    public static int circleIndex;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String[] input = bufferedReader.readLine().split(" ");
//        int n = Integer.parseInt(input[0]);
//        int m = Integer.parseInt(input[1]);
//        int[][] circle = new int[n][2];
//        String answer= "";
//        initCircle(circle, n);
//
//        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        answer+="<"+eraseNode(circle, m-1)+", ";
//        for (int i = 0; i < n - 1; i++) {
//            answer+=eraseNode(circle, m) + ", ";
//        }
//        answer = answer.substring(0, answer.length()-2 );
//        answer+=">";
//        bufferedWriter.write(answer);
//        bufferedWriter.close();
//    }
//
//    public static void initCircle(int[][] circle, int n) {
//        for (int i = 0; i < n; i++) {
//            circle[i][0] = i;
//            circle[i][1] = i + 1;
////            System.out.print(circle[i][0]);
////            System.out.print(circle[i][1]+" ");
//        }
//        //System.out.println("");
//        circle[n - 1][1] = 0;
//        circleIndex = 0;
//    }
//
//    public static int eraseNode(int[][] circle, int m) {
//        int erasedNodeIndex = 0;
//        int beforeNodeIndex = 0;
//        for (int i = 0; i < m; i++) {
//            beforeNodeIndex = circleIndex;
//            circleIndex = circle[circleIndex][1];
//            erasedNodeIndex = circleIndex;
//        }
//        circle[beforeNodeIndex][1] = circle[erasedNodeIndex][1];
//        return erasedNodeIndex + 1;
//    }
//
//
//}
//
