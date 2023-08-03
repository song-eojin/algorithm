class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String A = Integer.toString(a);
        String B = Integer.toString(b);
        
        int num1 = Integer.parseInt(A+B);
        int num2 = 2*a*b;

        answer = num1>num2? num1:num2;

        return answer;
    }
}