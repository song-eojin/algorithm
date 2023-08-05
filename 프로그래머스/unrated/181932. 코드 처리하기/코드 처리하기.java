class Solution {
    public String solution(String code) {
        int mode = 0;
        String answer = "";
        
        for(int idx=0; idx<code.length(); idx++) {
            char value = code.charAt(idx);
            if(value=='1') {
                mode = 1-mode;
            }
            else if(mode==0 && idx%2==0) {
                answer += value;
            }
            else if(mode==1 && idx%2==1) {
                answer += value;
            }
        }
        
        return answer.length()==0 ? "EMPTY" : answer;
    }
}