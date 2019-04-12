package backjoon;
import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class B2178 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int ROW = 0;
    private static final int COLUMN = 1;
    private static final int GAP_OF_INDEX = 1;

    private static final int[] D_ROW = {1, -1, 0, 0};
    private static final int[] D_COLUMN = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        int[] arrayInfos = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] graph = new int[arrayInfos[ROW]][];
        int[] startLocation = {0, 0};
        for (int i = 0; i < arrayInfos[ROW]; i++) {
            graph[i] = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        }

        int courseCount = bfs(arrayInfos, graph, startLocation);
        System.out.println(courseCount);
    }

    private static int bfs(int[] arrayInfos, int[][] graph, int[] startLocation) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[arrayInfos[ROW]][arrayInfos[COLUMN]];
        int[][] levels = new int[arrayInfos[ROW]][arrayInfos[COLUMN]];
        int[] nowLocation = new int[]{0, 0};

        levels[0][0] = 1;

        queue.add(startLocation);
        visited[startLocation[ROW]][startLocation[COLUMN]] = true;

        while (!queue.isEmpty()) {
            nowLocation = queue.poll();
            if (Arrays.equals(nowLocation, new int[]{arrayInfos[ROW] - GAP_OF_INDEX, arrayInfos[COLUMN] - GAP_OF_INDEX})) {
                break;
            }
            for (int j = 0; j < 4; j++) { // 4번돌동안
                int rowIndex = nowLocation[ROW] + D_ROW[j];
                int columnIndex = nowLocation[COLUMN] + D_COLUMN[j];
                if (rowIndex < 0 || rowIndex >= graph.length || columnIndex < 0 || columnIndex >= graph[0].length) {
                    continue;
                }
                if (graph[rowIndex][columnIndex] == 1 && !visited[rowIndex][columnIndex]) {
                    queue.add(new int[]{rowIndex, columnIndex});
                    visited[rowIndex][columnIndex] = true;
                    levels[rowIndex][columnIndex] = levels[nowLocation[ROW]][nowLocation[COLUMN]] + 1;
                }
            }
        }
        return levels[nowLocation[ROW]][nowLocation[COLUMN]];
    }


}

