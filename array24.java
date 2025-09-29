import java.util.Scanner;
public class array24 {
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
    for(int i=0; i<rows; i++){
        int sum=0;
        for(int j=0; j<cols; j++){
           sum=sum+arr[j][i];
        }
        if(sum!=0){
        System.out.println("the sum of cols "+(i+1)+" is "+sum);
        }
    }
  }  
}
