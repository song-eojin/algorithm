package array;

import com.sun.source.tree.NewArrayTree;

import java.util.*;

/*프로그래머스 최댓값 만들기(1)*/
//배열의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return 하는 solution 함수 만들기
public class Maximum {
    public static void main(String[] args) {
        System.out.println("위 배열의 원소 중 두 개를 곱해 만들 수 있는 최댓값은 " + solution(randomArray()) + " 입니다.");
    }

    public static int[] randomArray(){
        int[] randomArray = new int[(int)(Math.random()*8 +2)];
        for(int i=0; i<randomArray.length; i++){
            randomArray[i] = (int)(Math.random()*100);
        }
        System.out.println("int[] randomArray = " + Arrays.toString(randomArray));
        System.out.println("randomArray.length = " + randomArray.length);
        System.out.println();

        return randomArray;
    }

    public static int solution(int[] randomArray){
        List<Integer> multiplyList = new ArrayList();

        for(int i=0; i<randomArray.length; i++){
            for(int j=i; j<randomArray.length; j++) {
                if (i!=j) {
                    int multiValue = randomArray[i] * randomArray[j];
                    System.out.printf("randomArray[%s] * randomArray[%s] = %s\n", i, j, multiValue);

                    multiplyList.add(multiValue);
                }
            }
        }
        System.out.println();

        int answer=0;
        for (int multiValue : multiplyList){
            if(answer<multiValue){
                answer=multiValue;
            }
        }

        return answer;
    }
}