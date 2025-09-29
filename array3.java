import java.util.Scanner;
public class array3 {
    public static void main(String[] args){
       
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter size of array");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("enter array elements");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("the even elements are");
        for(int i=0; i<size; i++){
            if(i%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
