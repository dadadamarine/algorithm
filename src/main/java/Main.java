import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int ASCII_NUBER_ZERO = 48;
    private static final Integer[] REVERSIBLE_NUMBERS = {6, 9};
    private static final int ROOM_NUMBER_MAX = 10;

    public static void main(String[] args) throws IOException {
        String roomNumberStringFormat = br.readLine();
        int setsCount = toSetsCount(roomNumberStringFormat);
        System.out.println(setsCount);
    }


}