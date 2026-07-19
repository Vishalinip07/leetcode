// Last updated: 19/07/2026, 21:08:08
class Solution {
    public List<Integer> grayCode(int n) {
        int size = 1 << n;
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < size; i++) result.add(i ^ (i >> 1));
        return result;
    }
}