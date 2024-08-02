package DSA.Arrays;

public class Binarysearch {
    public static int  binsearch(int numbers[],int key){

        int start=0,end=numbers.length-1;
        while (start<=end) {

        int mid=(start+end)/2;

        //comparison
        if(numbers[mid]==key){
            return mid;
        }
        if(numbers[mid]<key){//right
            start=mid+1;
        }
        else{
            end=mid-1;//left
        }
    }
    return -1;

} 
public static void main(String[] args) {
    int numbers[]={2,4,6,8,10,12,14};
    int key=10; 
    System.out.println("index for key :" +binsearch(numbers, key));
}
}

//timecomplexity:n/2^k
//whick means n/2^k=1--->n=2^k-->k=log(base2)n  
//thereforetc=O(logn)