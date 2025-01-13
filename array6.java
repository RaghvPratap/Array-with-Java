import java.util.*;

public class array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int count = 0;
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the no. to count frquency:");
        int num = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        System.out.print(count);
    }
}
