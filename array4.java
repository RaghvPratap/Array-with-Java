//WAP to print the reverse of elements of  an array
//NAME:Raghvendra Pratap Singh
//ROLL NO.2102900100119
//CLASS:2CSB

import java.util.*;

public class array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements in the arrary:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array in reverse order will be:");
        for (int i = (n - 1); i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

}
