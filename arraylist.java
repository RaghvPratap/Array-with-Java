import java.util.*;
//Example of non-generic arraylist. 
public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        int x=(int)arr.get(1);
        System.out.print(x);
        sc.close();
    }
}
