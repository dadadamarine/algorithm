import java.io.*;
import java.util.Arrays;
import java.util.Map;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Main main = new Main();
//        System.out.println(main.solution(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray()));
    }

    public int solution(int[] T) {
        // write your code in Java SE 8
        int winterLength;
        for(winterLength = 1; winterLength<T.length; winterLength++){
            if(isSeperated(winterLength, T)){
                break;
            }
        }
        return winterLength;
    }

    private boolean isSeperated(int winterLength, int[] year) {
        int maxOfWinter =  getMaxOfWinter(Arrays.copyOfRange(year, 0, winterLength));
        int minOfSummer = getLeastOfSummer(Arrays.copyOfRange(year, winterLength, year.length));
        if(maxOfWinter < minOfSummer){
            return true;
        }
        return false;
    }

    private int getLeastOfSummer(int[] summer) {
        int min = summer[0];
        for(int i=1; i<summer.length; i++){
            min = Math.min(min, summer[i]);
        }
        return min;
    }

    private int getMaxOfWinter(int[] winter) {
        int max = winter[0];
        for(int i=1; i<winter.length; i++){
            max = Math.max(max, winter[i]);
        }
        return max;
    }


}
