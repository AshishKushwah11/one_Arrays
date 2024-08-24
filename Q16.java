package Array;

public class Q16 {

    public static void main(String[]args){

        int [] arr = {1,2,3,4,4,5,6,7,7};

        int [] ans = new int [arr.length-1];

        int n=2;
        int x=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] !=n){
             
                ans[x] = arr[i];
                x++;

                System.out.print(ans[i]+" ");
            }
        }
    }
    
}
