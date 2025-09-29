import java.util.Scanner;
public class array22 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("enter rows");
    int rows=sc.nextInt();

    System.out.println("enter cols");
    int cols=sc.nextInt();

    int arr[][]=new int[rows][cols];
    System.out.println("enter arrays elements");
    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            arr[i][j]=sc.nextInt();
        }
    }
    for(int i=0; i<rows; i++){
        int sum=0;
        for(int j=0; j<cols; j++){
            sum=sum+arr[i][j];
        }
        System.out.print("sumof row "+" "+ (i+1)+" " +" "+sum+" ");
    }


    }
}
