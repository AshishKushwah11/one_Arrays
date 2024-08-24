package Array;

public class Q10 {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int[] rev = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            rev[arr.length - 1 - i] = arr[i];

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(rev[i] + " ");
        }
    }

}
