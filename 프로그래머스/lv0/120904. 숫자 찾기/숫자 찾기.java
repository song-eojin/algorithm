class Solution {
    public int solution(int num, int k) {
                int answer = 0;

        int up=1; 
        while(num > 0) {
            if(num % 10 == k) {
                answer = up;
            }
            ++up;

            //4) 확인하고 차포 떼면서 돌기
            num /= 10;
        }

        //5) 아무것도 없으면 -1 을 return 하고, 숫자를 찾으면 그 숫자가 있는 자리 수를 return 하는 solution 함수
        return answer == 0? -1 : up - answer;
	}//method
}//class