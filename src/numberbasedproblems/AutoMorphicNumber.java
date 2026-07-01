package numberbasedproblems;

import java.util.Scanner;

public class AutoMorphicNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        int squareOfNumber=num*num;

        int digit=String.valueOf(num).length();

        int divisior=(int)Math.pow(10,digit);

        if(squareOfNumber%divisior==num){
            System.out.println(num+" is Automorphic Number");
        }
        else{
            System.out.println(num+" is not Automorphic Number");
        }
    }
}
