
import java.util.*;
public class array12 {
    public static void main(String[] args){
     
    Scanner sc=new Scanner(System.in);

    System.out.println("enter size of array");
    int size=sc.nextInt();

    System.out.println("enter array elements");
    char arr[]=new char[size];
    for(int i=0; i<size; i++){
        arr[i]=sc.next().charAt(0);
    }

    for(int i=0; i<size; i++){
        if(arr[i]=='A'|| arr[i]=='E'||arr[i]=='I'||arr[i]=='O'
        ||arr[i]=='U'||arr[i]=='a'||arr[i]=='e'||arr[i]=='i'
        ||arr[i]=='o'||arr[i]=='u'){
       
            System.out.println("vowel"+arr[i]+"found at index"+" "+i);
        }
        
    }

    }
}
