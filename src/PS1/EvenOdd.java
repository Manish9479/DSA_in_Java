package PS1;

//A program to print whether a number is even or odd, also take
import  java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Please provide number to check");
        int num = sc.nextInt();

        if (num%2 ==0){
            System.out.println("Given number is Even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
