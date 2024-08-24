package Array;

import java.util.*;

public class Q9 {

    public static void main(String[] args) {
        
        int [] arr = {8,3,6,5,4,7,2,1,9 };

        for(int i=0;i<arr.length;i++){

        Arrays.sort(arr);

            System.out.print(arr[i]+" ");
        }
    }
    
}
