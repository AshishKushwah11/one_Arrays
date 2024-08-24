package Array;

public class Q15 {

    

    public static void main(String[] args) {
        
        int [] arr= {1,2,3,4,5};
        
        int [] arr1 ={6,7,8,9,10};

        int[] ans = new int[arr.length+arr1.length];

        for(int i=0;i<arr.length;i++){
            ans[i]=arr[i];
        }

        for(int i=0;i<arr1.length;i++){
            ans[arr.length+i]=arr1[i];

        }
        for(int i=0;i<ans.length;i++)
            System.out.print(ans[i]+" ");
        
    }
}
    

