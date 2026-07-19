// Last updated: 19/07/2026, 21:06:02
class Solution {
    public boolean isPowerOfFour(int n) {
         if(n <= 0) return false;
        while(n % 4 == 0) {
            n = n / 4;
        }
        return n == 1;
    }
}