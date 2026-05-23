class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ss = new StringBuilder();
        if(s.isEmpty() || s.length() == 0) return "";

        int start = 0;
        int left  = 0;
        int right = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                left++;
            }
            else if(s.charAt(i) == ')'){
                right++;
            }

            if(left == right){
                ss.append(s.substring(start + 1, i));
                start = i + 1;
            }
        }
        return ss.toString();
    }
}