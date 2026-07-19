// Last updated: 19/07/2026, 21:07:31
class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int num:nums){
            result^=num;
        }
        return result;
    }
}