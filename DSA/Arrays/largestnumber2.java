package Arrays;

public class largestnumber2 {
    public static int largest(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
public static void main(String[] args) {
    int arr[]={2,5,1,3,0};
    System.out.println("the largest element in the array is:"+largest(arr));
}
    
}
