package numberbasedproblems;

import java.util.Scanner;

public class HcfLcm {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*perfectnumber

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum=0;
        for (int i = 1; i < n/2; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("Number is Perfect Number: "+n);
        }
        else{
            System.out.println("Number is not Perfect Number: "+n);
        }

         */
//        System.out.print("Enter the numbers: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int Lcm=Math.max(a,b);
//        while(true){
//            if(Lcm%a==0&&Lcm%b==0){
//                System.out.println(Lcm);
//                break;
//            }
//            Lcm++;
//        }
//        int hcf=GCD(sc.nextInt(),sc.nextInt());
//        System.out.println("HCF = "+hcf);
    }
    static int GCD(int a,int b){
        if(b==0){
            return a;
        }
        return GCD(b,a%b);
    }
}
