import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    
        // 빠른 입력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // S의 크기
        int m = Integer.parseInt(st.nextToken()); // 검사할 문자열 수

        String[] sSet = new String[n];
        for (int i = 0; i < n; i++) {
            sSet[i] = br.readLine();
        }

        // 정렬해야 이분 탐색 가능
        Arrays.sort(sSet);

        int count = 0;
        for (int i = 0; i < m; i++) {
            String query = br.readLine();
            if (binarySearch(sSet, query)) {
                count++;
            }
        }

        System.out.println(count);
    }

    // 이분 탐색 함수
    public static boolean binarySearch(String[] arr, String target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = arr[mid].compareTo(target);

            if (cmp == 0) return true;
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }

        return false;
    }
}
