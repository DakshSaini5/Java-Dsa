class Solution {
    public void nextPermutation(int[] nums) {
       int n = nums.length;
       int d = n - 2;

       while(d >= 0 && nums[d] >= nums[d+1]){
        d--;
       }

       if(d >= 0){
        int j = n - 1;
        while(nums[j] <= nums[d]){
            j--;
        }
        int temp = nums[j];
        nums[j] = nums[d];
        nums[d] = temp;
       }
       reverse(nums, d+1, n-1);
    }
    private void reverse(int []nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
