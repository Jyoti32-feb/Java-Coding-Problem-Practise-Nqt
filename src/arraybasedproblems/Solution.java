package arraybasedproblems;

class Solution {
    public static int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int left=0;
        int right=0;

        int sum=0;
        int minlength=Integer.MAX_VALUE;

        while(right<n){
            sum+=nums[right];
            while(sum>=target){
                minlength=Math.min(minlength,(right-left+1));
                sum-=nums[left];
                left++;
            }

            right++;


        }
        return (minlength == Integer.MAX_VALUE) ? 0 : minlength;

    }
    public static void main(String []args){
        int []nums={2,3,1,2,4,3};
        int result=minSubArrayLen(7,nums);
        System.out.println(result);
    }
}