import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i=0;
        while(i<arr.length) {
            if(list.size()==0) {
                list.add(arr[i]); ++i;
            } else if(list.size()!=0 && list.get(list.size()-1) < arr[i]) {
                list.add(arr[i]); ++i;
            } else {
                list.remove(list.size()-1);
            }
        }
        
        int[] stk = new int[list.size()];
        for(int j=0; j<list.size(); j++) {
            stk[j] = list.get(j).intValue();
        }
        return stk;
    }
}