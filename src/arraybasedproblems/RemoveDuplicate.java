package arraybasedproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicate {
    static void main(String[] args) {
        //int []numbers={12,21,3,14,51,11,21,3,4,5,12,11,14};

//        Set<Integer> set=new HashSet<>();
//        for(int i=0;i<numbers.length;i++){
//            set.add(numbers[i]);
//        }
//        int size=set.size();
//        int []numbers2=new int[size];
//        Iterator<Integer> it=set.iterator();
//        int i=0;
//        while(it.hasNext()){
//            numbers2[i]=it.next();
//            i++;
//        }
//        System.out.println("the unique element in the array are : "+ Arrays.toString(numbers2));
//
//        int[] unique = set.stream()
//                .mapToInt(Integer::intValue)
//                .toArray();

//        Arrays.sort(numbers);
//
        int []num={1,1,12,2,3};
        Arrays.sort(num);
        int write=0;
        for(int read=1;read<num.length;read++){
            if(!(num[read]==num[write])){

                write++;

                num[write]=num[read];

            }
        }

        for(int k=0;k<=write;k++){
            System.out.print(num[k]+"  ");
        }
//        int index=0;
//        int uniqueele[]=new int[numbers.length];
//        for(int i=0;i<numbers.length-1;i++){
//            if(numbers[i]!=numbers[i+1]){
//                uniqueele[index++]=numbers[i];
//            }
//        }
//        uniqueele[index++]=numbers[numbers.length-1];
//        for(int i=0;i<index;i++){
//            System.out.print(uniqueele[i]+" ");
//        }
        //System.out.println("unique elements in array:");
//        System.out.println("Duplicate are :");
//        for(int i=0;i<numbers.length;i++){
//            boolean duplicate=false;
//            for(int j=0;j<i;j++){
//                if(numbers[i]==numbers[j]){
//                    duplicate=true;
//                    break;
//                }
//            }
//            if(duplicate){
//                System.out.print(numbers[i]+"  ");
//            }
//        }
    }
}
