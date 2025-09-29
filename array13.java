import java.util.*;
public class array13 {
  public static void main(String[] args){
   Scanner sc= new Scanner(System.in);

   System.out.println("enter array size");
   int size=sc.nextInt();

   System.out.println("enter array elements");
   int arr[]=new int[size];
   for(int i=0; i<size; i++){
    arr[i]=sc.nextInt();
   }
  
   System.out.println("enter element to find");
   int element=sc.nextInt();

   for(int i=0; i<size; i++){
    if(arr[i]==element){
        System.out.println("the element"+" "+arr[i]+" "+"found at index"+" "+i);
    }
   }

  }  
}
