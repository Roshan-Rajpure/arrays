import java.util.*;

public class array8 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter size of an array");
        int size=sc.nextInt();

        int arr[]= new int[size];

        System.out.println("enter age of na employes of company");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("the employes age are");
        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }
    }


}
