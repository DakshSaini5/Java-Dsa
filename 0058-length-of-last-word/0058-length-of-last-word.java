class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        char [] ch = s.toCharArray();
        int count = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(!Character.isWhitespace(ch[i])){
                count++;
            }
            else{
                break;
            }
        System.out.println(count);
        }
        return count;
    }
}