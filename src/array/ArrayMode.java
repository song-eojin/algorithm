package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayMode {
    public static int solution(int[] array) {
        int maxCount = 0;
        int index = 0;

        // 반환값 : 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값이 반환

        Map<Integer, Integer> map = new HashMap<>();
        for(int i : array){
            //getOrDefault(Object Key) : index
            int count = map.getOrDefault(i, 0) + 1;
            if(count > maxCount){
                maxCount = count;
                index = i;
            }
            else if(count == maxCount){
                index = -1;
            }
            map.put(i, count);
        }
        return index;
    }


    public static void main(String[] args) {
        int[] randomArray = new int[(int)(Math.random()*150)];
        System.out.println("randomArray.length = " + randomArray.length);
        System.out.println();

        for(int i=0; i<randomArray.length; i++){
            randomArray[i] = (int)(Math.random()*100);
        }
        System.out.println("int[] randomArray = " + Arrays.toString(randomArray));
        System.out.println();

        int index = solution(randomArray);
        if(index!=-1) {
            System.out.println("return " + index + ". 최빈값은 " + randomArray[index] + "입니다.");
        } else {
            System.out.println("return " + index +". 최빈값이 여러 개이거나 없습니다.");
        }
    }
}
