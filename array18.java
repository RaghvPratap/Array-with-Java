import java.io.*;
 class array18 {
    static private int secondsmallest(int[] arr,int n){
        if(n<2){
            System.out.println("Invalid");
        }
        int small=Integer.MAX_VALUE;
        int secondsmall=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<small){
                secondsmall=small;
                small=arr[i];
            }else if(arr[i]<secondsmall && arr[i]!=small){
                secondsmall=arr[i];
            }
        }
        return secondsmall;
    }
    static private int secondlargest(int[] arr,int n){
        if(n<2){
            System.out.println("Invalid");
        }
        int large=Integer.MIN_VALUE;
        int secondlarge=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>large){
                secondlarge=large;
                large=arr[i];
            }else if(arr[i]>secondlarge && arr[i]!=large){
                secondlarge=arr[i];
            }
        }
        return secondlarge;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int n=arr.length;
           int sS=secondsmallest(arr, n);
           int sL=secondlargest(arr, n);
        System.out.println("Secondsmallest:"+sS);
        System.out.println("Secondlargest:"+sL);
    }

}
