class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        // int right = left + 1;

        for(int right = 1; right < nums.length; right++){
            if(nums[left] == 0 && nums[right] !=0 ){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                // right++;
            }
            else if (nums[left] != 0){
                left++;
                // right++;
            }
        }
    }
}