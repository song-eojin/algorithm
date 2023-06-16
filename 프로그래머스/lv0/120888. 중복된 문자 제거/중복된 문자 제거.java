import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String str) {
        
    	if (str == null || str.isBlank()) {
            String isBlackStr = "빈 문자열입니다.";
            return isBlackStr;
    	}
	    
        else {
        	StringBuilder strBuilder = new StringBuilder();
	    	Set<Character> correctedStrSet = new HashSet<>();
	    	for (char letterOfStr : str.toCharArray()) {
    	 	   if (correctedStrSet.add(letterOfStr)) {
        		    strBuilder.append(letterOfStr);
        		}
        	}
            return strBuilder.toString();
        }
    }
}
