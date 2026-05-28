class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1) return "";
        
        int start = 0;
        int end = 0;

        for(int i = 0; i < s.length(); i++){
            int left = i;
            int right = i;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }

            int oddlength = right - left - 1;
            if(oddlength > end - start){
                start = left + 1;
                end = right - 1;
            }

            left = i;
            right = i+1;
             while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }
            int evenlength = right - left - 1;
            if(evenlength > end - start){
                start = left + 1;
                end = right - 1;
            }
        }
        return s.substring(start,end + 1);
    }
}