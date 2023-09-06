import java.util.Scanner;
import java.lang.Math;
public class TimeConv{


public static void main (String [] args ){

Scanner sc = new Scanner (System.in);

System.out.println("Enter the time in Seconds : ");

int a = sc.nextInt();

int hour = a/3600;
int rse=a%3600;

int min = rse/60;
int sec =rse%60;
System.out.println(hour+" Hours "+min+" Min "+sec+" Seconds");





}
}

