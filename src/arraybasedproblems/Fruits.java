package arraybasedproblems;

import java.util.HashMap;

public class Fruits {

        public static int totalFruit(int[] fruits) {
            int basket=2;
            int n=fruits.length;
            int left=0;
            int right=0;
            HashMap<Integer,Integer> map=new HashMap<>();
            int maxlength=0;

            while(right<n){
                map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);

                while(map.size()>basket){
                    map.put(fruits[left],map.get(fruits[left])-1);
                    if(map.get(fruits[left])==0){
                        map.remove(fruits[left]);
                    }
                    left++;

                }
                maxlength=Math.max(maxlength,right-left+1);
                right++;

            }
            return maxlength;

        }
        public static void main(String []args){
            int []fruits={1,2,1};
            int result=totalFruit(fruits);
            System.out.println(result);
        }
    }

