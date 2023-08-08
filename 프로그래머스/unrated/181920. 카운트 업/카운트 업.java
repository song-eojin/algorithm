class Solution {
    public int[] solution(int start, int end) {
        int N = Math.abs(end - start) + 1;
        
        int[] answer = new int[N];
        answer[0] = start;

        for(int i=1; i<N; i++) {
            answer[i] = ++start;
        }
        
        return answer;
    }
}