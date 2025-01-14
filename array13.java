//WAP to print common elements of 2 arrays
//NAME:Raghvendra Pratap Singh
//ROLL NO.2102900100119
//CLASS:2CSB

import java.util.*;

public class array13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first array:");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.print("Enter the elements of the first  array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the second array:");
        int m = sc.nextInt();
        int arr2[] = new int[n];
        System.out.print("Enter the elements of the second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i]);
                }
            }
        }
    }
}
