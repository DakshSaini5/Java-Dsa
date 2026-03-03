import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int middle = i + 1;
            int end = nums.length - 1;

            while (middle < end) {

                int sum = nums[i] + nums[middle] + nums[end];

                if (sum == 0) {

                    result.add(Arrays.asList(nums[i], nums[middle], nums[end]));

                    middle++;
                    end--;

                    while (middle < end && nums[middle] == nums[middle - 1]) 
                        middle++;


                    while (middle < end && nums[end] == nums[end + 1]) 
                        end--;
                }
                else if (sum < 0) {
                    middle++;     
                }
                else {
                    end--;        
                }
            }
        }
        return result;
    }
}
