package string;

public class VowelCount {
    static void main(String[] args) {
        String str="abciiidef";
        int count=0;
        int k=3;
        for(int i=0;i<k;i++){
            if(isVowel(str.charAt(i))){
                count++;
            }
        }
        int left=0;
        int right=k-1;
        int maxCount=count;
        while(right<str.length()-1){
            right++;
            if(isVowel(str.charAt(right))){
                count++;
            }
            if(isVowel(str.charAt(left))){
                count--;
            }
            maxCount=Math.max(maxCount,count);
            left++;

        }
        System.out.println(maxCount);

    }
    public static boolean isVowel(char ch) {
        ch=Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}
