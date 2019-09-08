//
//class Kakao2019.Solution4 {
//
//    int waterMount = 0;
//
//    public static void main(String[] args) {
//        Kakao2019.Solution4 solution = new Kakao2019.Solution4();
//        int solution1 = solution.solution(new int[]{0, 2, 0, 1, 3, 1, 2, 0, 1, 0, 2, 0});
//        System.out.println(solution1);
//    }
//
//    public int solution(int[] bricks) {
//        solution(bricks, 0, bricks.length - 1);
//
//        return waterMount;
//    }
//
//    private void solution(int[] bricks, int start, int end) {
//        if (!(start + 1 < end)) {
//            return;
//        }
//
//        int waterHeight = Math.min(bricks[start], bricks[end]);
//        for (int i = (start + 1); i < end; i++) {
//            int gap = waterHeight - bricks[i];
//            if (gap > 0) {
//                waterMount += gap;
//            }
//        }
//
//        int longestIndex = getLongestIndex(bricks, start, end);
//        if ((start == 0) || (end == bricks.length - 1)) {
//            solution(bricks, start, longestIndex);
//            solution(bricks, longestIndex, end);
//        }
//
//
//
//    }
//
//    private int getLongestIndex(int[] bricks, int start, int end) {
//        int longestIndex = start + 1;
//        for (int i = start + 2; i < end; i++) {
//            if (bricks[longestIndex] < bricks[i]) {
//                longestIndex = i;
//            }
//        }
//        return longestIndex;
//    }
//
//
//}
//
//
////class Kakao2019.Solution4 {
////    public static void main(String[] args) {
////        Kakao2019.Solution4 solution = new Kakao2019.Solution4();
////        String solution1 = solution.solution("PM 01:00:00", "AM 01:00:00");
////        System.out.println(solution1);
////    }
////
////    //(AM 00:00:01, AM 00:00:02)
////    public String solution(String start, String end) {
////        //1. 시간을 24시간 계로 변환
////        String startTime24Format = toTime24Format(start);
////        String endTime24Format = toTime24Format(end);
////        //2. 시간차계산
////        String timeGap = caculateTimeGap(startTime24Format, endTime24Format);
////
////        return timeGap;
////    }
////
////    private String caculateTimeGap(String startTime24Format, String endTime24Format) {
////        // 전체를 초단위로 변환
////        int secondGap = Math.abs(toSecond(endTime24Format) - toSecond(startTime24Format));
////
////        // 전체를 포맷으로변경
////        return toTime24FormatFromSecond(secondGap);
////    }
////
////    private int toSecond(String endTime24Format) {
////        String[] timeArray = endTime24Format.split(":");
////        int hour = Integer.parseInt(timeArray[0]);
////        int minute = Integer.parseInt(timeArray[1]);
////        int second = Integer.parseInt(timeArray[2]);
////        int totalSecond = hour * 24 * 60 + minute * 60 + second;
////        return totalSecond;
////    }
////
////    private String toTime24FormatFromSecond(int secondGap) {
////        int hour = secondGap / (24 * 60);
////        secondGap = secondGap % (24 * 60);
////        int minute = secondGap / 60;
////        secondGap = secondGap % 60;
////
////        return String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", secondGap);
////    }
////
////    private String toTime24Format(String time12Format) {
////        //12format : "AM 00:00:02"
////        String[] timeInfos = time12Format.split(" ");
////        String standard = timeInfos[0];
////        String time = timeInfos[1];
////        if (standard.equals("PM")) {
////            time = addTwelveHour(time);
////        }
////        return time;
////    }
////
////    private String addTwelveHour(String time) {
////        String changedTime = changeHour(time, getHour(time) + 12);
////        return changedTime;
////    }
////
////    private String changeHour(String time, int targetHour) {
////        return targetHour + time.substring(2);
////    }
////
////    private int getHour(String time) {
////        return Integer.parseInt(time.split(":")[0]);
////    }
////
////
////}
//
//
////class Kakao2019.Solution4 {
////    public static void main(String[] args) {
////        Kakao2019.Solution4 solution = new Kakao2019.Solution4();
////        System.out.println(solution.solution("aAb"));
////    }
////
////    public String solution(String s) {
////        String lowString = s.toLowerCase();
////        //배열
////        int[] counts = new int['z' - 'a'+1];
////        for (int i = 0; i < lowString.length(); i++) {
////            //a=97
////            counts[lowString.charAt(i)-'a']++;
////            //배열 인덱스 ++
////        }
////        // 배열 최고값 계싼
////        int maxValue = getMaxValue(counts);
////        // 계산된 배열 최고값으로 배열 순회하면서 string build
////
////        return getMaxCountedAlphabet(maxValue, counts);
////    }
////
////    private String getMaxCountedAlphabet(int maxCount, int[] counts) {
////
////        StringBuffer stringBuffer = new StringBuffer();
////        for(int i=0; i<counts.length; i++){
////            if(counts[i]==maxCount){
////                stringBuffer.append(Character.toChars(i+'a'));
////            }
////        }
////        return stringBuffer.toString();
////    }
////
////    private int getMaxValue(int[] counts) {
////        int count = 0;
////        for (int i = 0; i < counts.length; i++) {
////            if (count < counts[i]) {
////                count = counts[i];
////            }
////        }
////        return count;
////    }
////
////    public void print(int[] counts){
////        for(int i=0; i<counts.length; i++){
////            System.out.print(counts[i]+" ");
////        }
////        System.out.println();
////    }
////}