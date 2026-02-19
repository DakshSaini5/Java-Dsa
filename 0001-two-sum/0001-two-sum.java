class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> mapp = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if(mapp.containsKey(complement)){
                return new int[] {mapp.get(complement), i};
            }
            mapp.put(nums[i],i);
        } 
        return new int[] {};
    }
}