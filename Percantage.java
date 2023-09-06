// Problem Statement : Percentage Problem
import java.util.Scanner;

public class Percantage{
  
public static int per(int a){
return (a*100)/100;
}



    public static void main (String [] args){
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the name of Student : ");
           String name = sc.next();
           System.out.println("Enter the marks obtain of pcm : ");
           int p=sc.nextInt();
           int c =sc.nextInt();
           int m = sc.nextInt();
           int total=(p+c+m)*100/300;
           System.out.println(name+" got total : "+total);
           System.out.println("in physics got  : "+per(p));
           System.out.println("in chemistry got : "+per(c));
           System.out.println("in maths got : "+per(m));

}
}