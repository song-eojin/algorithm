class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder(answer);

        
        for(int i=my_string.length()-1; i>=0; i--) {
            sb.append(my_string.charAt(i));
        }
        
        answer = sb.toString();
        
        return answer;
    }
}