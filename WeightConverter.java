import java.util.Scanner;

public class WeightConverter {

public static void main (String [] args){

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the weight in pounds : ");
  int a = sc.nextInt();
 double kg = (a*453.59)/1000;
 System.out.print(kg);
 
 
}
}

