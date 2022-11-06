package Basics;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = (int)(15.54f);
        System.out.println(num);

        int a = 257; // 257%256 = 1
        byte b= (byte) (a);
        System.out.println(b);

        int number = 'A';
        System.out.println(number);

    }
}