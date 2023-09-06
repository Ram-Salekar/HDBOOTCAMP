// Problem Statement : reverse the String 
import java.util.Scanner;
public class ReverseString {
public static void main(String[] args) {
    System.out.println("Entr the String : ");
    Scanner sc = new Scanner(System.in);
    String x = sc.nextLine();
    StringBuilder z = new StringBuilder("");
    for(int a=x.length()-1;a>=0;a--){
        z.append(x.charAt(a));
    }
    System.out.println(z);
}


}