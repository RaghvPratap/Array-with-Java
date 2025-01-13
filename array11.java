//WAP to delete an element of an array
//NAME:Raghvendra Pratap Singh
//ROLL NO.2102900100119
//CLASS:2CSB
import java.util.*;

public class array11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.print("Enter the elements if the array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter  the index no. of element you want to delete:");
        int index = sc.nextInt();
        int arr2[] = new int[n - 1];
        for (int i = 0,k=0; i <= n - 1; i++) {
            if (i == index) {
               continue;
            } else {
                arr2[k++]=arr1[i];
            }
        }

        for (

                int i = 0; i < n - 1; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
