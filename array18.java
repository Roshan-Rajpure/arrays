
import java.util.Scanner;
public class array18 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("enter size of an array");
    int size=sc.nextInt();

    System.out.println("enter elements");
    int arr[]=new int[size];
    for(int i=0; i<size; i++){
        arr[i]=sc.nextInt();
    }

    int min=arr[0];
    for(int i=0; i<size; i++){
        if(arr[i]<min){
            min=arr[i];
        }
    }
    
    System.out.println("the min no is "+" "+min);

  }  
}
