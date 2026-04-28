class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArr = merge(nums1,nums2);
        int n = mergedArr.length;

        if(n % 2 == 1){
            return mergedArr[n/2];
        }
        else{
            return (mergedArr[n/2] + mergedArr[n/2-1]) / 2.0;
        }
    }

    private int[] merge(int [] a, int [] b){
        int [] res = new int[a.length + b.length];
        int i = 0; 
        int j = 0;
        int k = 0;

        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                res[k] = a[i];
                k++;
                i++;
            }
            else{
                res[k] = b[j];
                k++;
                j++;
            }
        }
        while(i < a.length) res[k++] = a[i++];
        while(j < b.length) res[k++] = b[j++];

        return res;
    }
}