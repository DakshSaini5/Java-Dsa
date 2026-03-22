class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int Mid = start + (end - start)/2;

            if(target < nums[Mid]){
                end = Mid - 1;
            }     
            else if(target > nums[Mid]){
                start = Mid + 1;
            }

            else {
                return Mid;
            }
        }
        return -1;
    }
}