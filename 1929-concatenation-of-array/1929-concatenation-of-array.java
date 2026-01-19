class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] copy = new int[2*nums.length];
        for(int i = 0; i < nums.length; i++){
            copy[i] = nums[i];
            copy[i + n] = nums[i];
        }
        return copy;
    }
}