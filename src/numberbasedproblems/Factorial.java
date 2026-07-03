package numberbasedproblems;

import java.util.Scanner;

public class Factorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNumber = num;

        int sum = 0;
        while(num!=0){
            int digit=num%10;
            int fact = 1;
            for (int i = 1; i <= digit; i++){
                fact = fact * i;
            }
            sum = sum + fact;
            num=num/10;
        }
        if(originalNumber==sum){
            System.out.println("The number is Peterson Number");
        }
        else{
            System.out.println("The number is not Peterson Number");
        }


//        for (int i = 1; i <= n; i++){
//            fact = fact * i;
//        }
//        System.out.println("The factorial of "+n+" is "+fact);
    }
}
