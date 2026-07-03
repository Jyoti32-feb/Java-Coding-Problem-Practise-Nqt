package numberbasedproblems;

import java.util.Scanner;

public class PrimeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :  " );

        int n = sc.nextInt();

        int original = n;

        int reverseNumber = 0;

        if (isPrime(original)) {

            while (n != 0) {

                int digit = n % 10;

                reverseNumber = reverseNumber * 10 + digit;

                n /= 10;
            }

            if (isPrime(reverseNumber) && original != reverseNumber) {

                System.out.println("The Number is Emirp Number");

            } else {

                System.out.println("The Number is not Emirp Number");

            }

        } else {

            System.out.println("The Number is not Emirp Number");

        }
//        if(isPrime){
//            System.out.println("The number is a prime number.");
//        }
//        else{
//            System.out.println("The number is not a prime number.");
//        }
    }
    public static boolean isPrime(int number){
        if(number<=1){
            System.out.println("The number is not a prime number.");
        }
        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(number); i++){
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
