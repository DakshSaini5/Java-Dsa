class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int[] arr = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {

                    boolean exist = false;
                if (nums1[i] == nums2[j]) {


                    // ONLY check, do not add here
                    for (int z = 0; z < k; z++) {
                        if (arr[z] == nums1[i]) {
                            exist = true;
                            break;
                        }
                    }

                    // add ONLY once, after checking
                    if (!exist) {
                        arr[k] = nums1[i];
                        k++;
                    }

                    break; // stop checking nums2
                }
            }
        }

        return Arrays.copyOf(arr, k);
    }
}
