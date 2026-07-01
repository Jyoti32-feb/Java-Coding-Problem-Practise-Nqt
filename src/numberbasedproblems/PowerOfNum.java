package numberbasedproblems;

import java.util.Scanner;

public class PowerOfNum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.print("Enter a Power: ");
        int power = input.nextInt();

        int powerofnum=1;

        for(int i=1;i<=power;i++){
            powerofnum=powerofnum*num;
        }
        System.out.println("Power Of a Number Is :"+powerofnum);
    }
}
