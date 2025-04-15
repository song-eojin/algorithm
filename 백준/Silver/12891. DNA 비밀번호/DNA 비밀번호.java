import java.io.*;
import java.util.*;

public class Main {
    static int[] required = new int[4]; // A, C, G, T
    static int[] current = new int[4];  // 현재 윈도우 내 개수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 처리 (공백 기준으로 문자열을 자동 분리함)
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        String dna = br.readLine();
        char[] arr = dna.toCharArray();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            required[i] = Integer.parseInt(st.nextToken());
        }

        // 초기 윈도우 (0 ~ p-1)
        for (int i = 0; i < p; i++) {
            addChar(arr[i]);
        }

        int result = 0;
        if (isValid()) result++;

        // 슬라이딩 윈도우
        for (int i = p; i < s; i++) {
            addChar(arr[i]);           // 오른쪽 새 문자 추가
            removeChar(arr[i - p]);    // 왼쪽 문자 제거
            if (isValid()) result++;
        }

        System.out.println(result);
    }

    // A, C, G, T를 인덱스로 맵핑하여 카운트 증가
    static void addChar(char c) {
        switch (c) {
            case 'A': current[0]++; break;
            case 'C': current[1]++; break;
            case 'G': current[2]++; break;
            case 'T': current[3]++; break;
        }
    }

    // 윈도우에서 빠지는 문자 카운트 감소
    static void removeChar(char c) {
        switch (c) {
            case 'A': current[0]--; break;
            case 'C': current[1]--; break;
            case 'G': current[2]--; break;
            case 'T': current[3]--; break;
        }
    }

    // 조건을 만족하는지 확인
    static boolean isValid() {
        for (int i = 0; i < 4; i++) {
            if (current[i] < required[i]) return false;
        }
        return true;
    }
}
