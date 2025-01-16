import java.util.*;
public class array15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter the size of array:");
          int n=sc.nextInt();
          int[] arr=new int[n];
          int[] result=new int[n-1];
          System.out.println("Enter the elements of array:");
          for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
          }
          System.out.println("Enter the index no. of the element to be removed:");
          int x=sc.nextInt();
          int index=0;
          for(int i=0;i<n;i++){
            if(arr[i]==x){
               continue;
            }
              result[index]=arr[i];
              //index++;
          }
          System.out.println("The final array is:");
          for(int i=0;i<n-1;i++){
            System.out.println(result[i]);
        }
        System.out.println(result.length);
    }
    
}
