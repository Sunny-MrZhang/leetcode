public class Day03 {


    public static void main(String[] args) {

        String s="ni hao Mr Zhang ";
        System.out.println(reverseWords(s));
    }

    //字符串反转 --每天刷一道leetcode系列！
    public static String reverseWords(String s){
        String [] str=s.trim().split(" ");
        StringBuffer sb=new StringBuffer();
        for (int i=str.length-1;i>=0;i--){

            sb.append(str[i]+" ");
        }
        return sb.toString().trim();

    }
}
