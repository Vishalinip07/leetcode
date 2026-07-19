// Last updated: 19/07/2026, 21:05:41
class Solution {
    public boolean isSubsequence(String s, String t) {


    // 1 ms beat 100
    int i=0,j=0;
    int n=t.length();
    int m=s.length();
    char ss[]=s.toCharArray();
    char tt[]=t.toCharArray();

    if(m<1)
        return true;

    while(i<n){
        if(tt[i]==ss[j]){
            j++;
        }
        i++;
        
    if(j==m)
        return true;
    }

        return false;
    }
}