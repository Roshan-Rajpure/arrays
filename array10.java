import java.util.Scanner;

public class array10 {
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
   int count=0;
   for(int i=0; i<size; i++){
    if(arr[i]%2!=0){
        count++;
        System.out.print(+arr[i]+" ");
    }
   }
System.out.println(" the count is"+" "+count);
   } 
}
