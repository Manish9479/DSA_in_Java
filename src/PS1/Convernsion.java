package PS1;

//Input currency in rupees and output in USD

import  java.util.Scanner;

public class Convernsion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide currency in rupee");
        float R = sc.nextInt();

        float D = (float) (R * 0.012f);

        System.out.println("Currency in doller after conversion : " +D + "$");
    }

}
