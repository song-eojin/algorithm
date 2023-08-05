class Solution {
    public int solution(int n, String control) {
        
        for(int i=0; i<control.length(); i++) {
            char flag = control.charAt(i);
            n = (flag=='w'? ++n: (flag=='s'? --n : (flag=='d'? n+10 : n-10)));
        }
        
        return n;
    }
}