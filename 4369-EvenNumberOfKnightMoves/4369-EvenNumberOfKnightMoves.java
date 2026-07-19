// Last updated: 19/07/2026, 21:04:16
class Solution {
    public boolean canReach(int[] start, int[] target) {
        return (start[0]+start[1])%2==(target[0]+target[1])%2;
    }
}