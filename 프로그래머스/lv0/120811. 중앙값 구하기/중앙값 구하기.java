import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);

        int N = (int) Math.floor(array.length / 2);
        int answer = array[N];

        return answer;
    }
}