class Solution {
    public int splitArray(int[] nums, int k) {
        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();

        while(low < high){
            int mid = low +(high - low)/2;
            int sum = 0;
            int splits = 1;

            for(int n : nums){
                if(sum + n > mid){
                    splits++;
                    sum = n;
                }
                else{
                    sum = sum + n;
                }
            }   
            if(splits <= k) high = mid;
            else low = mid + 1;    
        }
        return low;
    }
}