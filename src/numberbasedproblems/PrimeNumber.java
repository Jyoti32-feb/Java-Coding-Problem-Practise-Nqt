package numberbasedproblems;

import java.util.Scanner;

public class PrimeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n<=1){
            System.out.println("The number is not a prime number.");
        }
        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(n); i++){
            if (n % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("The number is a prime number.");
        }
        else{
            System.out.println("The number is not a prime number.");
        }
    }
}
