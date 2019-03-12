//import java.io.*;
//import java.util.Deque;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.StringTokenizer;
//
//public class Main {
//    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    public static void main(String[] args) throws IOException {
//        //TODO: 보드정보 등록
//        int frameCount = 0;
//        Board board = new Board(toInt(br.readLine())); // 판의 크기
//        for (int i = 0; i < toInt(br.readLine()); i++) { // 사과개수
//            board.addApple(toNumbers(br.readLine())); // 사과의 위치들
//        }
//
//        //TODO: 커브정보 등록
//        for (int i = 0; i < toInt(br.readLine()); i++) {
//            board.addCurve(br.readLine());
//        }
//        //TODO: 프레임당 게임실행
//        try {
//            while (true) {
//                frameCount++;
//                board.doFrame();
//            }
//        } catch (RuntimeException e) {
//
//        }
//        System.out.println(frameCount);
//
//    }
//
//    public static int toInt(String number) {
//        return Integer.parseInt(number);
//    }
//
//    public static int[] toNumbers(String numberString) {
//        StringTokenizer st = new StringTokenizer(numberString);
//        int[] numbers = {toInt(st.nextToken()), toInt(st.nextToken())};
//        return numbers;
//    }
//}
//
//class Board {
//    static final int APPLE_IDENTITY = 1;
//
//    static final int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}}; // 동, 남, 서 , 북 순서
//
//    int[][] cordinates;
//    Deque<int[]> snake;
//    LinkedList<String> curves; // key value로 리팩토링하기
//    int direction;
//
//
//    public Board(int size) {
//        cordinates = new int[size + 1][size + 1];
//
//        snake = new LinkedList<>();
//        curves = new LinkedList<>();
//        direction = 0; // 동쪽
//    }
//
//    private int[] getHeadCordinate(int[] head, int direction) {
//        return new int[]{ head[0]+ directions[direction][0], head[1]+ directions[direction][1] };
//    }
//
//    public void doFrame() {
//
//        //TODO: 방향전환
//        //TODO: 뱀 머리 이동
//
//
//
//        int[] newHead = getHeadCordinate(snake.peekFirst(),direction);
//        //todo : 충돌감지
//        if(snake.contains(newHead)){
//            throw new RuntimeException("몸끼리 충돌");
//        }
//        if(newHead[0] <= 0 || newHead[1] <= 0){
//            throw new RuntimeException("좌 상 벽에 충돌");
//        }
//        if(newHead[0]>cordinates.length || newHead[1]>cordinates.length){
//            throw new RuntimeException("우 하 벽에 충돌");
//        }
//        snake.addFirst(newHead);
//
//        //todo: 뱀의머리에 사과가있는지에따라 꼬리 처리
//        if (!(cordinates[newHead[0]][newHead[1]]==APPLE_IDENTITY)){
//            snake.removeLast();
//        }
//
//        return;
//    }
//
//    public void addApple(int[] apples) {
//        cordinates[apples[0]][apples[1]] = APPLE_IDENTITY;
//    }
//
//    public void addCurve(String curve) {
//        curves.add(curve);
//    }
//}