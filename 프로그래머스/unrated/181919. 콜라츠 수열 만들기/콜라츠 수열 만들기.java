import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> nubmers = new ArrayList<>();
        nubmers.add(n);

        while (n != 1) {
            if (n % 2 == 0) n /= 2;
            else n = 3*n+1;

            nubmers.add(n);
        }

        int[] answer = new int[nubmers.size()];
        for (int i = 0; i < nubmers.size(); i++) {
            answer[i] = nubmers.get(i);
        }
        return answer;
    }
}