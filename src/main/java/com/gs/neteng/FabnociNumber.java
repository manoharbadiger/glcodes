package com.gs.neteng;

import java.util.Scanner;

public class FabnociNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int num1 = 1;
        int num2 = 1;
        System.out.print(num1+","+num2+",");
        for (int i = 0; i < count - 2; i++) {
            int sum = num1 + num2;
            num2 = num1;
            num1 = sum;
            System.out.print(sum+",");
        }

    }
}
