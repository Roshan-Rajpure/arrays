
import java.util.Scanner;
public class array27 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("enter size of square matrix");
    int n = sc.nextInt();  

    int arr[][] = new int[n][n];

    System.out.println("enter array elements");
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            arr[i][j] = sc.nextInt();
        }
    }

    int product = 1;
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if(i + j == n - 1){   
                product = product * arr[i][j];
            }
        }
    }

    System.out.println("the product of secondary diagonal is " + product);
  }  
}
