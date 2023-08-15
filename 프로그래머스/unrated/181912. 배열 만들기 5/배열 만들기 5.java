import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int number = 0;
        List<Integer> numbers = new ArrayList<>();
        
        for(int i=0; i<intStrs.length; i++) {
            number = Integer.parseInt(intStrs[i].substring(s, s+l));
            
            if(k<number) {
                numbers.add(number);     
            }
        }
        
        int[] answer = new int[numbers.size()];
        for(int i=0; i<numbers.size(); i++) {
            answer[i] = numbers.get(i);
        }
        
        return answer;
    }
}