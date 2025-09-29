import java.util.*;

public class array7 {
    
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("enter size of array");
    int size=sc.nextInt();

    int arr[]=new int[size];

    System.out.println("enter array elemnets");
    for(int i=0; i<size; i++){
        arr[i]=sc.nextInt();
    }

    System.out.println("the elements divisible by 4 are");
    for(int i=0; i<size; i++){
        if(arr[i]%4==0){
            System.out.println(arr[i]);
        }
    }
}


}
