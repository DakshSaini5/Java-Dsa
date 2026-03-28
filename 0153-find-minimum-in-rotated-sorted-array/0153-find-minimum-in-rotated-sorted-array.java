class Solution {
    public int findMin(int[] nums) {
    
        int start = 0; 
        int end = nums.length-1;

        while(start < end){
            int Mid = start + (end-start)/2;

            if(nums[start] == nums[end]) return nums[start]; //edge cases :)

            if(nums[Mid] > nums[end]){
                start = Mid + 1;
            }
            else{
                end = Mid;
            }
        }
        return nums[start];
    }
}