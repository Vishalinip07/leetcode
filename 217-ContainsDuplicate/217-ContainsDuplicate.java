// Last updated: 19/07/2026, 21:06:47
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
           if(set.contains(num)){
            return true;
           }
           set.add(num);
        }
        return false;
    }
}