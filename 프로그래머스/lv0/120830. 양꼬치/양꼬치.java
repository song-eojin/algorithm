class Solution {
    public int solution(int n, int k) {
        int answer = n<10 ? (12000*n + 2000*k) : (12000*n + 2000*(k-(n/10)));
        return answer;
    }
}