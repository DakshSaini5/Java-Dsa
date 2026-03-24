class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums);
    }

    private int[] mergeSort(int[] nums){

        if(nums.length <=1) return nums;

        int mid = nums.length/2;
        int[] left = Arrays.copyOfRange(nums,0,mid);
        int[] right = Arrays.copyOfRange(nums, mid, nums.length);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left,right);
    }

    private int[] merge(int[] left, int[] right){
        int i = 0;
        int j = 0; 
        int k = 0;

        int[] arr = new int[left.length + right.length];

        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        
        while(i < left.length){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            arr[k] = right[j];
            j++;
            k++;
        }
        return arr;
    }
}