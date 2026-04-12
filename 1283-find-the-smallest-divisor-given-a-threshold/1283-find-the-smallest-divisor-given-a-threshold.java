class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = getMax(nums);

        while(low <= high){
            int mid = low + (high- low)/2;

            if(ceiling(nums,threshold,mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean ceiling(int[] nums, int threshold, int div){
        int sum =0;

        for(int i = 0; i < nums.length; i++){
            int element = (nums[i] + div - 1)/div;
            sum = element + sum;
        }
        if(sum <= threshold){
            return true;
        }
        else return false;
    }

    private int getMax(int[] nums){
        int max = nums[0];
        for(int num : nums){
            max = Math.max(max,num);
        }
        return max;
    }
}