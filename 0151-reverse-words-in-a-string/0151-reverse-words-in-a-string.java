class Solution {
    public String reverseWords(String s) {
       String [] words = s.trim().split("\\s+");

        int f = 0;
        int l = words.length - 1;

        while(f <= l){
            String temp = words[f];
            words[f] = words[l];
            words[l] = temp;

            f++;
            l--;
        }
        return String.join(" ",words);
    }
}