package com.gs.neteng;

public class GLWork2 {
    public static void main(String[] args) {
//        for(int i =1; i <= 10 ; i++){
//            System.out.println("3 X "+ i + " = " + 3*i);

        int i = 8;
        i = i++ + ++i;
        System.out.println(i);

        int c = 5167;
        int num3 = c % 1000;
        int num1 = (c % 1000)/ 100;
        int num2 = (c % 100) / 10;
        int ans = c % 10;

        System.out.println(100 * ans + 10 * num2 + num1);

        int a =0;
        for (; a< 5; a++){
            System.out.println(a);
        }
        System.out.println("value of a: "+ a);
    }

}