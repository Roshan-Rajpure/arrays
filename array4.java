
import java.util.*;
public class array4 {
    
public static void main(String[] args){
    Scanner sc=new Scanner(System. in);

    System.out.println("enter array size");
    int size=sc.nextInt();

    int arr[]=new int[size];

    System.out.println("enter array elements");
    for(int i=0; i<size; i++){
        arr[i]=sc.nextInt();
    }

    System.out.println("the addition of ood sum is");
    int sum=0;
    for(int i=0; i<size; i++){
        if(arr[i]%2==0){
            sum=sum+arr[i];
        }
    }
    System.out.println(sum);
}

}
