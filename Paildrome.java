// Problem Statement : Paildrome
import java.util.Scanner;
public class Paildrome {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the string ");
        String x = sc.next();
        boolean check = true;
        for(int a=0; a<(x.length()/2);a++){
            if(x.charAt(a)!=x.charAt(x.length()-a-1)){
                check=false;
            }
        }
        if(!check){
            System.out.println("Not paildrome");
        }
        else{
            System.out.println("paildrome");
        }
    }

    
}
