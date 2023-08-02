class Solution {
    public int solution(int[] array) {
        int answer = 0, maxfrequent = 0;
        int[] frequents = new int[1000];

        for (int i = 0; i < array.length; i++) {
            frequents[array[i]]++; // 빈도 ++;

            // 최빈값 구하기
            if (maxfrequent < frequents[array[i]]) { 
                maxfrequent = frequents[array[i]]; 
                answer = array[i];
            }
        }

        // 여러 개인지 판별
        int isDuplicate = 0; 
        for (int m = 0; m < frequents.length; m++) {
            if (maxfrequent == frequents[m]) isDuplicate++;
            if (isDuplicate > 1) answer = -1;
        }

        return answer;    
    }
}