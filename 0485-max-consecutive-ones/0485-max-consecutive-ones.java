class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int currentcount = 0;

        for(int i : nums){
            if(i == 1){
                currentcount ++;
                max =  Math.max(max,currentcount);
            }
            else{
                currentcount = 0;
            }
        }
        return max;
    }
}