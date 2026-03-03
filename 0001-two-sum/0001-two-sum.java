class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> mapp = new HashMap<>();

        for(int j = 0; j < nums.length; j++){
            int complement = target - nums[j];

            if(mapp.containsKey(complement)){
                return new int[] {mapp.get(complement), j};
            }
            mapp.put(nums[j],j);
        } 
        return new int[] {};
    }
}