package backjoon;
import java.io.*;
import java.util.Arrays;

public class B14581 {
    private static final int MATRIX_SIZE = 3;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String name = br.readLine();
        String nameTag = getTag(name);
        String fanTag = getTag("fan");

        for (int i= 1; i<=MATRIX_SIZE; i++){
            bw.write(fanTag);
        }
        bw.write("\n");
        bw.write(fanTag);
        bw.write(nameTag);
        bw.write(fanTag);
        bw.write("\n");
        for (int i= 1; i<=MATRIX_SIZE; i++){
            bw.write(fanTag);
        }
        bw.close();
    }

    private static String getTag(String fan) {
        return String.format(":%s:", fan);
    }


}