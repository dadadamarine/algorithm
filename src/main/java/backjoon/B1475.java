package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1475 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int ASCII_NUBER_ZERO = 48;
    private static final Integer[] REVERSIBLE_NUMBERS = {6, 9};
    private static final int ROOM_NUMBER_MAX = 10;

    public static void main(String[] args) throws IOException {
        String roomNumberStringFormat = br.readLine();
        int setsCount = toSetsCount(roomNumberStringFormat);
        System.out.println(setsCount);
    }

    private static int toSetsCount(String roomNumberStringFormat) {
        int[] usingInfo = toUsingInfos(roomNumberStringFormat);
        return calculateSetsCount(usingInfo);
    }

    private static int[] toUsingInfos(String roomNumberStringFormat) {
        int[] usingInfo = new int[10];
        for (int i = 0; i < roomNumberStringFormat.length(); i++) {
            usingInfo[roomNumberStringFormat.charAt(i) - ASCII_NUBER_ZERO]++;
        }
        return mergeReversibleNumbers(usingInfo);
    }

    private static int[] mergeReversibleNumbers(int[] usingInfo) {
        usingInfo[6] += usingInfo[9];
        usingInfo[9] = 0;
        return usingInfo;
    }

    private static int calculateSetsCount(int[] usingInfo) {
        int maxUsingNumber = maxUsingNumber(usingInfo);
        int maxUsingCount = maxUsingCount(usingInfo);
        if (Arrays.asList(REVERSIBLE_NUMBERS).contains(maxUsingNumber)) {
            return (int) Math.ceil(maxUsingCount / 2.0);
        }
        return maxUsingCount;
    }

    private static int maxUsingCount(int[] usingInfo) {
        int maxCount = usingInfo[0];
        for (int i = 1; i < ROOM_NUMBER_MAX; i++) {
            maxCount = Math.max(maxCount, usingInfo[i]);
        }
        return maxCount;
    }

    private static int maxUsingNumber(int[] usingInfo) {
        int maxUsingNumber = 0;
        for (int i = 1; i < ROOM_NUMBER_MAX; i++) {
            if (usingInfo[maxUsingNumber] < usingInfo[i]) {
                maxUsingNumber = i;
            }
        }
        return maxUsingNumber;
    }

}