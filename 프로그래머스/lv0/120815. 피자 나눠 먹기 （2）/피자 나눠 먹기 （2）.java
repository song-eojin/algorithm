class Solution {
    public int solution(int n) {
        int answer = lcm(n)/6;
        
        return answer;
    }
    public int gcd(int num1, int num2) {
        if (num2==0) return num1;
        return gcd(num2, num1%num2); 
    }
    public int lcm(int number) {
        return 6*number/gcd(6,number);
    }
}