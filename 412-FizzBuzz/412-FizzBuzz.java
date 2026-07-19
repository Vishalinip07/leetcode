// Last updated: 19/07/2026, 21:05:32
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            if(i%3 ==0 && i%5==0) {
                ans.add("FizzBuzz");
            }
            else if(i%3==0) {
                ans.add("Fizz");
            }
            else if(i%5==0) {
                ans.add("Buzz");
            }
            else {
                ans.add(Integer.toString(i));
            }
        }
        return ans;
    }
}