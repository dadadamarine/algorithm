import java.util.List;
//
//public class Solution {
//    private final int LINE_LENGTH = 300001;
//    public int[] line ;
//    public static void main(String[] args) {
//                Solution solution = new Solution();
//                int solution1 = solution.solution(3, new int[]{1,3,10}, new int[]{5,8,12});
//                System.out.println(solution1);
//            }
//
//    public int solution(int n, int[] starts, int[] ends) {
//        line=new int[LINE_LENGTH];
//        for(int i = 0; i<n; i++){
//            printLine(starts[i], ends[i]);
//        }
//        return getMatchCount();
//    }
//
//
//    private int getMatchCount() {
//        int count = 0;
//        for(int i=1; i< LINE_LENGTH; i++){
//            if(line[i]==1){
//                count++;
////                System.out.print(i+" ");
//            }
//        }
//        return count;
//    }
//
//    private void printLine(int start, int end) {
//        for(int i=start; i<=end-1; i++){
//            line[i]++;
//        }
//    }
//}
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution(5, new int[]{1,2,1,2,1});
//        int solution1 = solution.solution(7, new int[]{3, 2, 3, 4, -1, -2, -3});
        System.out.println(solution1);
    }

    public int solution(int n, int[] v) {
        int sum = Arrays.stream(v).sum();
        int point = v.length;
        int gap = sum;
        for(int i=-1; i<v.length; i++){
            if(i > v.length-i){
                int newGap = Math.abs(sum-2*getSum(v,i+1, v.length-1));
            }
            int newGap = Math.abs(sum-2*getSum(v,0, i));
            if(gap>newGap){
                point=i;
                gap=newGap;
            }
        }
        return point+1;
    }

    private int getSum(int[] v, int start, int end) {
        int sum = 0;
        for(int i=start; i<=end; i++){
            sum+=v[i];
        }
        return sum;
    }

}