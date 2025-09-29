import java.util.*;
public class array28{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("enter rows");
    int rows=sc.nextInt();

    System.out.println("enter cols");
    int cols=sc.nextInt();

    int arr[][]=new int[rows][cols];

    System.out.println("enter array elemets");
    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            arr[i][j]=sc.nextInt();
        }
    }
   int primary=1;
    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            if(i==j){
             primary=primary*arr[i][j];
            }
        }
    }
    int secondary=1;
     for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            if(i + j == cols - 1){
             secondary=secondary*arr[i][j];
            }
        }
    }
    int product=secondary*primary;
    System.out.println("the product is : "+product);

    }
}