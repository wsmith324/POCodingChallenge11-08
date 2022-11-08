package com.revature.harshad;

public class Main {
    public static void main(String[] args) {
        System.out.println("Value 75 returns " + isHarshad(75));
        System.out.println("Value 171 returns " + isHarshad(171));
        System.out.println("Value 481 returns " + isHarshad(481));
        System.out.println("Value 89 returns " + isHarshad(89));
        System.out.println("Value 516 returns " + isHarshad(516));
        System.out.println("Value 200 returns " + isHarshad(200));
    }

    public static boolean isHarshad(int num) {
        if (num%sumDigit(num)==0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumDigit(int num) {
        int sum = 0;
        if (num>=10) {
            int lastDigit = num%10;
            sum += lastDigit + sumDigit((num-lastDigit)/10);
        } else {
            sum += num;
        }
        return sum;
    }

}