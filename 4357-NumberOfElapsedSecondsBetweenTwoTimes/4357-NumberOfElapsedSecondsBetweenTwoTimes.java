// Last updated: 19/07/2026, 21:04:15
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int sh = Integer.parseInt(startTime.substring(0,2));
        int sm = Integer.parseInt(startTime.substring(3,5));
        int ss = Integer.parseInt(startTime.substring(6,8));
        int eh = Integer.parseInt(endTime.substring(0,2));
        int em = Integer.parseInt(endTime.substring(3,5));
        int es = Integer.parseInt(endTime.substring(6,8));
        int startSeconds = sh*3600+sm*60+ss;
        int endSeconds = eh*3600+em*60+es;
        return endSeconds - startSeconds;
    }
}