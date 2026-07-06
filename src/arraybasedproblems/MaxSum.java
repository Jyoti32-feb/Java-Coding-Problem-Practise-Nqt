package arraybasedproblems;

public class MaxSum {
    static void main(String[] args) {
//        int []arr={2,5,1,8,2,9,1};
//        int k=3;
//        int sum=0;
//        for (int i=0;i<k;i++){
//            sum+=arr[i];
//        }
//        int n=arr.length;
//        int left=0;
//        int right=k-1;
//        int maxSum=sum;
//        while(right<n){
//            right++;
//            sum=sum-arr[left]+arr[right];
//            left++;
//            maxSum=Math.max(sum,maxSum);
        int []nums={1,12,-5,-6,50,3};
        int k=4;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];

        }
        double maxAvg=sum;
        int left=0;
        int right=k-1;
        while(right<nums.length-1){
            right++;
            sum=(sum-nums[left])+nums[right];

            left++;
            maxAvg=Math.max(sum,maxAvg);

        }
        System.out.println(maxAvg/k);

    }
}
