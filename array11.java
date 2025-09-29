
import java.util.Scanner;

public class array11 {
   public static void main(String[] args){

   Scanner sc=new Scanner(System.in);

   System.out.println("enter size of array");
   int size=sc.nextInt();

   int arr[]=new int[size];

   System.out.println("enter array elements");
   for(int i=0; i<size; i++){
    arr[i]=sc.nextInt();
   }

   System.out.println("the elements are");
   int sum=0;
   for(int i=0; i<size; i++){
    if(arr[i]%3==0){
        sum=sum+arr[i];
        System.out.println(+arr[i]+" ");
    }
   }
System.out.println(" the sum is"+" "+sum);
   } 
}
