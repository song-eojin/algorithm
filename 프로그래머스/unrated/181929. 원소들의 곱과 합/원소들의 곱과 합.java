class Solution {
    public int solution(int[] num_list) {
        int gob = 1;
        int hab = 0;
        
        for(int i:num_list) {
            gob *= i;
            hab += i;
        }
        
        int answer = gob<(hab*hab) ? 1 : 0;
        
        return answer;
    }
}