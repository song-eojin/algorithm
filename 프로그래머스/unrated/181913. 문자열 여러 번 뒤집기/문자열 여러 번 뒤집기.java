class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);

        for (int[] query : queries) {
            String substring = sb.substring(query[0], query[1] + 1);
            String reversed = new StringBuilder(substring).reverse().toString();
            sb.replace(query[0], query[1] + 1, reversed);
        }
        return String.valueOf(sb);
    }
}