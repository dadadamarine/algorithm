package practice;
import java.util.*;

public class thread {
    public ArrayList<Integer> mList = new ArrayList<>();

    public static void main(String[] agrs) throws InterruptedException {
        thread syncblock1 = new thread();
        System.out.println("Test start!");
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                syncblock1.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int j = 0; j < 10000; j++) {
                syncblock1.add(j);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(syncblock1.mList.size());
        System.out.println(syncblock1.mList.toString());
    }

    public void add(int val) { /* * Code for synchronization is not needed * */
        synchronized (this ){
            if (!mList.contains(val)) {
                mList.add(val);
            }
        }
    }
}
