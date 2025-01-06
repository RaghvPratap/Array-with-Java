//WAP to find sum average values of elements of array
//NAME:Raghvendra Pratap Singh
//ROLL NO.2102900100119
//CLASS:2CSB
import java.util.*;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements in the array");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Enter the elements in the array");

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of elements of array is:" + sum);
        System.out.println("The average value of array is:" + (sum/n));
    }
}
