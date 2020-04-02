import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
public class Day05 {

    public static void main(String[] args) {

        int[] arr = {1, 5, 6, 7};
        int[] tmp=twoSum(arr, 13);
        System.out.println(Arrays.toString(tmp));

    }

    //两数之和 --每天刷一道leetcode系列！
    /* 利用hashMap来减少查询时间
    hashmap的key为某个位置上的值，value为此位置的坐标
    如果target - nums[i]为hashmap的某个key。则找到了两个数的和为target，返回这两个值即可
    如果target - nums[i]不在hashmap的key中。则将其加入hashmap中。*/
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (map.containsKey(value)) {
                return new int[]{map.get(value), i};
            }
            map.put(nums[i], i);
        }
        return null;

    }
}