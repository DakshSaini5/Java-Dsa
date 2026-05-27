class Solution {
    public String reverseWords(String s) {
      String [] words = s.trim().split("\\s+");

      int first = 0;
      int last = words.length - 1;

      while(first <= last){
        String temp = words[first];
        words[first] = words[last];
        words[last] = temp;

        first++;
        last--;
      }
      return String.join(" ",words);
    }
}