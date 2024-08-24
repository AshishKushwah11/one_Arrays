package Array;

// import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {

        int [] arr = {3,2,3,3,6,3,7,2,3};

        int n=3;
        int freq = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){

                freq++;
            }
        }
System.out.println(freq);


    }
}

    
