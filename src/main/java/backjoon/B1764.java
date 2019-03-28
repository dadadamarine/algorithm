package backjoon;
import java.io.*;
import java.util.*;

public class B1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inputNumbers = br.readLine().split(" ");
        int notListenCount = Integer.parseInt(inputNumbers[0]);
        int notSeeCount = Integer.parseInt(inputNumbers[1]);
        Set<String> set = new HashSet<>();
        List<String> answers = new ArrayList<>();
        for (int i = 0; i < notListenCount; i++) {
            set.add(br.readLine());
        }
        for(int i=0; i< notSeeCount; i++){
            String input=br.readLine();
            if(set.contains(input)){
                answers.add(input);
            }
        }
        bw.write(""+answers.size());
        Collections.sort(answers);
        for(String answer:answers){
            bw.write("\n"+answer);
        }
        bw.close();
    }

}