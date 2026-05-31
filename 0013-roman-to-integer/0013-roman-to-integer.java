class Solution {
    public int romanToInt(String s) {
        // 1. Set up our lookup table
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        // 2. Initialize our tracking variables
        int total = 0;
        int last = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            int currentValue = map.get(s.charAt(i));
            if(currentValue >= last){
                total = total + currentValue;
            }
            else{
                total = total - currentValue;
            }
            last = currentValue;
        }       
        return total; 
    }
}