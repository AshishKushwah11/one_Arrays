//  22. Write a program to count the number of even elements in an integer array.
package Array;

public class Q22 {
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        
          int count = 0;
        //   int k =3;

          for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                count++;
            }
          }
System.out.println(count);
    }
}
