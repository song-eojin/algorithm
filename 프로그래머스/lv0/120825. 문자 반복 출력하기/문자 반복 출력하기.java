class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int N = my_string.length();
        char[] arr = new char[N];
        
        for(int i=0; i<N; i++) {
            arr[i] = my_string.charAt(i);
        }
        
        for(int j=0; j<N; j++) {
            for(int i=1; i<=n; i++) {
                answer += arr[j];   
            }
        }
        
        return answer;
    }
}