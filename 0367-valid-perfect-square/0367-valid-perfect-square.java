class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 0;
        int end = num;

        while(start <= end){
            long mid = start + (end - start)/2;
            long square = mid * mid;

            if(square == num){
                return true;
            }
            else if(square < num){
                start =(int) mid + 1;
            }
            else{
                end =(int) mid - 1;
            }
        }
        return false;
    }
}