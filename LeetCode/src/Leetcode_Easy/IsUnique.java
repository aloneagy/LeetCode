package Leetcode_Easy;

/**
 * @author ynz
 * create at 2020-04-26 17:53
 * @description:this is the class for 字符有没有重复
 **/

public class IsUnique {
    public boolean isUnique(String astr) {
        for(int i=0;i<astr.length();i++){
            for(int j=i+1;j<astr.length();j++){
                if(astr.charAt(i)==astr.charAt(j)){
                    return false;
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsUnique a=new IsUnique();
        a.isUnique("abcd");
    }
}
