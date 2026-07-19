// Last updated: 19/07/2026, 21:06:18
class Solution {
    public void moveZeroes(int[] nums) {
        int lastnonzerofoundat = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] !=0){
                nums[lastnonzerofoundat++] = nums[i];
            }
        }
        for(int i = lastnonzerofoundat; i<nums.length; i++){
            nums[i] =0;
        }
    }
}