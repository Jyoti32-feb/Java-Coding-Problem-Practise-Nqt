package arraybasedproblems;

public class GasStation {
    public static void main(String[] args) {
        int[] gas={1,2,3,4,5};
        int []cost={3,4,5,1,2};
        int fuel=0;
        int total=0;
        int start=0;
        int end=0;
        for(int i=0;i<gas.length;i++){
            int diff=gas[i]-cost[i];
            total+=diff;
            fuel+=diff;
            if(fuel<0){
                fuel=0;
                start=i+1;
            }
        }
        if(total<0){
            System.out.println("incomplete journey "+-1);
        }
        else{
            System.out.println("complete journey "+start);
        }
    }
}
