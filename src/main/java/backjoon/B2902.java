package backjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2902 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int ASCII_NUBER_ZERO = 48;
    private static final Integer[] REVERSIBLE_NUMBERS = {6, 9};
    private static final int ROOM_NUMBER_MAX = 10;

    public static void main(String[] args) throws IOException {
        String longFormat = br.readLine();
        String shortFormat = toShortFormat(longFormat);
        System.out.println(shortFormat);
    }

    private static String toShortFormat(String longFormat) {
        StringBuilder shortFormat = new StringBuilder();
        String[] workArray = longFormat.split("-");
        for (int i = 0; i < workArray.length; i++) {
            shortFormat.append(workArray[i].charAt(0));
        }
        return shortFormat.toString();
    }


}