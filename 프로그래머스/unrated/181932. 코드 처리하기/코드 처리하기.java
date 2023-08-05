class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();

        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = isZero(mode) ? 1 : 0;
            } else {
                ret.append(isZero(mode) ? isEven(i) ? code.charAt(i) : "" : !isEven(i) ? code.charAt(i) : "");
            }
        }
        return ret.toString().isEmpty() ? "EMPTY" : ret.toString();
    }
    
		// 현재 mode가 0인지
    private Boolean isZero(int mode) {
        return mode == 0;
    }

		// 값이 짝수인지
    private Boolean isEven(int num) {
        return num % 2 == 0;
    }
}