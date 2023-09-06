// // Problem Statement : Odd random Array Element 
import java.util.Random;

public class OddRandom {
 public static void main(String [] args){
 
Random r = new Random();

int [] arr = new int [10];

for(int a=0; a<10;a++){
arr[a]=r.nextInt(100);

}

for(int a : arr){
if(a%2!=0){
System.out.print(a+" ");
}

}

}
}




