class Solution {
    public int solution(int n) {
        int answer = 0;
        double b = 1.0;
        
        for(int a=1; a<=Math.sqrt(n); a++) {
            b = (double)n/a;
            if(a<b && b== Math.floor(b)) answer = answer+2;
            if(a==b) answer++;
        }    
        
        return answer;
    }
}