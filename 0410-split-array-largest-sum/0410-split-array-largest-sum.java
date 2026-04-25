class Solution {
    public int splitArray(int[] nums, int k) {
        
        int low = 0, high = 0;

        // define range
        for (int num : nums) {
            low = Math.max(low, num); // max element
            high += num;              // total sum
        }

        // binary search
        while (low < high) {

            int mid = low + (high - low) / 2;

            int sum = 0;
            int parts = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    parts++;
                    sum = num;
                } else {
                    sum += num;
                }
            }

            if (parts > k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}