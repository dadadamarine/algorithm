package backjoon;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class B2750 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int numbers;
    static ArrayList<Integer> arrayList= new ArrayList<>();
    public static void main(String[] args) throws IOException {
        init();
        sort();
        bw.write(getResult());
        bw.close();
    }

    private static String getResult() {
        StringBuilder sb = new StringBuilder();
        for(int i= 0; i < arrayList.size(); i++){
            sb.append(arrayList.get(i)+"\n");
        }
        return sb.toString();
    }

    private static void sort() {
        Collections.sort(arrayList);
    }

    private static void init() throws IOException {
        numbers = Integer.parseInt(br.readLine());
        for(int i=0; i<numbers; i++){
            arrayList.add(Integer.parseInt(br.readLine()));
        }
    }

}


