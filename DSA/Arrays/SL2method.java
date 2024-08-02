package Arrays;
import java.util.*;

public class SL2method {
    public static void prit2largest(int arr[]){
        int n=arr.length;
        if(n<2){
            System.out.println("Array should have at least 2 elements");
            return;
        }
        Arrays.sort(arr);
        System.out.println(arr[n-2]);
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,35,34};
        prit2largest(arr);
    }
}
//works only if there is no duplicate