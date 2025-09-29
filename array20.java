
import java.util.Scanner;
public class array20 {
    public static void main(String[] args){


        Scanner sc= new Scanner(System.in);

        System.out.println("enter rows");
        int rows=sc.nextInt();

        System.out.println("enter cols");
        int cols=sc.nextInt();

        int arr[][]=new int[rows][cols];

        System.out.println("enter 2D arrays elements");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("the 2D array is");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
