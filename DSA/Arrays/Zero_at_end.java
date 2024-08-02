package Arrays;

public class Zero_at_end { 
    public static void end(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while(count<arr.length){
            arr[count++]=0;
            }
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
                }
           

    }
    public static void main(String[] args) {
        int arr[]={1,0,2,3,0,5};
        end(arr);
     
        
    }
    
}
