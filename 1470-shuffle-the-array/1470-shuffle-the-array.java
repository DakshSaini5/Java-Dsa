class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ans = new int[2*n];
        int left = 0;
        int right = n;
        int k = 0;

        while(left < n){
            ans[k] = nums[left];
            k++;
            ans[k] = nums[right];
            k++;

            left++;
            right++;
        }
        return ans;
    }
}