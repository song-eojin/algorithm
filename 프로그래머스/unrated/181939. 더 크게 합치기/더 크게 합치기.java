class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String A = Integer.toString(a);
        String B = Integer.toString(b);

        int int1 = Integer.parseInt(A+B);
        int int2 = Integer.parseInt(B+A);

        if(int1<int2) {
            answer = int2;
        }
        else {
            answer = int1;
        }

        return answer;
    }
}