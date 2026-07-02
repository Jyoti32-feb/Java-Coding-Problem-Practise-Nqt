package arraybasedproblems;

public class LargestElement {
    static void main(String[] args) {
        int []numbers={12,21,3,14,51};

        int min=numbers[0];
        for(int num : numbers){
            if(num<min){
                min=num;
            }
        }
        System.out.println("the smallest number is :"+min);

//        int max=Integer.MIN_VALUE;
//        for(int n:numbers){
//            if(n>max){
//                max=n;
//            }
//        }
//        System.out.println("The largest number is :"+max);
    }
}
