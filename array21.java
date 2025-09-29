import java.util.*;
public class array21 {
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("enter rows");
    int rows=sc.nextInt();

    System.out.println("enter cols");
    int cols=sc.nextInt();

    int arr[][]=new int[rows][cols];

    System.out.println("enter array elements");
    for(int i=0; i<rows; i++){
      for(int j=0; j<cols; j++){
        arr[i][j]=sc.nextInt();
      }
    }
    System.out.println("the array is ");
    int sum=0;
    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            System.out.print(arr[i][j]+" ");
            sum=sum+arr[i][j];
        }
        System.out.println();
    }
    System.out.println("the sum is "+" "+sum);
 }   
}
