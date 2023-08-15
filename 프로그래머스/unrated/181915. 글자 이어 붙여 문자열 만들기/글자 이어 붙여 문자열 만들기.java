class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char[] temp = new char[my_string.length()];
        
        for(int i=0; i<my_string.length(); i++) {
            temp[i] = my_string.charAt(i);
        }
        
        for(int i=0; i<index_list.length; i++) {
            answer += temp[index_list[i]];
        }
        
        return answer;
    }
}