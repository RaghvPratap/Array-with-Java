import java.util.*;

public class array19 {
    public static void main(String[] args){
        int k=3;
        int arr[] = {1,2,3,4};
        int i=0;
        
        for(i=3;i>k;i--){
            arr[i] = arr[i-1];
            
        }
        arr[i] = 0;
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
