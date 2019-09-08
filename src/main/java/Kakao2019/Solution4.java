package Kakao2019;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution4 {
    private Map<String, Integer> map = new HashMap<>();

    public int[] solution(String[] words, String[] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            Arrays.sort(words);
            answer[i] = getMatchWords(words, queries[i]);
        }
        return answer;
    }

    private int getMatchWords(String[] words, String query) {
        int count = 0;
        if (map.containsKey(query)) {
            return map.get(query);
        }
        for (int i = 0; i < words.length; i++) {
            count += getOneIfMatches(words[i], query);
        }
        map.put(query, count);
        System.out.println(count);
        return count;
    }

    private int getOneIfMatches(String word, String query) {
        if (word.length() != query.length()) {
            return 0;
        }
        String substringQuery;
        String substringWord;
        if (query.charAt(0) == '?') {
            int lastQuestionMarkIndex = query.lastIndexOf('?');
            substringQuery = query.substring(lastQuestionMarkIndex + 1);
            substringWord = word.substring(lastQuestionMarkIndex + 1);
        } else {
            int firstQuestionMarkIndex = query.indexOf('?');
            substringQuery = query.substring(0, firstQuestionMarkIndex);
            substringWord = word.substring(0, firstQuestionMarkIndex);
        }

        if (substringWord.equals(substringQuery)) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        String[] words = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
        String[] queries = {"fro??", "????o", "fr???", "fro???", "pro?"};
        Solution4 solution4 = new Solution4();
        int[] solution1 = solution4.solution(words, queries);
    }

}
