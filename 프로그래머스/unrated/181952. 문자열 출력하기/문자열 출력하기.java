import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.println("문자열을 입력해주세요 ! ");
        String str = br.readLine();

        bw.newLine();
        bw.write("문자열 출력 : " + str);

        bw.flush();
        br.close();
        bw.close();

    }
}
