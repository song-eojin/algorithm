class Solution { //2
    public int solution(int[] numbers) {
        int max = 0;
        int N = numbers.length;
        
        for(int i=0; i<N-1; i++) {
            for(int j=i+1; j<N; j++) {
                int number = numbers[i] * numbers[j];
                if(max < number) max = number;
            }
        }
        
        return max;
    }
}