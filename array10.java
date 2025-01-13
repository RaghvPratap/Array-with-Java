//WAP to find an element at any index value of an array
//NAME:Raghvendra Pratap Singh
//ROLL NO.2102900100119
//CLASS:2CSB
import java.util.*;
public class array10 {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array:");
         int n=sc.nextInt();
        int arr[]=new int[n]; 
        System.out.print("Enter the elements if the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter  the element you want to find:");
        int find=sc.nextInt();
        for(int i=0;i<n;i++){
            if(find==arr[i]){
                System.out.print("The required index no. is:"+i);
            }
        }
    }
}
