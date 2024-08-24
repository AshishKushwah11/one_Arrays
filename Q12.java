package Array;

public class Q12 {

    public static void main(String  args){

        int [] arr = {1,2,3,4,5,6};

        int ans =-1;

        int n =4;

        for(int i=0;i<arr.length;i++){

            if(arr[i] == n){
                ans=i;
                break;

            }
        }
        System.out.println(ans);
    }
    
}
