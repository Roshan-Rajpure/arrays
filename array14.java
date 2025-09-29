import java.util.Scanner;
public class array14 {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("enter size of array");
    int size=sc.nextInt();
    
    int arr[]=new int[size];
    System.out.println("enter array elements");
    for(int i=0; i<size; i++){
        arr[i]=sc.nextInt();
    }

    int sum=0;
    for(int i=0; i<size; i++){
        if(i%2!=0){
          sum=sum+arr[i];
        }
    }
    System.out.println("the addation of odd index is"+" "+sum);
   } 
}
