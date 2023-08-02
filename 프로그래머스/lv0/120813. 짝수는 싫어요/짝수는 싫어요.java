import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int oddsLength = 0;
        int oddsValue = 1;

        if(n % 2 == 0) oddsLength = n/2;
        else oddsLength = n/2 + 1;

        int[] odds = new int[oddsLength];        

        for(int i=0; i<odds.length; i++){
            odds[i] = oddsValue;
            oddsValue = oddsValue + 2;
        }

        return odds;
    }
}