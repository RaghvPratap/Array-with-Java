//max subarray of size k
public class slidingWindow1 {
   public static void main(String[] args) {
    int[] arr={10,2,6,15,-1,-180,90};
    int k=3;
    int i=0;
    int j=k-1;
    int sum=0;
    int maxSum=0;
    int n=arr.length;
    for(int a=i;a<=j;a++){
        sum+=arr[a];
    }
    i++;
    j++;
    while(j<n){
        sum=sum-arr[i-1]+arr[j];
        maxSum=Math.max(maxSum,sum);
        j++;i++;
    }
   
    System.out.println(maxSum);
   }
}
