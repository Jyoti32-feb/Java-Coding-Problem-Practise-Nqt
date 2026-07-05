package arraybasedproblems;

import java.util.*;

public class Merge {
    static void main(String[] args) {
//        int arr1 []={1,2,2,3,4};
//        int arr2 []={5,6,6,7};
//        List<Integer> list=new ArrayList<>();
//        int left=0;
//        int right=0;
//        int m=arr1.length;
//        int n=arr2.length;
//
//
//        while(left<m&&right<n){
//            if(arr1[left]<=arr2[right]){
//                list.add(arr1[left]);
//                left++;
//            }
//            else{
//                list.add(arr2[right]);
//                right++;
//            }
//        }
//        while(left<m){
//            list.add(arr1[left]);
//            left++;
//        }
//        while(right<n){
//            list.add(arr2[right]);
//            right++;
//        }
//        int []arr=new int[list.size()];
//        for(int i=0;i<list.size();i++){
//              arr[i]=list.get(i);
//        }
//        System.out.println(Arrays.toString(arr));


//        int arr1 []={1,2,2,3,4};
//        int arr2 []={5,6,6,7};
//        List<Integer> list=new ArrayList<>();
//        int left=0;
//        int right=0;
//        int m=arr1.length;
//        int n=arr2.length;
//
//
//        while(left<m&&right<n){
//            if(arr1[left]<arr2[right]){
//                if(list.isEmpty()||list.get(list.size()-1)!=arr1[left]){
//                list.add(arr1[left]);
//
//            }
//                left++;
//            }
//            else{
//                if(list.isEmpty()||list.get(list.size()-1)!=arr2[right]){
//                    list.add(arr2[right]);
//                }
//                right++;
//
//            }
//        }
//        while(left<m) {
//            if(list.isEmpty()||list.get(list.size()-1)!=arr1[left]){
//                list.add(arr1[left]);
//
//            }
//            left++;
//
//        }
//        while(right<n){
//            if(list.isEmpty()||list.get(list.size()-1)!=arr2[right]){
//                list.add(arr2[right]);
//            }
//            right++;
//        }
//        int []arr=new int[list.size()];
//        Iterator<Integer> iter=list.iterator();
//        int i=0;
//        while(iter.hasNext()){
//            arr[i]=iter.next();
//            i++;
//        }
//        System.out.println(Arrays.toString(arr));

        int arr1 []={1,2,2,3,4};
        int arr2 []={2,3,5,6,6,7};
        List<Integer> list=new ArrayList<>();
        int left=0;
        int right=0;
        int m=arr1.length;
        int n=arr2.length;


        while(left<m&&right<n){
           if(arr1[left]==arr2[right]){
               if(list.isEmpty()||list.get(list.size()-1)!=arr1[left]){
                   list.add(arr1[left]);
               }

               left++;
               right++;
           }
           else if(arr1[left]<arr2[right]){
               left++;
           }
           else{
               right++;

           }
        }

        int []arr=new int[list.size()];
        Iterator<Integer> iter=list.iterator();
        int i=0;
        while(iter.hasNext()){
            arr[i]=iter.next();
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
