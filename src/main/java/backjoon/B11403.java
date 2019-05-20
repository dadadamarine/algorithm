package backjoon;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class B11403 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static int size;
    private static int[][] graph;


    public static void main(String[] args) throws IOException {
        graph= init();
        int[][] canGoGraph = makeCanGoGraph(graph);
        print(canGoGraph);
    }

    public static int[][] makeCanGoGraph(int[][] graph) {
        int[][] canGoGraph = new int[size][size];
        for(int i=0; i<size; i++){
            Queue<Integer> queue = new LinkedList<>();
            boolean[] visited = new boolean[size];
            queue.add(i);
            while (!queue.isEmpty()){
                Integer poll = queue.poll();
                for(int j=0; j<size; j++){
                    if(graph[poll][j]==1 && !visited[j]){
                        queue.add(j);
                        visited[j]=true;
                        canGoGraph[i][j]=1;
                    }
                }
            }

        }
        return canGoGraph;
    }

    private static void print(int[][] canGoGraph) throws IOException {
       for(int i=0; i<canGoGraph.length; i++){
           for(int j=0; j<canGoGraph[i].length; j++){
               bw.write(canGoGraph[i][j]+" ");
           }
           bw.write("\n");
       }
       bw.close();
    }


    private static int[][] init() throws IOException {
        size = Integer.parseInt(br.readLine());
        int[][] graph = new int[size][];
        for(int i=0; i<size; i++){
            graph[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::new).toArray();
        }
        return graph;
    }

}
