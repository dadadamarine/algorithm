package backjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class B1260 {
    private static final int VISITABLE = 1;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int nodeCount;
    static int lineCount;
    static int startNodeNumber;
    static int[][] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        String[] graphInfos = br.readLine().split(" ");
        nodeCount = Integer.parseInt(graphInfos[0]);
        lineCount = Integer.parseInt(graphInfos[1]);
        startNodeNumber = Integer.parseInt(graphInfos[2]);
        graph = new int[nodeCount + 1][nodeCount + 1];
        for (int i = 1; i <= lineCount; i++) {
            int[] line = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            graph[line[0]][line[1]] = graph[line[1]][line[0]] = 1;
        }
        String dfsOrder = visitDfs(graph);
        String bfsOrder = visitBfs(graph);
        System.out.println(dfsOrder);
        System.out.println(bfsOrder);
    }

    private static String visitDfs(int[][] graph) {
        Stack<Integer> stack = new Stack<>();
        visited = new boolean[nodeCount + 1];
        stack.add(startNodeNumber);
        visited[startNodeNumber] = true;
        StringBuilder dfsOrder = new StringBuilder("" + startNodeNumber).append(' ');
        boolean noWhereToGo;

        while (!stack.isEmpty()) {
            int visitedNode = stack.peek();
            noWhereToGo = true; // 한 노드부터 해서 끝까지 돌았을때, 다시 백트래킹할 포인트가 남아있어야함. 그래서 visited를 peek로 남겨둠.
            for (int i = 1; i <= nodeCount; i++) {
                if (graph[visitedNode][i] == VISITABLE && !visited[i]) {
                    stack.push(i);
                    visited[i] = true; // 방문표시는 큐, 스택에 넣을때 해야 중복이 안생김.
                    dfsOrder.append(i).append(' ');
                    noWhereToGo = false; // 다 방문해서 for문이 안돌경우 , visitedNode를 그때 뺌.
                    break;
                }
            }
            if (noWhereToGo) {
                stack.pop();
            }
        }
        return dfsOrder.toString().substring(0, dfsOrder.toString().length() - 1);
    }

    private static String visitBfs(int[][] graph) {
        Queue<Integer> queue = new LinkedList<>();
        visited = new boolean[nodeCount + 1];
        queue.add(startNodeNumber);
        visited[startNodeNumber] = true;
        StringBuilder bfsOrder = new StringBuilder();

        while (!queue.isEmpty()) {
            int visitNode = queue.poll();
            bfsOrder.append(visitNode).append(' ');

            for (int i = 1; i <= nodeCount; i++) {
                if (graph[visitNode][i] == VISITABLE && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
        return bfsOrder.toString().substring(0, bfsOrder.toString().length() - 1);
    }


}
