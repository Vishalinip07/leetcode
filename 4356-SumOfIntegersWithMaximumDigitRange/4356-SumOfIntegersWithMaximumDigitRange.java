// Last updated: 19/07/2026, 21:04:20
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange = -1;
        int sum=0;
        for(int num:nums){
            int temp = num;
            int maxDigit =0;
            int minDigit = 9;
            while(temp>0){
                int digit = temp%10;
                if(digit>maxDigit) maxDigit = digit;
                if(digit<minDigit) minDigit = digit;
                temp/=10;
            }
            int range = maxDigit - minDigit;
            if(range>maxRange){
                maxRange = range;
            }
        }
        for(int num:nums){
            int temp = num;
            int maxDigit = 0;
            int minDigit = 9;
            while(temp>0){
                int digit = temp%10;
                if(digit>maxDigit) maxDigit = digit;
                if(digit<minDigit) minDigit = digit;
                temp/=10;
            }
            if(maxDigit - minDigit ==maxRange){
                sum+=num;
            }
        }
        return sum;
    }
}