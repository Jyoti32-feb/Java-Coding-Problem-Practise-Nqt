package arraybasedproblems;

public class LargestElement {
    static void main(String[] args) {
        int []numbers={1,2,3,4,5};

        int max=Integer.MIN_VALUE;
        for(int n:numbers){
            if(n>max){
                max=n;
            }
        }
        System.out.println("The largest number is :"+max);
    }
}
