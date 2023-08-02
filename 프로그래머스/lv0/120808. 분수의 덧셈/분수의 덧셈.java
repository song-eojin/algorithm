class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        int gcd = gcd(numer, denom); //최대공약수

        if(numer % gcd == 0 && denom % gcd == 0) {
            System.out.println(gcd);

            answer[0] = numer / gcd;
            answer[1] = denom / gcd;

            System.out.println(answer[0]);
            System.out.println(answer[1]);
        }
        return answer;
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b); //이 부분이 유클리드 호제법의 핵심
    }
}