import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public int solution(int a, int b, int c, int d) {
        HashMap<Integer, Integer> dice = new HashMap<>(); // Map 생성
				/**
					* 1. dice HashMap Key로 a 저장, Value로 1 저장
					* 2. 이 때, a와 b가 동일할 수도 있기 때문에
					*    b를 Key로 호출해서 HashMap에 이미 존재하는지 확인, 존재한다면 +1 추가
					* 3. 위 주석과 동일한 메커니즘으로 동작하여
					*    최종적으로는 Key(a~d):Value(Count)의 형태로 자료구조가 완성이 됨.
					*/
        dice.put(a, dice.getOrDefault(a, 0) + 1); // 6, 1
        dice.put(b, dice.getOrDefault(b, 0) + 1); // 6, 2
        dice.put(c, dice.getOrDefault(c, 0) + 1); // 6, 3
        dice.put(d, dice.getOrDefault(d, 0) + 1); // 6, 4

				// Map의 key들을 따로 추출하여 List화
        List<Integer> keys = new ArrayList<>(dice.keySet());

        switch (dice.size()) {

            case 1: // 모두 같은 수
                return 1111 * a;

            case 2: // 세 가지 수가 같아서, 서로 다른 두 가지 수가 있는 경우
                if (dice.get(keys.get(0)) == 1 || dice.get(keys.get(1)) == 1) {
                    // 어느쪽 숫자가 3번 나왔는지 확인
                    int p = dice.get(keys.get(0)) == 3 ? keys.get(0) : keys.get(1);
                    int q = dice.get(keys.get(0)) == 1 ? keys.get(0) : keys.get(1);
                    return (int) Math.pow((10 * p) + q, 2);
                }else{
                    // 숫자 2개가 2번씩 나왔으면 구분할 필요가 없음
                    return (keys.get(0) + keys.get(1)) * Math.abs(keys.get(0) - keys.get(1));
                }

            case 3: // 두 가지가 같아서, 서로 다른 세 가지 수가 있는 경우
                int result = 0;
                for (Integer key : dice.keySet()) {

					// 중복되는 케이스인 key 2개 제외시키기
                    if (dice.get(key) != 2) { 

                        if (result == 0) {
                            result = key;
                        } else {
                            return result * key;
                        }
                    }
                }

            case 4: // 모두 다른 경우에는 제일 작은 수 찾기
                Collections.sort(keys);
                return keys.get(0);
        }
        return 0;
    }
}