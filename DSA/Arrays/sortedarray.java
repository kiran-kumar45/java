//Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not.
// If the array is sorted then return True, Else return False.
package Arrays;

public class sortedarray {
    public static boolean isSorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
                }
                }
                return true;
                }
                public static void main(String[] args) {
                    int arr[] = {1, 2, 3, 4, 5};
                    System.out.println(isSorted(arr));
                }    
    
}
