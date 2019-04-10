import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    private static final int VISITABLE = 1;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int nodeCount;
    static int lineCount;
    static int startNodeNumber;
    static int[][] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        String[] graphInfos = br.readLine().split(" ");
        System.out.println(bfsOrder);
    }


}