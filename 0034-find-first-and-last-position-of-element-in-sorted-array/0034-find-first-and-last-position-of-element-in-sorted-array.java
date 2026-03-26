class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        if(nums.length == 0) return new int[]{-1,-1};

        int first = lowerBound(nums,target);
        if(first == nums.length || nums[first] != target) return new int[]{-1,-1};
        int last = upperBound(nums,target) - 1;

        return new int[]{first,last};        
    }

    private int lowerBound(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target <= nums[mid]){
                end =  mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    private int upperBound(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end =  mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

}