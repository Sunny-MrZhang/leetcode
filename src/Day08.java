public class Day08 {


    public static void main(String[] args) {

        int[] arr={3,2,2,3};
        int n=removeElement(arr,3);
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }


    }
   // 移除元素--每天刷一道leetcode算法系列！
    /*
      用两个变量ahead和cur分别代表待存入的位置和已经到达的位置。
      如果nums[ahead] != val，那么进行赋值操作。
      nums[cur] = nums[ahead]，赋值完ahead和cur均右移一位。
      否则仅将ahead右移一位。*/
   public static int removeElement(int[] nums, int val) {
       int cur = 0;
       int ahead = 0;
       while(ahead < nums.length){
           if(nums[ahead] != val){
               nums[cur++] = nums[ahead];
           }
           ahead++;
       }
       return cur;
   }
}
