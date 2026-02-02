class Solution {
    public boolean isPalindrome(int x) {
        // negative numbers are not palindrome

        if (x < 0) {
            return false;
        }

        int number = x;
        int reverse = 0;

        while (number > 0) {
            int digits = number % 10;
            reverse = reverse * 10 + digits;
            number = number / 10;

        }
        return x == reverse;
    }
}
