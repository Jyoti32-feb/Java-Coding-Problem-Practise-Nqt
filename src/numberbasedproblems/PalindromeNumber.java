package numberbasedproblems;

import java.util.Scanner;

public class PalindromeNumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int originalNumber = num;
        int reversedNumber = 0;
        while(num>0){
            int rest = num % 10;
            reversedNumber = reversedNumber * 10 + rest;
            num = num/10;
        }
        if(originalNumber==reversedNumber){
            System.out.println("The number is a palindrome.");
        }
        else{
            System.out.println("The number is not a palindrome.");
        }
    }
}
