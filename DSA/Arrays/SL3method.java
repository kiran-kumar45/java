package Arrays;
import java.util.*;

public class SL3method {
    public static void prit2largest(int arr[]){
    int n=arr.length;
        if(n<2){
            System.out.println("Array should have at least 2 elements");
            return;
        }
        Arrays.sort(arr);
        int small=arr[1];
        System.out.println("the smallest is"+small);
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){
                System.out.println("the second largeats elements is:"+arr[i]);
                return;
            }
        }
        System.out.println("there is no");

    }
    public static void main(String[] args) {
        int arr[]={1,4,35,35,34};
        prit2largest(arr);
    }
    
}
