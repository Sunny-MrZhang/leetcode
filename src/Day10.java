import java.util.ArrayList;
import java.util.List;

public class Day10 {

    public static void main(String[] args) {

       List<String> list= letterCombinations("23");
        System.out.println(list);

    }


    //电话号码的字母组合--每天刷一道leetcode算法系列！
   static String[] telMap = {"_","!@#","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    //返回组合结果的数组
    static List<String> res = new ArrayList<String>();

    public  static List<String> letterCombinations(String digits) {

        if(digits == null || digits.length() == 0){
            return res;
        }
        process(digits, "", 0);

        return res;

    }
    private static void process(String digits, String letter, int index){
        //递归的第一步，确定终止条件
        //index记录递归的层次，类似于循环到了哪一层。当index==digits.length()的时候，递归就应该终止
        //letter为每次递归得到的结果
        if(index == digits.length()){
            res.add(letter);
            return;
        }
        String str = telMap[digits.charAt(index)-'0'];
        for(int i = 0; i < str.length(); i++){
            process(digits,letter+str.charAt(i),index+1);
        }
    }

}
