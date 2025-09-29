
import java.util.*;
public class array2 {
    public static void main(String [] args){
      
        Scanner sc= new Scanner(System.in);

        System.out.println("enter length of an array");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("enter array elements");
        for(int i=0; i<size; i++){
             arr[i]=sc.nextInt();
        }

        System.out.println("the elements are");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
