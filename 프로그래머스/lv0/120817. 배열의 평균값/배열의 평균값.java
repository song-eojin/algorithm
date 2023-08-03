class Solution {
    public double solution(int[] numbers) {
        int N = numbers.length;
        int sum = 0;
        double answer = 0;
        
        for(int i=0; i<N; i++) {
            sum += numbers[i];
        }
        
        answer = (double)sum/N;
        
        return answer;
    }
}