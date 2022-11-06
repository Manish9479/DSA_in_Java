package PS1;

//Take 2 numbers as input and print the largest number

import  java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide two number to find largest");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b){
            System.out.println("Number 1 is lartgest with value " +a);
        }
        else {
            System.out.println("Number b is lartgest with value " +b);
        }
    }
}
