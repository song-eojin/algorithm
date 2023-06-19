import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(String[] strArray1, String[] strArray2) {
        
        List<String> listedStr1 = new ArrayList<String>(Arrays.asList(strArray1));    
        int answer = 0;
    
        for(String containStr2 : strArray2) {
            if(listedStr1.contains(containStr2)) {
                answer++;
            }
        }
        
        return answer;
    }
}