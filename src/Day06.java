public class Day06 {


    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,3,4,5,6};
        int n= removeDuplicates(arr);
        System.out.println(n);
        for (int i = 0; i <n ; i++) {

            System.out.print(arr[i]+" ");
        }

    }
    //删除排序数组中的重复项 --每天刷一道leetcode系列！
    /*双指针，如果数组的长度小于2，直接返回数组的长度即可。
     遍历过程中只需要指定两个变量，
     一个是遍历到了哪个位置ahead，
     另一个是最后存放最后无重复数组的最后的位置cur。

     */
    public static int removeDuplicates(int[] nums) {
        assert nums != null;
        if(nums.length < 2){
            return nums.length;
        }
        int cur = 0;
        int ahead = 1;
        while(ahead < nums.length){
            if(nums[ahead] != nums[cur]){
                nums[++cur] = nums[ahead];
            }
            ahead ++;
        }
        return cur+1;

    }


}
