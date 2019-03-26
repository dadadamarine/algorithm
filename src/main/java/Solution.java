import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
    private int ticketNumber;
    boolean isUsed = false;
    List<String> successer = new ArrayList<>();
    Date latest;
    String latestUser;

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Solution solutionClass = new Solution();
        String[] input = {"woni request 09:12:29", "brown request 09:23:11", "brown leave 09:23:44", "jason request 09:33:51", "jun request 09:33:56", "cu request 09:34:02"};
        System.out.println(solutionClass.solution(10, input));
    }

    public List<String> solution(int ticket, String[] logs) throws ParseException {
        ticketNumber = ticket;
        for(int i=0; i<logs.length; i++){
            readLog(logs[i]);
        }
        successer.add(latestUser);
        Collections.sort(successer);
//        return successer.toArray(new String[0]);
        return successer;
    }

    private void readLog(String log) throws ParseException {
        String[] infos = log.split(" ");
        String user = infos[0];
        String type = infos[1];
        Date now = new SimpleDateFormat("HH:mm:ss").parse(infos[2]);
        if(latest==null){
            latest = now;
            latestUser=user;
            return;
        }
        System.out.println((now.getTime()-latest.getTime())/1000);

        if(((now.getTime()-latest.getTime())/1000>=60) && !latestUser.equals("") ){
            successer.add(latestUser);
        }

        if(type.equals("leave")){
            isUsed=false;
            latestUser="";
            return;
        }

        if(type.equals("request")){
            if(now.getTime() - latest.getTime() < 60){
                return;
            }
            latest = now;
            latestUser = user;
        }
    }

}