class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(char ch : s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        List <Character> lst = new ArrayList<>(mp.keySet());
        lst.sort((a,b) ->mp.get(b) - mp.get(a));

        StringBuilder st = new StringBuilder();

        for(char ch : lst){
            int freq = mp.get(ch);

            while(freq-- > 0){
                st.append(ch);
            }
        }
        return st.toString();
    }
}