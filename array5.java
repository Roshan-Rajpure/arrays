import java.util.*;

public class array5 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("enter array size");
    int size=sc.nextInt();

    int arr[]=new int[size];
    System.out.println("enter array elements ");
    for(int i=0; i<size; i++){
        arr[i]=sc.nextInt();
    }

   System.out.println("the less than 10 elements are");
    for(int i=0; i<size; i++){
        if(arr[i]<=10){
            System.out.println(arr[i]);
        }
    }
}
    
}
