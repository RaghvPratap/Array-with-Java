//WAP to insert an element of an array
//NAME:Raghvendra Pratap Singh
//ROLL NO.2102900100119
//CLASS:2CSB
import java.util.*;
public class array12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.print("Enter the elements if the array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the index value where you want to enter an element:");
        int index=sc.nextInt();
        System.out.print("Enter the element you want to add:");
        int temp=sc.nextInt();
        int arr2[]=new int[n+1];
        for(int i=0,k=0;i<n+1;i++,k++){
            if(k==index){
                arr2[k]=temp;
            }else if(k<index){
                arr2[k]=arr1[i];
            }else{
                arr2[k]=arr1[i-1];
            }
        }
        for(int i=0;i<n+1;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
