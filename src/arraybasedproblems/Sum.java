package arraybasedproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum{
    public static void main(String[] args) {
        int []arr={1,0,-1,0,-2,2};
        Arrays.sort(arr);
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<arr.length-3;i++){
            if(i>0&&arr[i-1]==arr[i]){
                continue;
            }
            for(int j=i+1;j<arr.length-2;j++){
                if(j>i+1&&arr[j-1]==arr[j]){
                    continue;
                }
                int left=j+1;
                int right=arr.length-1;
                while(left<right){
                    int sum=arr[i]+arr[j]+arr[left]+arr[right];
                    if(sum==0){
                        list.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                        while(left<right&&arr[left]==arr[left+1]){
                            left++;
                        }
                        while(left<right&&arr[right]==arr[right-1]){
                            right--;
                        }
                        left++;
                        right--;
                    }
                    else if(sum>0){
                        right--;
                    }
                    else{
                        left++;
                    }
                }

            }
        }

//        for(int i=0;i<arr.length;i++){
//            if(i>0&&arr[i]==arr[i-1]){
//                continue;
//            }
//            int left=i+1;
//            int right=arr.length-1;
//            int target=-arr[i];
//            while(left<right){
//                if(arr[left]+arr[right]==target){
//                    list.add(Arrays.asList(arr[i],arr[left],arr[right]));
//                    right--;
//                    left++;
//
//                    while(left<right&&arr[left]==arr[left+1]){
//                        left++;
//                    }
//                    while(left<right&&arr[right]==arr[right-1]){
//                        right--;
//                    }
//                } else if (arr[left]+arr[right]<target) {
//                    left++;
//
//                }
//                else {
//                    right--;
//                }
//            }
//        }
        System.out.println(list);
    }
}

