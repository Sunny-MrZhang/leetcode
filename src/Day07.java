import java.util.Arrays;

public class Day07 {


    public static void main(String[] args) {
        String[] arr={"flower","flow","flight"};
        System.out.println(Arrays.toString(arr));
        String str=longestCommonPrefix(arr);
        System.out.println(str);
    }
    //    最长公共前缀--每天刷一道leetcode算法题系列！
    /*
    *当字符串数组长度为 0 时则公共前缀为空，当字符串数组长度为1时，则公共前缀为strs[0]
     令最长公共前缀 为res，并进行初始化为第一个字符串。
     遍历后面的字符串，依次将其与 为res 进行比较，两两找出公共前缀，最终结果即为最长公共前缀。
     如果查找过程中出现了res为空或者strs[i]为空的情况，则公共前缀为空串，直接返回。
       时间复杂度：O(n)。
    * */

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String str = strs[i];
            if (str.equals("") || res.equals("")) {
                return "";
            }
            int start = 0;
            while (start < res.length() && start < str.length() && str.charAt(start) == res.charAt(start)) {
                start++;
            }
            res = res.substring(0, start);
        }
        return res;
    }
}
