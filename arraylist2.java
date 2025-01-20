import java.util.*;

public class arraylist2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        arr.add("hello");
        arr.add("world");
        arr.add("abesit");
        // arr.remove("hello");
        // System.out.println(arr.subList(0, 1));
        // System.out.println(arr.contains("world"));
        // System.out.println(arr.indexOf("abesit"));
        // System.out.println(arr.size());
        for(String str:arr){
            System.out.print(str+" ");
        }
        sc.close();
    }
}
