// Problem Statement : odd Array 
import java.util.Scanner;
public class Odd {

public static void main (String [] args){

Scanner sc = new Scanner (System.in);


int []arr =new int [5];

for(int a=0; a<5; a++){

arr[a]=sc.nextInt();
}
odds(arr);


}
public static void odds(int []arr){
for(int a=0; a<arr.length;a++){
if(arr[a]%2==1){
System.out.print(arr[a]+" " );
}
}
}
}
