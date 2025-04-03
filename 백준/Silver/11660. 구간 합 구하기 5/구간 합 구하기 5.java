import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입력을 위한 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N: 표 크기, M: 쿼리 수
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 원본 배열 및 누적 합 배열 (1-based 인덱스 사용)
        int[][] arr = new int[N + 1][N + 1];
        int[][] prefixSum = new int[N + 1][N + 1];

        // 표 입력 받기 (1행부터 시작)
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                // 누적합 계산
                prefixSum[i][j] = prefixSum[i - 1][j] + prefixSum[i][j - 1]
                                  - prefixSum[i - 1][j - 1] + arr[i][j];
            }
        }

        // 결과 저장을 위한 StringBuilder 사용
        StringBuilder sb = new StringBuilder();

        // 쿼리 처리
        for (int q = 0; q < M; q++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int sum = prefixSum[x2][y2]
                      - prefixSum[x1 - 1][y2]
                      - prefixSum[x2][y1 - 1]
                      + prefixSum[x1 - 1][y1 - 1];

            sb.append(sum).append("\n");
        }

        // 결과 출력
        System.out.print(sb);
    }
}
