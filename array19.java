import java.util.*;
public class array19 {
   public static void main(String[] args){

   Scanner sc= new Scanner(System.in);

   System.out.println("enter array size");
   int size=sc.nextInt();

   int arr[]= new int[size];
   System.out.println("enter array elements ");
   for(int i=0; i<size; i++){
    arr[i]=sc.nextInt();
   }

   int max=arr[0];
   for(int i=0; i<size; i++){
      if(arr[i]>arr[0]){
        max=arr[i];
      }
   }
   System.out.println("the max element is"+" "+max);

   } 
}
