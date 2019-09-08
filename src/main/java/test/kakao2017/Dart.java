//class Kakao2019.Solution4 {
//    public static final int COUNT = 3;
//
//    public int solution(String dartResult) {
//        int answer = 0;
//        //makeDartResultArr의 배열로 회차로 분리
//        String[] dartResultArr = makeDartResultArr(dartResult);
//
//        // 결과값들을 scoreArr 배열에 저장
//        int[] scoreArr = countScoreArr(dartResultArr);
//        // 회차가 2 ,3인경우에 따라서 분리해서 처리
//        // socreArr을 각각 더해서 n에 저장
//
//
//
//        for(int i=0; i<COUNT; i++){
//            answer+= scoreArr[i];
//        }
//        return answer;
//    }
//
//
//
//
//    public String[] makeDartResultArr(String dartResult){
//        String[] dartResultArr = new String[COUNT];
//        int ResultArrIndex = 0;
//        int start=0;
//        int checkTen=0;
//        for(int i=1; i<dartResult.length(); i++ ){
//            if(dartResult.charAt(i)>=49 && dartResult.charAt(i)<=57){
//                dartResultArr[ResultArrIndex++]=dartResult.substring(start, i);
//                start=i;
//                //System.out.println(dartResultArr[ResultArrIndex-1]);
//            }
//            if(ResultArrIndex>2) break;
//        }
//        dartResultArr[ResultArrIndex] = dartResult.substring(start, dartResult.length());
//        //System.out.println(dartResultArr[ResultArrIndex]);
//
//        return dartResultArr;
//    }
//
//
//    public int[] countScoreArr(String[] dartResultArr){
//        int[] scoreArr=new int[COUNT];
//        int score=0;
//        // 결과값들을 scoreArr 배열에 저장
//        for(int i=0; i<COUNT; i++){
//            scoreArr[i] = makeScore(dartResultArr[i]);
//            int length = dartResultArr[i].length()-1;
//            if(dartResultArr[i].charAt(length)=='#'){
//                scoreArr[i] *= -1;
//            }
//            if(dartResultArr[i].charAt(length)=='*'){
//                if(i>=1){
//                    scoreArr[i-1] *= 2;
//                }
//                scoreArr[i] *= 2;
//            }
//            //System.out.print(scoreArr[i]);
//        }
//        //System.out.println("");
//        return scoreArr;
//        // 회차가 2 ,3인경우에 따라서 분리해서 처리
//    }
//    public int makeScore(String dartResult){
//        int score = Integer.parseInt(dartResult.substring(0,1));
//        for(int i=1; i<dartResult.length(); i++){
//            if(dartResult.charAt(i)=='0'){
//                score *= 10;
//            }
//            if(dartResult.charAt(i)=='S'){
//                score = (int)Math.pow(score, 1);
//                System.out.print(score);
//            }
//            if(dartResult.charAt(i)=='D'){
//                score = (int)Math.pow(score, 2);
//                System.out.print(score);
//            }
//            if(dartResult.charAt(i)=='T'){
//                score = (int)Math.pow(score, 3);
//                System.out.print(score);
//            }
//        }
//        return score;
//    }
//
//}