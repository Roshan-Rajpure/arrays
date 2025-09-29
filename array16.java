import java.util.*;
public class array16 {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter size of an array");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("enter array elements");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("the array is ");
       if(size%2==0){
        for(int i=0; i<size; i++){
            System.out.println(arr[i++]);
        }
       }else{
        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }
       }
    }
}
