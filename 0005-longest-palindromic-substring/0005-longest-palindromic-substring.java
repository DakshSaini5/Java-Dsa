class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1) return "";
        int start = 0;
        int maxlength= 0;

        for(int i = 0; i < s.length(); i++){
            int len = Expand(s,i,i);
            int len1 = Expand(s,i,i+1);

            int currentMax= Math.max(len,len1);

            if(currentMax > maxlength){
                maxlength = currentMax;
                start = i - (currentMax - 1)/2;
            }
        }
            return s.substring(start, start + maxlength);
    }
        private int Expand(String s, int left, int right){
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }
            return right - left - 1;
        }
    }
