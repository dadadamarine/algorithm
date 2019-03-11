//import java.io.*;
//import java.util.LinkedList;
//import java.util.List;
//
//public class Main {
//    static final int GEAR_COUNT = 4;
//
//    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//    static Gear[] gears;
//
//    public static void main(String[] args) throws IOException {
//        //init
//        Main main = new Main();
//        gears = main.makeGears();
//        int rotateCount = Integer.parseInt(br.readLine());
//
//        //Play
//        for (int i = 0; i < rotateCount; i++) {
//            String[] input = br.readLine().split(" ");
//            int gearNumber = Integer.parseInt(input[0]); // 1~4
//            int direction = Integer.parseInt(input[1]); // 1 : right , -1: left
//            main.rotate(gearNumber, direction);
//        }
//        br.close();
//        //결과 출력
//        bw.write(main.getResult()+"");
//        bw.close();
//    }
//
//    private void rotate(int gearNumber, int direction) {
//        checkLeft(gearNumber, direction);
//        checkRight(gearNumber, direction);
//        gears[gearNumber].turn(direction);
//    }
//
//    private void checkRight(int gearNumber, int direction) {
//        if (gearNumber >= GEAR_COUNT) {
//            return;
//        }
//
//        if (gears[gearNumber].getRight() == gears[gearNumber + 1].getleft()) {
//            return;
//        }
//        //다를경우 회전
//        if (gears[gearNumber].getRight() != gears[gearNumber + 1].getleft()) {
//            gears[gearNumber + 1].turn(-direction);
//            checkRight(gearNumber + 1, -direction);
//        }
//    }
//
//    private void checkLeft(int gearNumber, int direction) {
//        if (gearNumber <= 1) {
//            return;
//        }
//        if (gears[gearNumber].getleft() == gears[gearNumber - 1].getRight()) {
//            return;
//        }
//        //다를경우 회전
//        if (gears[gearNumber].getleft() != gears[gearNumber - 1].getRight()) {
//            gears[gearNumber - 1].turn(-direction);
//            checkLeft(gearNumber - 1, -direction);
//        }
//    }
//
//    public Gear[] makeGears() throws IOException {
//        Gear[] gears = new Gear[GEAR_COUNT + 1];
//        for (int i = 1; i <= GEAR_COUNT; i++) {
//            gears[i] = new Gear(br.readLine());
//        }
//        return gears;
//    }
//
//    public int getResult() {
//        int result = 0;
//        for (int i = 1; i <= GEAR_COUNT; i++) {
//            result += getScore(i);
//        }
//        return result;
//    }
//
//    private int getScore(int gearCount) {
////        System.out.println(gearCount+"번째기어 : "+ gears[gearCount].edges.toString());
//        if (gears[gearCount].edges.get(0) == 1) {
//            return (int) Math.pow(2, gearCount - 1);
//        }
//        return 0;
//    }
//
//
//    public class Gear {
//        static final int EDGE_COUNT = 8;
//
//        public List<Integer> edges = new LinkedList();
//
//        public Gear(String edgeString) {
//            //시작이 12시가 head
//            for (int i = 0; i < EDGE_COUNT; i++) {
//                //n극 : 0 , s극 : 1
//                edges.add(Character.getNumericValue(edgeString.charAt(i)));
//            }
//        }
//
//        public int getleft() {
//            return edges.get(6);
//        }
//
//        public int getRight() {
//            return edges.get(2);
//        }
//
//        public void turnLeft(int direction) {
//            int temp = edges.get(0);
//            edges.remove(0);
//            edges.add(temp);
//        }
//
//        public void turnRight(int direction) {
//            int temp = edges.get(EDGE_COUNT - 1);
//            edges.remove(EDGE_COUNT - 1);
//            edges.add(0, temp);
//        }
//
//        public void turn(int direction) {
//            if (direction == -1) {
//                this.turnLeft(direction);
//            } else {
//                this.turnRight(direction);
//            }
//        }
//    }
//
//}
//
//
//
