
import java.util.Scanner;
public class array9 {
   
   
   public static void main(String[] args){
     Scanner sc= new Scanner(System.in);

     System.out.println("enter size of array");
     int size=sc.nextInt();

     int arr[]=new int[size];

    System.out.println("enter elements of array");
    
     for(int i=0; i<size; i++){
        arr[i]=sc.nextInt();
     }


     System.out.println(" elements of array are");
     for(int i=0; i<size; i++){
        if(arr[i]%2==0){
            System.out.println(arr[i]+"is odd element and index is "+i);
        }
     }

   }

    
}
