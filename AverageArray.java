import java.util.Random;


public class AverageArray{
 public static void main (String [] args){
 Random r = new Random();
  int [] arr = new int [75];
  for(int a=0; a<75; a++){
   arr[a]=r.nextInt(0,100);
}
int sum=0;
System.out.println("The Array is : ");
for(int a=0; a<75; a++){
System.out.print(arr[a]+" ");
sum+=arr[a];
}
System.out.println();
System.out.println(" The sum of array element is : "+sum);
System.out.println("The average of array is : "+(sum/75));
}
}

