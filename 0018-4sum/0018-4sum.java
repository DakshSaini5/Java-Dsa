import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        if (n < 4) return result;

        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = n - 1; j >= i + 3; j--) {

                if (j < n - 1 && nums[j] == nums[j + 1]) continue;

                int left = i + 1;
                int right = j - 1;

                while (left < right) {

                    long sum = (long) nums[i] + nums[left] + nums[right] + nums[j];

                    if (sum < target) {
                        left++;
                    } 
                    else if (sum > target) {
                        right--;
                    } 
                    else {

                        result.add(Arrays.asList(
                            nums[i],
                            nums[left],
                            nums[right],
                            nums[j]
                        ));

                        left++;
                        right--;

                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }

                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    }
                }
            }
        }

        return result;
    }
}