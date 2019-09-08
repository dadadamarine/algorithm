package Kakao2019;

class Solution3 {
    private int keySize;
    private int lockSize;

    public boolean solution(int[][] key, int[][] lock) {
        keySize = key.length;
        lockSize = lock.length;

        //todo : rotate해서 4번체크
        //todo : 한 로테마다, key를 대보면서 lock돌아다니기. 그중 lock전체가 1되는 경우가 있으면 성
        try {
            validCheck(key,lock);
            key= rotate90(key);
            validCheck(key, lock);
            key= rotate90(key);
            validCheck(key, lock);
            key= rotate90(key);
            validCheck(key, lock);
        } catch (CustomException e) {
            return true;
        }
        return false;
    }


    private void validCheck(int[][] keyArray, int[][] lock) {
        for (int i = 0 - keySize + 1; i < lockSize + keySize; i++) {
            for (int j = 0 - keySize + 1; j < lockSize + keySize; j++) {
                int[][] lockSizeKeyArray = toLockSizeKeyArray(keyArray, i, j);
                tryKeyToLock(lockSizeKeyArray, lock);
            }
        }

    }

    private int[][] toLockSizeKeyArray(int[][] keyArray, int xIndex, int yIndex) {
        int[][] lockSizeKeyArray = new int[lockSize][lockSize];
        for (int i = 0; i < lockSize; i++) {
            for (int j = 0; j < lockSize; j++) {
                try {
                    int i1 = keyArray[i - xIndex][j - yIndex];
                    if (i1 == 1) {
                        lockSizeKeyArray[i][j] = i1;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {

                }
            }
        }
        return lockSizeKeyArray;
    }

    private void tryKeyToLock(int[][] lockSizeKeyArray, int[][] lock) {
        //다 더해보고 맞을경우 예외던지기
        for (int i = 0; i < lockSize; i++) {
            for (int j = 0; j < lockSize; j++) {
                if (lockSizeKeyArray[i][j] + lock[i][j] != 1) {
                    return;
                }
            }
        }
        throw new CustomException("오 성공");
    }

    private int[][] rotateArray(int[][] key) {
        int[][] rotatedArray = new int[keySize][keySize];
        for (int i = 0; i < keySize; i++) {
            for (int j = 0; j < keySize; j++) {
                rotatedArray[j][keySize - 1 - i] = key[i][j];
            }
        }
        return rotatedArray;
    }


    public int[][] rotate90(int[][] key) {
        int[][] rotatedKey = new int[keySize][keySize];
        int n = key.length;
        for (int i = 0; i < key.length; i++) {
            for (int j = 0; j < key[0].length; j++) {
                rotatedKey[i][j] = key[n - j - 1][i];
            }
        }
        return rotatedKey;
    }

    class CustomException extends RuntimeException {

        public CustomException() {
        }

        public CustomException(String message) {
            super(message);
        }

    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();

        boolean solution1 = solution3.solution(
                new int[][]{{0, 0, 0}, {1, 0, 0}, {0, 1, 1}},
                new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}});
        System.out.println(solution1);
    }
}
