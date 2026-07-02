package numberbasedproblems;

import java.util.Scanner;

public class ArmstrongNumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int originalNumber = number;
        int digitsum=0;
        while(number!=0){
            digitsum+=number%10;
            number/=10;
        }
        if(originalNumber%digitsum==0){
            System.out.println("the number is harshad number ");
        }
        else{
            System.out.println("the number is not harshad number ");
        }
//        int squareOfNumber = number*number;
//        int sum=0;
//        while(squareOfNumber!=0){
//            int rem = squareOfNumber%10;
//            sum = sum+rem;
//            squareOfNumber/=10;
//        }
//        if(sum==number){
//            System.out.println(number+" is neon number");
//        }
//        else{
//            System.out.println(number+" is not neon number");
//        }
//        int originalNumber = number;
//        int sum = 0;
//        while(number!=0){
//            int rem = number % 10;
//            sum = sum + rem * rem*rem;
//            number = number/10;
//        }
//        if(originalNumber==sum){
//            System.out.println("The number is a Armstrong number.");
//        }
//        else{
//            System.out.println("The number is not a Armstrong number.");
//        }
    }
}
