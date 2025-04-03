import java.util.*;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        char[] array_answer = my_string.toCharArray();
        Arrays.sort(array_answer);
        String answer = new String(array_answer);
        return answer;
    }
}