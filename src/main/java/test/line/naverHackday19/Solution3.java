package test.line.naverHackday19;
import java.util.Arrays;

class Solution3 {

    public int solution(int[] T) {
        int winterLength;
        for (winterLength = 1; winterLength < T.length; winterLength++) {
            if (isSeasonSeperated(winterLength, T)) {
                break;
            }
        }
        return winterLength;
    }

    private boolean isSeasonSeperated(int winterLength, int[] year) {
        int[] winter = Arrays.copyOfRange(year, 0, winterLength);
        int[] summer = Arrays.copyOfRange(year, winterLength, year.length);
        int maxTempratureOfWinter = getMaxTemperature(winter);
        int minTempratureOfSummer = getMinimumTemperature(summer);

        if (maxTempratureOfWinter < minTempratureOfSummer) {
            return true;
        }
        return false;
    }

    private int getMinimumTemperature(int[] season) {
        int min = season[0];
        for (int i = 1; i < season.length; i++) {
            min = Math.min(min, season[i]);
        }
        return min;
    }

    private int getMaxTemperature(int[] season) {
        int max = season[0];
        for (int i = 1; i < season.length; i++) {
            max = Math.max(max, season[i]);
        }
        return max;
    }


}