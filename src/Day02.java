public class Day02 {
    public static void main(String[] args) {

        String str="vbababac";
        System.out.println(lengthOfLongestSubstring(str));
    }

    //无重复字符的最长子串--每天刷一道leetcode系列！
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int[] tmp = new int[256];
        int maxLen = 0;
        int l = 0;
        int r = 0;

        while (l < s.length()) {
            if (r < s.length() && tmp[s.charAt(r)] == 0) {
                tmp[s.charAt(r++)] = 1;
            } else {
                maxLen = maxLen > (r - l) ? maxLen : (r - l);
                tmp[s.charAt(l++)] = 0;
            }
        }
        return maxLen;
    }
}
