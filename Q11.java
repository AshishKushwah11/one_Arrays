package Array;

public class Q11 {

    public static void main(String[] arge){

        int [] arr = {1,2,3,4,5,9};

        int [] ans =new int [arr.length];

        for(int i=0;i<arr.length;i++){
            ans[i]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print (ans[i]+" ");
        }

    }
    
} 
