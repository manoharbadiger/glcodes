package com.gs.neteng;

import java.util.Scanner;

public class TestBaiscs {

    public static void main(String[] args) {
        int grade = 'B';
        System.out.println(grade);

        String da = 11%2 ==0? "even": "odd";
        System.out.println(da);

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age > 18 && age < 60){
            System.out.println("you are eligible for vote!");
        } else if(age > 60) {
            System.out.println("you can vote in special lane");
        } else {
            System.out.println("please get you age proof with voter id");
        }

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the year : " );
        int year = sc1.nextInt();
        if(year%4 == 0){
            System.out.println("Leap year");
        }else {
            System.out.println("no leap year");
        }

        int num1 = 10;
        int num2 = 12;

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println(num1);
        System.out.println(num2);
        Scanner sc2 = new Scanner(System.in);
        int day = sc2.nextInt();
        switch(day){
            case 1:
                System.out.println("Good day"); break;
            case 2:
                System.out.println("normal day"); break;
            case 3:
                System.out.println("start the day"); break;
            default:
                System.out.println("no day");
        }
    }


}
