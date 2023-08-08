class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for(int i=0; i<arr.length; i++) {
            answer[i] = arr[i];
        }
        
        for(int j=0; j<queries.length; j++) {
            for(int i=queries[j][0]; i<=queries[j][1]; i++) {
                if(i%queries[j][2]==0) {
                    answer[i] = answer[i] + 1;
                }
                else {
                    answer[i] = answer[i];
                }
            }    
        }
        
        return answer;
    }
}