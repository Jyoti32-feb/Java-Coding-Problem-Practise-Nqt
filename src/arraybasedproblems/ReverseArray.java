package arraybasedproblems;

import java.util.Arrays;

public class ReverseArray {
    static void main(String[] args) {
//        int []arr={10,20,30,40,50,60,70,80,90,100};
//        int j=arr.length-1;
//        for (int i=0;i<arr.length;i++){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            j--;
//        }
//        System.out.println("The Reverse Array is : "+ Arrays.toString(arr));

        int []num={0,1,0,3,12};
        int read=0;
        int write=0;
        while(read<num.length){
            if(num[read]==0){
                read++;
            }
            else{
                int temp=num[read];
                num[read]=num[write];
                num[write]=temp;
                write++;
                read++;
            }
        }
        System.out.println("After Moving Zeros to the End : "+Arrays.toString(num));
    }
}
