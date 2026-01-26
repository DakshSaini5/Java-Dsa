class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];
        int end = nums.length -1;

        int left = 1;
        for(int i = 0; i < nums.length; i++){
            product[i] = left;
            left = left * nums[i];
        }

        int right = 1;
        for(int i = end; i >= 0; i--){
            product[i] = product[i] * right;
            right = right * nums[i];
        }

        return product;
    }
}
