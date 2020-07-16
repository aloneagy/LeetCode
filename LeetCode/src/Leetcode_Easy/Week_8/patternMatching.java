package Leetcode_Easy.Week_8;

/**
 * @author ynz
 * create at 2020-06-21 23:34
 * @description:this is the class for
 * 你有两个字符串，即pattern和value。 pattern字符串由字母"a"和"b"组成，用于描述字符串中的模式。例如，字符串"catcatgocatgo"匹配模式"aabab"（其中"cat"是"a"，"go"是"b"），该字符串也匹配像"a"、"ab"和"b"这样的模式。但需注意"a"和"b"不能同时表示相同的字符串。编写一个方法判断value字符串是否匹配pattern字符串。
 *
 * 示例 1：
 *
 * 输入： pattern = "abba", value = "dogcatcatdog"
 * 输出： true
 * 示例 2：
 *
 * 输入： pattern = "abba", value = "dogcatcatfish"
 * 输出： false
 * 示例 3：
 *
 * 输入： pattern = "aaaa", value = "dogcatcatdog"
 * 输出： false
 **/

public class patternMatching {
    public boolean patternMatching(String pattern, String value) {
        if(pattern==null || value==null){
            return false;
        }
        int numberA=0;
        int numberB=0;
        for(char c:pattern.toCharArray()){
            if(c=='a'){
                numberA++;
            }else {
                numberB++;
            }
        }
        if(value.length()==0){
            return numberA==0 ||numberB==0;
        }

        for (int i = 0; i < value.length(); i++) {
            int b=value.length()-(i*numberA);
            if(b<0){
                continue;
            }
            int lengthB=0;
            if(numberB==0){
                if(lengthB!=0){
                    continue;
                }
            }else {
                if(lengthB%numberB!=0){
                    continue;
                }
                lengthB=b/numberB;
            }
            String stringA=null;
            String stringB=null;
            if(i==0){
                stringA="";
            }
            if(lengthB==0){
                stringB="";
            }
            int offset=0;
            for(char c:pattern.toCharArray()){
                if(stringA!=null&&stringB!=null){
                    break;
                }
                if(c=='a'){
                    if(stringA==null){
                        stringA=value.substring(offset,offset+i);
                    }
                    offset+=i;
                }
                if(c=='b'){
                    if(stringB==null){
                        stringB=value.substring(offset,offset+lengthB);
                    }
                    offset+=lengthB;
                }
            }
            stringA= stringA==null? "":stringA;
            stringB= stringB==null? "":stringB;
            if(stringA.equals(stringB)){
                return false;
            }
            String expectValue="";
            for(char c :pattern.toCharArray()){
                if(c=='a'){
                    expectValue+=stringA;
                }
                if(c=='b'){
                    expectValue+=stringB;
                }
            }
            if(value.equals(expectValue)){
                return true;
            }
        }
        return false;
    }
}
