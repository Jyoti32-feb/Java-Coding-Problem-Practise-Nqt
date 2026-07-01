package numberbasedproblems;

import java.util.Scanner;

public class PerfectNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("The number is a perfect number.");
        }
        else{
            System.out.println("The number is not a perfect number.");
        }
    }

}
