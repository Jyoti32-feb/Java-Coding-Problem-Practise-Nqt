package string;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        int left=0;
        int right=0;
        int length=0;
        int maxlength=0;
        while(right<n){
            if(!map.containsKey(s.charAt(right))){
                map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
                right++;
            }
            else{

                while(map.containsKey(s.charAt(right))){
                    map.remove(s.charAt(left));
                    left++;
                }
                map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
                right++;


            }
            length=right-left;
            maxlength=Math.max(length,maxlength);
        }
        return maxlength;
    }
    public static void main(String []args){
        int length=lengthOfLongestSubstring("abcabcbb");
        System.out.println(length);
    }
}