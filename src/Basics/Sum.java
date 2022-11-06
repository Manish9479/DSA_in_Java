package Basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Plaese provide two numbers to sum :- ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b ;

        System.out.print("Sum of given two number is "   +sum );
    }
}
