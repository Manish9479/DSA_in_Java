package PS1;

//name as input and print a greeting message for that particular name

import  java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your name");
        String name = sc.next();

        System.out.println("Hello "+name);


    }
}
