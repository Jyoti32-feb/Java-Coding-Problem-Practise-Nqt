package arraybasedproblems;

import java.util.HashMap;
import java.util.Map;

public class UniqueElement {
    static void main(String[] args) {
        int []arr={1,2,1,3,4,2,3};
        Map<Integer,Integer> map=new HashMap<>();
        int k=4;
        for(int i=0;i<k;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        System.out.print(map.size()+" ");
        int left=0;
        int right=k-1;
        while(right<arr.length-1){
            right++;
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            if(map.containsKey(arr[left])){
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left])==0){
                    map.remove(arr[left]);
                }
            }
            System.out.print(map.size()+" ");
            left++;
        }
    }
}
