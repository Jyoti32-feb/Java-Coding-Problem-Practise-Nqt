package numberbasedproblems;

import java.util.Scanner;

public class FibonacciNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        if(n<=1){
            System.out.println("Fibonacci number is "+n);
            return;
        }
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum=a+b;
            a=b;
            b=sum;
        }
        System.out.println("Fibonacci of n :"+sum);
    }
}
