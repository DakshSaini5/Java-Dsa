class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            char c1 = t.charAt(i);
        
        int indexofS = s.indexOf(ch);
        int indexofT = t.indexOf(c1);

        if(indexofS != indexofT){
            return false;
        }
    }
        return true;
}
}