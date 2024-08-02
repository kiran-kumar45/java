package sorting_algos;

public class SelectionSort {
    public static void ss(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;//intilasing curreny as min pos
            for(int j=i+1;j<arr.length;j++){//j<arr.length or j<=arr.length-1
                if(arr[minPos]>arr[j]){  //for to display arr in dec order jst change arr[minpos]<arr[j]
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        ss(arr);
        printarr(arr);
    }

    
}