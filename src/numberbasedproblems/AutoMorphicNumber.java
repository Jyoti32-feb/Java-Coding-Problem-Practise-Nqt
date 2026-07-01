package numberbasedproblems;

import java.util.Scanner;

public class AutoMorphicNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        int nextnum=num+1;

        int root=(int) Math.sqrt(nextnum);
        if(root*root==nextnum){
            System.out.println(num+" is sunny number");
        }
        else{
            System.out.println(num+" is not sunny number");
        }

//        int squareOfNumber=num*num;
//
//        int digit=String.valueOf(num).length();
//
//        int divisior=(int)Math.pow(10,digit);
//
//        if(squareOfNumber%divisior==num){
//            System.out.println(num+" is Automorphic Number");
//        }
//        else{
//            System.out.println(num+" is not Automorphic Number");
//        }
    }
}
