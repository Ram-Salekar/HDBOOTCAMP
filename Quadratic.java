// problem statement Quadratic equation
import java.util.Scanner;
import java.lang.Math;
public class Quadratic {
 public static void main (String [] args){
       Scanner sc = new Scanner(System.in);
    System.out.println("Enter the equation : ");
    float a,b,c;
   a=sc.nextFloat();
   c=sc.nextFloat();
   b=sc.nextFloat();
   
  double delta = Math.sqrt((b*b)-(4*a*c));
  double ans1 = (-b+(delta))/2*a;
  double ans2 = (-b-(delta))/2*a;

System.out.println("The two Roots are : "+ans1+" "+ans2);
}
}
   

