package Kakao2019;

import java.util.*;

class Solution1 {
    private Queue<Integer> queue = new PriorityQueue<>();

    public int solution(String s) {
        for (int i = 1; i <= s.length(); i++) {
            enqueCompressedStringSize(i, s);
        }
        int answer = queue.poll();

        return answer;
    }

    private void enqueCompressedStringSize(int arg, String s) {
        String compressedString = compress(arg, s);
        queue.offer(compressedString.length());
    }

    private String compress(int arg, String s) {
        List<Fragment> list = new ArrayList<>();
        for (int start = 0; start < s.length(); start += arg) {
            if(start+arg > s.length()){
                list.add(new Fragment(s.substring(start)));
                continue;
            }

            Fragment fragment = new Fragment(s.substring(start, start + arg));

            if(list.isEmpty()){
                list.add(fragment);
                continue;
            }

            Fragment lastFragment = list.get(list.size()-1);

            if(fragment.equals(lastFragment)){
                lastFragment.countUp();
            }else{
                list.add(fragment);
            }
        }
        return toCompressedString(list);
    }

    private String toCompressedString(List<Fragment> list) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<list.size(); i++){
            Fragment fragment = list.get(i);
            if(fragment.getCount()!=1){
                sb.append(fragment.count);
            }
            sb.append(fragment.getValue());
        }
        return sb.toString();
    }

    static class Fragment {

        private int count;

        private String value;

        public int getCount() {
            return count;
        }

        public String getValue() {
            return value;
        }

        public void countUp(){
            count+=1;
        }

        public Fragment(String value) {
            count=1;
            this.value = value;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Fragment fragment = (Fragment) o;
            return Objects.equals(value, fragment.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }
    }

    public static void main(String[] args){
        Solution1 solution1 =new Solution1();
        int result = solution1.solution("ababcdcdababcdcd");
        System.out.println(result);
    }
}