public class Day13 {

    public static void main(String[] args) {
        int[] arr={2,3,1,1,4};
        System.out.println(jump(arr));
    }
    //跳跃游戏--每天刷一道leetcode算法系列！

    /*我们在跳的时候会考虑到下一步
    * 用变量right表示本次能到达的最远的位置。 [2,3,1,1,4]
    * 用变量maxPos表示下次能到达的最远的位置。
    * 则在本位置到right此轮循环中maxPos的变化规律为max(maxPos,nums[i] + i)*/
    public static int jump(int[] nums) {
        int cnt = 0;
        if (nums == null || nums.length == 0) {
            return cnt;
        }
        int len = nums.length;
        int maxPos = 0; //下次最远能到达的位置
        int right = 0;   //本次次最远能到达的位置
        for (int i = 0; i < len - 1; i++) {
            maxPos = (nums[i] + i) > maxPos ? (nums[i] + i) : maxPos;
            if (i == right) {
                cnt++;
                right = maxPos;
            }

        }
        return cnt;
    }
}
