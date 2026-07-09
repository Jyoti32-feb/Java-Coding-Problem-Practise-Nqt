package arraybasedproblems;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegative {
    static void main(String[] args) {
        int []arr={12,-1,-7,8,-15,30,16,28};
        int k=3;
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<k;i++){
            if(arr[i]<0){
                q.offer(i);
            }
        }
        if (q.isEmpty()) {
            System.out.print(0 + " ");
        } else {
            System.out.print(arr[q.peek()] + " ");
        }

        for(int i=k;i<arr.length;i++) {


            if (!q.isEmpty() && q.peek()<=i-k) {
                q.poll();
            }

            if(arr[i]<0){
                q.offer(i);
            }
            if (q.isEmpty()) {
                System.out.print(0 + " ");
            } else {
                System.out.print(arr[q.peek()] + " ");
            }


        }

//        int left=0;
//        int right=k-1;
//        while(right<arr.length-1){
//            int temp=left;
//            while(left<=right){
//                if(arr[left]<0){
//                    System.out.print(arr[left]+" ");
//                    break;
//                }
//                left++;
//            }
//            left=temp;
//            right++;
//            left++;
//        }
    }
}
