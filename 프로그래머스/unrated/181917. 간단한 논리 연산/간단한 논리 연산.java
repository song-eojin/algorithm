class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean left = (x1==false && x2==false)? (false) : (true);
        boolean right = (x3==false && x4==false)? (false) : (true);
        
        boolean answer = (left==true && right==true)? (true) : (false);
        return answer;
    }
}