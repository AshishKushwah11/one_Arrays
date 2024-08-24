package Array;
public class Main{
    public static void main(String[] arge){
    
        int [] arr = {3,2,3,4,3,2,5};

        int ans = -1;
        int ans1 = -1;

        int n=3;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                ans=i;
                break;
            }
        }
for(int i=arr.length-1;i>=0;i--){
    if(arr[i]==n){
        ans1=i;
        break;
    }
}
System.out.println(ans1);
System.out.println(ans);
    }
}