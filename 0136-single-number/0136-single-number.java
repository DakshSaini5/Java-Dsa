class Solution {
    public int singleNumber(int[] nums) {
        // int start = 0;
        // int end = start + 1;

        for(int i = 0; i < nums.length; i++){
        boolean unique = true;
            for(int j = 0; j < nums.length; j++){
                if(i != j && nums[i] == nums[j]){
                    unique = false;
                    break;
                }
            }
            if(unique) return nums[i];
        }
        return -1;
    }
}