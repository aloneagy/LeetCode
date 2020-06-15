package Leetcode_Easy.Week_7;

/**
 * @author ynz
 * create at 2020-06-08 16:46
 * @description:this is the class for
 **/

public class reverseWords {
    public  static String reverseWords(String s) {
        if(s=="") return s;
        String[] s1 = s.split(" ");
        if(s1.length==1){
            return s1[0].trim();
        }
        if(s1.length==0){
            return "";
        }
        String res="";
        for (int i = s1.length-1; i >0; i--) {
            if(s1[i].equals("")){
                continue;
            }
            res+=s1[i].trim()+" ";
        }

        return (res+s1[0].trim()).trim();
    }

    public static void main(String[] args) {
        String s="a good   example";
        reverseWords(s);
    }
}
