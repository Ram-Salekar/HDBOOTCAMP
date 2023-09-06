// Problem Statement : Speed Conversion
import java.util.Scanner;
public class SpeedConv {
 
 public static void main (String [] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the value in km/h : ");
    float x = sc.nextFloat(); 
    float result =(x*1000)/3600;
    System.out.println("The conversion of speed in M/sec is : "+ result);
}
}

   
