package Array;

// 20. Find the second max in an array 

public class Q20 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6 };

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                smax = max;
                max = arr[i];
            } else if (max < arr[i]) {
                smax = arr[i];
            }
        }
        System.out.println(max + " " + smax);
    }
}