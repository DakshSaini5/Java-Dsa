class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;

        Arrays.sort(nums);

        int count = 1;
        int maxCount = 1;
        int end = 1;

        while(end < nums.length){

            if(nums[end] == nums[end - 1]){
                end++;
                continue;
            }

            if(nums[end] == nums[end-1] + 1){
                count++;
            }
            else{
                count = 1;
            }

            maxCount = Math.max(maxCount, count);
            end++;
        }

        return maxCount;
    }
}