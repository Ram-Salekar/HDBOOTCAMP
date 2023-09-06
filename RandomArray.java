// Problem Statement : Random Array of Given Bound 
import java.util.Scanner;
import java.util.Random;

public class RandomArray {
 public static void  main (String [] args){
  Scanner sc = new Scanner(System.in);
  Random r = new Random();
  System.out.println("Enter the size of array : ");
  int size = sc.nextInt();
  int [] arr = new int [size];
     for(int a=0; a<size; a++){
   arr[a]=r.nextInt(500,1000);
  }
System.out.println("The array is : ");
    for(int a=0; a<size; a++){
   System.out.print(arr[a]+" ");
}
}
}
