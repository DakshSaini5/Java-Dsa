class Solution {
    public void reverseString(char[] s) {
        revStr(s);
    }

    private void revStr(char [] s){
        int h = 0;
        int l = s.length - 1;
        
        while(h <= l){
            char temp = s[h];
            s[h] = s[l];
            s[l] = temp;
            h++;
            l--;
        }
    }
}