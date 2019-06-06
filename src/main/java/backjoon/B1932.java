//import java.io.*;
//
//public class Main {
//    public static int[][] triangleArray;
//    public static int[][] triangleSumArray;
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(bufferedReader.readLine());
//        triangleArray = new int[n][n];
//        triangleSumArray = new int[n][n];
//        int result=0;
//
//
//        for(int i=0; i<n; i++){
//            String[] test.line = bufferedReader.readLine().split(" ");
//            for(int k =0; k<i+1; k++){
//                triangleArray[i][k] = Integer.parseInt(test.line[k]);
//            }
//        }
//        triangleSumArray[0][0] = triangleArray[0][0];
//
//
//        for(int i=1; i<n; i++){
//            for(int k=0; k<i+1; k++){
//                checkLeftOrRight(i,k);
//            }
//        }
////        for(int i=0; i<n; i++){
////            for(int k=0; k<n; k++){
////                System.out.print(triangleSumArray[i][k]+" ");
////            }
////            System.out.println("");
////        }
//
//        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
//        for(int i=0; i<n; i++){
//            if(triangleSumArray[n-1][i] > result ){
//                result = triangleSumArray[n-1][i];
//            }
//        }
//        bufferedWriter.write(""+result);
//        bufferedWriter.close();
//    }
//
//    public static void checkLeftOrRight(int row,int column){
//        if(column==0){
//            triangleSumArray[row][column] = calculateRight(row, column);
//            return;
//        }
//        if(column==row){
//            triangleSumArray[row][column] = calculateLeft(row , column);
//            return;
//        }
//        triangleSumArray[row][column] =Math.max(calculateLeft(row , column),calculateRight(row , column));
//        return;
//    }
//
//    public static int calculateLeft(int row, int column){
//        int result=0;
//        result = triangleSumArray[row-1][column-1]+triangleArray[row][column];
//
//        return result;
//    }
//
//    public static int calculateRight(int row, int column){
//        int result=0;
//        result = triangleSumArray[row-1][column]+triangleArray[row][column];
//
//        return result;
//    }
//}
//
