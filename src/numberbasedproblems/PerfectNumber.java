package numberbasedproblems;

import java.util.Scanner;

public class PerfectNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int n = sc.nextInt();
        int sum = 0;

        int originalnumber = n;

        while (n != 0){
            int rem = n%10;
            int factorial = 1;
            for (int i = 1; i <= rem; i++){
                factorial = factorial * i;

            }
            sum = sum + factorial;
            n = n/10;
        }
        if (sum == originalnumber){
            System.out.println("The number is a strong number");
        }
        else{
            System.out.println("The number is not a strong number");
        }
//        for (int i = 1; i <=n/2; i++) {
//            if(n%i==0){
//                sum+=i;
//            }
//        }
//        if(sum==n){
//            System.out.println("The number is a perfect number.");
//        }
//        else{
//            System.out.println("The number is not a perfect number.");
//        }

    }

}
