class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;

        for(int w : weights){
            low = Math.max(low,w);
            high += w;
        }

        while(low <= high){
            int mid = low + (high - low)/2;

            if(canShip(weights,days,mid)){
                high = mid - 1;
            }
            else{ 
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean canShip(int[] weights, int days, int shipCap){
        int sum = 0;
        int day = 1;

        for(int i = 0; i < weights.length; i++){
            int capacity = weights[i] + sum;
            if(capacity <= shipCap){
                sum = capacity;
            }
            else{
                day++;
                sum = weights[i];
                if(day > days){
                    return false;
                }
            }
        }
        return true;
    }
    
}