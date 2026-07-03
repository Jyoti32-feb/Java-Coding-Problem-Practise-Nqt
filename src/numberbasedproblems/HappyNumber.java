package numberbasedproblems;

import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :  ");
        int number = sc.nextInt();

//        HashSet<Integer> set = new HashSet<>();
//        while(number!=1&&!set.contains(number)){
//            set.add(number);
//            int sum = 0;
//
//            while(number!=0){
//                int digit = number%10;
//                sum+=digit*digit;
//                number=number/10;
//            }
//            number=sum;
//        }
//        if(number==1){
//            System.out.println("The number is Happy Number");
//        }
//        else{
//            System.out.println("The number is not Happy Number");
//        }

        String str=String.valueOf(number);
        int sum=0;
        for(int i=0;i<str.length();i++){
            int digit=str.charAt(i)-'0';
            sum+=(int)Math.pow(digit,i+1);
        }

        if(sum==number){
            System.out.println("The Number is Disarium Number");
        }
        else{
            System.out.println("The Number is not Disarium Number");
        }
    }
}
