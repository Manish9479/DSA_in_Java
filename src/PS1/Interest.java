package PS1;

 //A program to input principal, time, and rate (P, T, R) from the user and ?find Simple Interest

import  java.util.Scanner;

public class Interest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide principal amount");
        float P = sc.nextFloat() ;

        System.out.println("Please provide time period");
        float T = sc.nextFloat();

        System.out.println("Please provide interest rate");
        float R = sc.nextFloat();

        float SI = (P*R*T)/100 ;

        System.out.println("Simple Interest value from above data is  " + SI);
    }

}
