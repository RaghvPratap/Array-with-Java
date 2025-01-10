//WAP to find sum of elements at even places in an array
//NAME:Raghvendra Pratap Singh
//ROLL NO.2102900100119
//CLASS:2CSB
import java.util.*;

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements int the array:");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The elements at even places in the arrary are:");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i]);
            } else {
            }
        }
    }

}
