class Solution {
    public int[] findErrorNums(int[] nums) {
     HashMap <Integer,Integer> map = new HashMap<>();
    int n1 = nums.length;
    int i = 0;

    while(i < n1){
        int CrIndex = nums[i] - 1;

        if(nums[i] != nums[CrIndex]){
            int temp = nums[i];
            nums[i] = nums[CrIndex];
            nums[CrIndex] = temp;
        }
        else { 
            i++;
        }
    }

    for(i = 0; i < n1; i++){
        if(nums[i] != i+1){
            return new int[]{nums[i], i+1};
        }
    }

        return new int[]{-1,-1};
        }
    }    
    //  List <Integer> list = new List<>(); {USED IN BRUTE FORCE}

    // int count; 
    //  BETTER APPROACH int duplicate = -1;
    // int missing = -1;

    //  for(int num : nums){
    //     map.put(num, map.getOrDefault(num,0)+1);
    //  }

    //  for(int i = 0; i <= nums.length; i++){
    //     if(map.getOrDefault(i,0) == 2){
    //         duplicate = i;
    //     }
    //     if(map.getOrDefault(i,0) == 0){
    //         missing = i;
    //     }
    //   }
    //   return new int[]{duplicate,missing};
    //   }
