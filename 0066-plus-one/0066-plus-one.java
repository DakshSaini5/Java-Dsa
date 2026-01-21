class Solution {
    public int[] plusOne(int[] digits) {
        int start = digits.length - 1; 

        for(int i = start; i >= 0; i--){
            if(digits[i] < 9){
                digits[i] = digits[i] + 1;
                return digits;
            }
            digits[i]= 0;
    }
        int [] newArr = new int[digits.length+1];
        newArr[0] = 1;
        return newArr;
    }
}