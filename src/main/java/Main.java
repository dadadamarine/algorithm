import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    private static final int STUDENTS = 30;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String token;
        int size1 = getSize(br.readLine());
        token = br.readLine();
        int size2 = getSize(br.readLine());
        bw.write(""+calculate(size1,token,size2));
        bw.close();
    }

}