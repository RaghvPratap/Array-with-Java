
//move all zeros at the end of the array
import java.util.*;

public class array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count = 0;
        System.out.print("Enter the no. you want to search:");
        int num = sc.nextInt();
        System.out.print("Enter  the nos. of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                arr[n - count] = arr[i];
            }
            count++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }

    }
}