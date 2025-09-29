import java.util.*;

public class array6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter size of an array");
        int size = sc.nextInt();
        sc.nextLine(); // clear buffer

        String arr[] = new String[size];
    
        System.out.println("Enter Strings you want");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextLine();
        }

        System.out.println("Your Strings are: ");
        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }
    }
}
