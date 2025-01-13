//WAP to find sum average values of elements at even places of array
//NAME:Raghvendra Pratap Singh
//ROLL NO.2102900100119
//CLASS:2CSB
import java.util.*;

public class array9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.print("The sum of elelemnts at even places is:" + sum);
    }
}
