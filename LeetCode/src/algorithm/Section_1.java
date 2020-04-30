package algorithm;

/**
 * @author ynz
 * create at 2020-04-27 15:40
 * @description:this is the class for
 **/

public class Section_1 {
    public static void main(String[] args) {
        System.out.println((0+15)/2);//int/int =int (向0取整）
        System.out.println(Math.E*2.0-6*100000000.1);//整形溢出
        System.out.println(true&&false||true&&true);
        System.out.println((1+2.236)/2);//double/int =double
        System.out.println(1+2+3+4.0);//int +double=double
        System.out.println(4.1>4);
        System.out.println(1+2+"3");//int +String=String
    }
    public void Ex1_1_3(int a,int b,int c){//abc是否相等
        if(a==b&&b==c){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
    public void Ex1_1_5(double a,double b){//两个数是否在0和1 之间
        if(a>=0&&a<=1&&b>=0&&b<=1){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
    public void Ex1_1_6(){//切纳波数*15次
        int f=0;
        int g=1;
        for (int i = 0; i <15 ; i++) {
            System.out.println(f);
            f=f+g;
            g=f-g;
        }
    }
    public void Ex1_1_7a(){
        double t = 9.0;
        while(Math.abs(t - 9.0 / t) > .001)
            t = (9.0 / t + t) / 2.0;
        System.out.printf("%.5f\n", t);//保留5位小数

    }
    public void Ex1_1_7b(){
        int sum = 0;
        for(int i = 1; i < 1000; i++)
            for(int j = 0; j < i; j++)
                sum++;
        System.out.println(sum);
    }
    public void Ex1_1_7c(){
        int sum = 0;
        for(int i = 1; i < 1000; i *= 2)
            for(int j = 0; j < 1000; j++)
                sum++;
        System.out.println(sum);
    }

    public void Ex1_1_8(){
        System.out.println('b');
        System.out.println('b' + 'c');//b 和c会先转化成ASCII，b=98，c=99然后相加
        System.out.println((char)('a' + 4));//a先转化成ASCII，a=97，+4 然后再转化成数字为101的字节 e
    }
    public void Ex1_1_9(String aa){
        int a = Integer.parseInt(aa);
        String result = "";

        for(int n = a; n > 0; n /= 2) {
            result = (n % 2) + result;
        }

    }
    public void Ex1_1_20(int n){
        if(n==0){
            return;
        }else {
            Ex1_1_20(n-1);
        }
    }


}
