package backjoon;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class B3190 {
    public Gear[] gears = new Gear[4];

    public static void main(String[] args) {
    }

    public class Gear{
        Deque<Integer> magnetList;

        public Gear(String magnets){
            magnetList= new LinkedList<>(magnets.chars().mapToObj(Character::getNumericValue).collect(Collectors.toList()));
        }

        public void turnRight(){
            magnetList.addFirst(magnetList.getLast());
        }
        public void turnLeft(){
            magnetList.addLast(magnetList.getFirst());

        }

    }
}
