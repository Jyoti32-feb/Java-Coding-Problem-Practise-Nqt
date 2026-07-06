package arraybasedproblems;

public class MaxSum {
    static void main(String[] args) {
        int []arr={2,5,1,8,2,9,1};
        int k=3;
        int sum=0;
        for (int i=0;i<k;i++){
            sum+=arr[i];
        }
        int n=arr.length;
        int left=0;
        int right=k-1;
        int maxSum=sum;
        while(right<n){
            right++;
            sum=sum-arr[left]+arr[right];
            left++;
            maxSum=Math.max(sum,maxSum);


        }
        System.out.println(maxSum);
    }
}
