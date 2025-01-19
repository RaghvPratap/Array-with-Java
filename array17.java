import java.util.*;
public class array17 {
    public static void  main(String[] args){
      int[] arr={1,2,2,3,3,4,5};
      int count=0;
      int n=arr.length;
      System.out.println(n);
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
           
            if(arr[i]==arr[j]){
               count++;
              break;
            }
         
      }
    }
    System.out.println(count);
          }
        }