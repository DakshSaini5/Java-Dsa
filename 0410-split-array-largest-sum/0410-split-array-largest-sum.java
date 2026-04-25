class Solution {
public int splitArray(int[] nums, int k) {
    int start = 0, end = 0;

    for (int num : nums) {
        start = Math.max(start, num); 
        end += num;              
    }

    while (start < end) {
        int mid = start + (end - start) / 2;

        if (canSplit(nums, mid, k)) {
            end = mid;        // valid → try smaller
        } else {
            start = mid + 1;  // invalid → increase
        }
    }

    return start;
}

private boolean canSplit(int[] nums, int mid, int k) {
    int sum = 0;
    int count = 1;

    for (int num : nums) {
        if (sum + num > mid) {
            count++;
            sum = num;
        } else {
            sum += num;
        }
    }

    return count <= k;
}

}
