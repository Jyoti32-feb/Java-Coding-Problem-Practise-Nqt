package numberbasedproblems;

import java.util.Scanner;

public class Number {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int num=sc.nextInt();

        boolean isduck=false;
        while(num!=0){
            int digit=num%10;
            if(digit==0){
                isduck=true;
                break;
            }
            num=num/10;
        }
        if(isduck){
            System.out.println("The number is duck number");
        }
        else{
            System.out.println("The number is not duck number");
        }


//        int sum=0;
//        int product=1;
//        while(n!=0){
//            sum=sum+(n%10);
//            product=product*(n%10);
//            n=n/10;
//        }
//        if(sum==product){
//            System.out.println("the number is spy number");
//        }
//        else{
//            System.out.println("not a spy number");
//        }
    }
}
