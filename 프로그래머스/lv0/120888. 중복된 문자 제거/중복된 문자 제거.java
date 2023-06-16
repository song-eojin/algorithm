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
	    	for (char partOfStr : str.toCharArray()) {
    	 	   if (correctedStrSet.add(partOfStr)) {
        		    strBuilder.append(partOfStr);
        		}
        	}
            return strBuilder.toString();
        }
    }
}