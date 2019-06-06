package test.line.naverHackday19;

class Solution1 {
    private int DICE_MAX = 6;
    private int SUM_OF_OPPOSITE = 7;
    public int solution(int[] A) {
        int[] CountsForTargetNumber = new int[DICE_MAX];
        for (int i = 0; i < DICE_MAX; i++) {
            CountsForTargetNumber[i] = sumOfCountToMakeAllDieForThisNumber(i, A);
        }
        return minOfArray(CountsForTargetNumber);
    }
    private int minOfArray(int[] answers) {
        int min = answers[0];
        for (int i = 1; i < answers.length; i++) {
            min = Math.min(min, answers[i]);
        }
        return min;
    }
    private int sumOfCountToMakeAllDieForThisNumber(int targetNumber, int[] diceTops) {
        int sumOfCount = 0;
        for (int i = 0; i < diceTops.length; i++) {
            sumOfCount += CountToMakeDieForThisNumber(targetNumber, diceTops[i]);
        }
        return sumOfCount;
    }
    private int CountToMakeDieForThisNumber(int targetNumber, int diceTop) {
        if (isOppositePosition(targetNumber, diceTop)) {
            return 2;
        }
        if (diceTop == targetNumber) {
            return 0;
        }
        return 1;
    }
    private boolean isOppositePosition(int targetNumber, int diceTop) {
        if(targetNumber + diceTop == SUM_OF_OPPOSITE){
            return true;
        }
        return false;
    }
}
