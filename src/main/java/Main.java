import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int words= Integer.parseInt(bufferedReader.readLine());
        int wordCount=0;
        for(int i=0; i<words; i++){
            wordCount+=checkWord(bufferedReader.readLine());
        }
        System.out.println(wordCount);

    }

    private static int checkWord(String readLine) {
        boolean[] used = new boolean[27];
        char before = readLine.charAt(0);
        char now = readLine.charAt(0);
        for(int i=1; i<readLine.length(); i++){
            now = readLine.charAt(i);
            if(before==now){
                before=now;
                continue;
            }
            if(before!=now){
                if(used[before-96]==false){
                    used[before-96] = true;
                    before=now;
                    if(i==readLine.length()){
                        return 1;
                    }
                }else{
                    return 0;
                }
            }
        }
        if(used[now-96]==true){
            return 0;
        }
        return 1;
    }
}