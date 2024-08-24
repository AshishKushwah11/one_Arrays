package Array;

public class Q7 {

 public static void main(String[] args) {
    
    int [] arr = {1,2,3,4,5,6,7,8,9,0,43,58,89};

    int max = Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){

        if(max<arr[i]){
            max= arr[i];
        }


        
    }
    System.out.print(max);

 }   
    
}
